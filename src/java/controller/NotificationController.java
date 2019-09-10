
package controller;

import entity.Customer;
import entity.CustomerOrder;
import java.io.Serializable;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import session.CustomerOrderFacade;
import session.EmailSender;
import session.OrderManager;
import session.PDFCreator;
import session.ProductFacade;



/**
 *
 * @author Szczominik
 */
@ViewScoped
@Named
public class NotificationController implements Serializable {
    @EJB 
     private EmailSender emailSender;
    @EJB 
     private PDFCreator creator;
    @EJB
    private OrderManager orderManager;
    @EJB
    private CustomerOrderFacade customerOrderFacade;
  
    @EJB
    private ProductFacade productFacade;

    public NotificationController() {
    }
        

public String getEmail(int orderId){

        CustomerOrder order = customerOrderFacade.find(orderId);  //find
        Customer customer = order.getCustomerId();
        return customer.getEmail();
}


public ArrayList<String> getOrderDetails(int orderId) {
        ArrayList<String> orderMap = orderManager.getOrderDetails(orderId);
        return orderMap;

}


  public void send(int orderId){
       
        ArrayList<String> orderDetails= this.getOrderDetails(orderId);
        String user = orderDetails.get(1);
        String pdfFileName=user+".pdf";

         try{
        PDFCreator.createPdf(user, orderDetails, pdfFileName);
        EmailSender.sendEmail(getEmail(orderId),pdfFileName );
       }
         catch(Exception e){e.printStackTrace();}
            }
             
}
        
        
  

      
