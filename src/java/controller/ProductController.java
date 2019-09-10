package controller;


import entity.Product;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import session.OrderManager;
import session.ProductFacade;

/**
 *
 * @author Szczominik
 */
@SessionScoped
@Named("productController")
public class ProductController implements Serializable{
    
    @EJB
    private OrderManager orderManager;
    @EJB
    private ProductFacade productFacade;
  
    
    private Product product;

    private String categoryName;
    private String name="";
    private BigDecimal price=null;
    private String desc="";
  
   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
          public void addProduct(){
         orderManager.addProduct(categoryName,name,price, desc)  ;}
        
      

    
    public ProductController() {}
        
     public synchronized String updateName(Product pr){
        
        if (!name.equals("")){
          
            try{
            pr.setName(name);
            productFacade.edit(pr);
            wait(1000);
            name="";
                return ("updPro");
            } catch (InterruptedException ex) {
                Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        name="";
        
        return ("updPro");
        
     
    }
    
    public synchronized String updateDesc(Product pr){
        
        if (!desc.equals("")){
            try{
            pr.setDescription(desc);
            productFacade.edit(pr);
            wait(1000);
            desc="";
                return ("updPro");
            } catch (InterruptedException ex) {
                Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        desc="";
        
        return ("updPro");
        
     
    }
    
    public synchronized String updatePrice(Product pr){
        
        if (price!=null){
            
            try{
            pr.setPrice(price);
            productFacade.edit(pr);
            wait(1000);
            price=null;
                return ("updPro");
            } catch (InterruptedException ex) {
                Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        price=null;
        
        return ("updPro");
        }
 public String DeleteProduct(Product p){
        productFacade.remove(p);
        return ("updPro");
    }
   

}
    

