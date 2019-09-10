package session;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import javax.ejb.Stateless;

/**
 *
 * @author Szczominik
 */
@Stateless

public class PDFCreator {
    public static boolean createPdf(String user, ArrayList<String> orderDetails, String fileName) {
		
		long DAY_IN_MS = 1000 * 60 * 60 * 24;
		Date orderDate = new Date();
		Date deliveryDate = new Date(orderDate.getTime() + (2 * DAY_IN_MS));
		Document document = new Document();
		 
        try {
            PdfWriter.getInstance(document,
                new FileOutputStream(fileName));
            document.open();
            document.add(new Paragraph("\nNazwisko: "+user));
            document.add(new Paragraph("Data zamowienia: "+orderDate.toString()));
            document.add(new Paragraph("Data dostarczenia: "+deliveryDate.toString()));
            document.add(new Paragraph("Nazwisko:"+orderDetails.get(1)));
            document.add(new Paragraph("Wartosc zamowienia:"+orderDetails.get(3)));
            document.add(new Paragraph("Zamowiono:"+orderDetails.get(5)));
            document.close(); 		
            return true;
        } catch (DocumentException e) {
            e.printStackTrace(); return false;
        } catch (FileNotFoundException e) {
            e.printStackTrace(); return false;
        }
	}
}
