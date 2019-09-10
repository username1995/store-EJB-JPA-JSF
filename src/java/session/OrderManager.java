
package session;

import cart.ShoppingCart;
import cart.ShoppingCartItem;
import entity.Category;
import entity.Customer;
import entity.CustomerOrder;
import entity.OrderedProduct;
import entity.OrderedProductPK;
import entity.Product;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Klasa odpowiada za zarządzanie zamowieniami
 * @author Szczominik
 */
//@EJB(name="MyEjb", beanInterface=java.lang.Object.class)
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class OrderManager {

    @PersistenceContext(unitName = "DakakeenPU")
    private EntityManager em;
    @Resource
    private SessionContext context;
   
    @EJB
    private ProductFacade productFacade;
    @EJB
    private CustomerOrderFacade customerOrderFacade;
    @EJB
    private OrderedProductFacade orderedProductFacade;
     @EJB
    private CategoryFacade categoryFacade;
    private List<Category> cats;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
   
   /**Dodaje zamowienie 
    * @param customer klient
    * @param cart koszyk
    */
    public int placeOrder(Customer customer, ShoppingCart cart) {

        try {
     
            CustomerOrder order = addOrder(customer, cart);
            addOrderedItems(order, cart);
            return order.getConfirmationNumber();
        } catch (Exception e) {
            context.setRollbackOnly();
            e.printStackTrace();
            return 0;
        }
    }
/**
 * Dodawanie nowego klienta/rejestracja
 * @param name imie
 * @param email email
 * @param phone telefon
 * @param address adres
 * @param cityRegion miasto/miesjcowosc
 * @param ccNumber numer karty kredytowej
 * @param password haslo
 * @return obiekt klienta
 */
    public Customer addCustomer(String name, String email, String phone, String address, String cityRegion, String ccNumber , String password ) {

        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customer.setPhone(phone);
        customer.setAddress(address);
        customer.setCityRegion(cityRegion);
        customer.setCcNumber(ccNumber);
        customer.setPassword(password);
        
        em.persist(customer);
        return customer;
    }
/**
 * Tworzy w bazie danych kto kiedy zamowil dany produkt
 * @param  klient skladajacy zamowienie
 * @param cart koszyk
 * @return zamowienie
 */
    private CustomerOrder addOrder(Customer customer, ShoppingCart cart) {

        // ustawianie zamowienia klienta
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId(customer);
        System.out.println(cart.getTotal());
        order.setAmount(BigDecimal.valueOf(cart.getTotal()));

        // stworz numer weryfikacyjny
        Random random = new Random();
        int i = random.nextInt(999999999);
        order.setConfirmationNumber(i);

        order.setDateCreated(new Date());
        em.persist(order);
        return order;
    }
/**
 * Tworzy w bazie danych jaki produkt, kto i jaka ilosc zamowil
 * @param order zamowienie klienta
 * @param cart koszyk
 */
    private void addOrderedItems(CustomerOrder order, ShoppingCart cart) {

        em.flush();

        List<ShoppingCartItem> items = cart.getItems();

        // iteruje przez koszyk i dodaje w nim elementy znajdujace sie do zamowienia
        for (ShoppingCartItem scItem : items) {

            int productId = scItem.getProduct().getId();

            // set up primary key object
            OrderedProductPK orderedProductPK = new OrderedProductPK();
            orderedProductPK.setCustomerOrderId(order.getId());
            orderedProductPK.setProductId(productId);

            // create ordered item using PK object
            OrderedProduct orderedItem = new OrderedProduct(orderedProductPK);

            // ustawia ilosc
            orderedItem.setQuantity(scItem.getQuantity());

            em.persist(orderedItem);
        }
    }
/**
 * Detale o zamowieniu wykorzystywane do generowania pdfa wysylanego do klienta z potwierdzeniem zamowienia 
 * @param orderId numer zamowienia klienta
 * @return tablica ze szczególamu dotyczacymi zamowienia
 */
    public ArrayList<String> getOrderDetails(int orderId) {

     //   Map orderMap = new HashMap();
      //  List<OrderedProduct> spes=new ArrayList<OrderedProduct>();
        List<String> productsToPrint=new ArrayList<String>();
        ArrayList<String> basicClientInfo=new ArrayList<String>();
        List<String> orderDetails=new ArrayList<String>();
        // zwroc zamowienie na podstawie id
        CustomerOrder order = customerOrderFacade.find(orderId);

        // zwroc dane o kliencie
         Customer customer = order.getCustomerId();
      
       
        basicClientInfo.add("dane o kliencie:");
        basicClientInfo.add( customer.getName() );  ////////////////////////////////////////kto
        
        basicClientInfo.add("wartosc zamowienia");
        
       basicClientInfo.add( String.valueOf(order.getAmount()));
    
    
          //zwroc wszystkie produkty zamowione przez danego klienta
         basicClientInfo.add("dane o produkcie:");
          for (OrderedProduct co:orderedProductFacade.findAll()){
           if (co.getCustomerOrder().getId()==orderId)       /////////////////////////////////co
            
               basicClientInfo.add(co.getProduct().getName() ); 

        
    
        
    }return basicClientInfo;
    }
/**
 * Dodaje nową kategorie
 * @param name nazwa kategorii
 */
  
      public void addCategory(String name) {
       Category category = new Category();
       category.setName(name);
            System.out.println(category);
       em.persist(category);
      }
      
       public void addProduct(String categoryName, String name, BigDecimal price, String description) {
       
    
        Product product = new Product();
       product.setName(name);
       product.setPrice(price);
       product.setDescription(description);
       System.out.println(categoryName);
       cats=categoryFacade.findAll();
      
        for (Category c: cats){
            if (c.getName().equalsIgnoreCase(categoryName)){
                product.setCategoryId(c);
                break;
            }
        }

        em.persist(product);   

       
    }
      

}