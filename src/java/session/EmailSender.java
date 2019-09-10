
package session;


import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.ejb.Stateless;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * 
 *
 * @author JA
 */
@Stateless
public class EmailSender {

    public EmailSender() {
      
    }

  
       // Or by injection.
    //    @Resource(name = "mail/mail")
     //   private Session session;

        
public static void sendEmail(String toEmail,String attachment) {
			
			String fromEmail = "javaeeproject75@gmail.com";
			String userName = "javaeeproject75";
			String password = "QAZWSXQAZWSX";
			String subject = "Potwierdzenie zamowienia";
			System.getProperty("line.separator");
			String message = new StringBuilder()
			           .append("Drogi kliencie,\r")
			           .append("Otrzymalismy twoje zamowien, czego potwierdzeniem jest ten email\r")
			           .append("W ciagu 48h oczekuj na kuriera z Twoim zamowieniem\r")
			           .append("Dziekujemy za zakupy u nas,\r")
			           .append("Sklep z czesciami samochodowymi")
			           .toString();
			try{
			Properties properties = System.getProperties();
			properties.put("mail.smtp.host", "gsmtp.gmail.com");
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.port", "587");
			properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			properties.put("mail.smtp.socketFactory.port", "587");
			properties.put("mail.smtp.socketFactory.fallback", "false");
                        properties.put("mail.smtp.starttls.enable", "true");
		//	
			
			Session mailSession = Session.getDefaultInstance(properties, null);
			mailSession.setDebug(true);
			Message mailMessage = new MimeMessage(mailSession);
			mailMessage.setFrom(new InternetAddress(fromEmail));
			mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			
			//mailMessage.setContent(message,"text/html");
			// Create the message part
	        BodyPart messageBodyPart = new MimeBodyPart();

	        // Now set the actual message
	        messageBodyPart.setText(message);

	        // Create a multi-part message
	        Multipart multipart = new MimeMultipart();

	        // Set text message part
	        multipart.addBodyPart(messageBodyPart);

	        // Part two is attachment
	        messageBodyPart = new MimeBodyPart();
	        //String filename = "E:\\MyPDFSample.pdf";
	        DataSource source = new FileDataSource(attachment);
	        messageBodyPart.setDataHandler(new DataHandler(source));
	        messageBodyPart.setFileName(attachment);
	        multipart.addBodyPart(messageBodyPart);

	        // Send the complete message parts
	        mailMessage.setContent(multipart);
			mailMessage.setSubject(subject);
			Transport transport = mailSession.getTransport("smtp");
			transport.connect("smtp.gmail.com",userName, password);
			transport.sendMessage(mailMessage, mailMessage.getAllRecipients());
			} 
			catch (Exception e) {e.printStackTrace();}	
	    }

}
    




