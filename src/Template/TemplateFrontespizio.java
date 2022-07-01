/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.ICC_Profile;
import com.itextpdf.text.pdf.PdfArray;
import com.itextpdf.text.pdf.PdfBoolean;
import com.itextpdf.text.pdf.PdfDictionary;
import com.itextpdf.text.pdf.PdfICCBased;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfString;
import com.itextpdf.text.pdf.PdfWriter;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.xhtmlrenderer.pdf.ITextRenderer;


import org.xhtmlrenderer.pdf.PDFCreationListener;

/**
 *
 * @author andrea
 */
public class TemplateFrontespizio {
          
        
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, DocumentException, IOException, TemplateException {
        // TODO code application logic here
        Configuration cfg = new Configuration();
        cfg.setDirectoryForTemplateLoading(new File("."));
        cfg.setObjectWrapper(new DefaultObjectWrapper());
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
        cfg.setIncompatibleImprovements(new Version(2, 3, 20));

        Map dataroot = new HashMap();
       
        dataroot.put("resourcePath","");
        
        dataroot.put("applicazione","verba");        
        
        dataroot.put("logo","s_orsola");        
        
        dataroot.put("tipo_frontespizio", "LETTERA");
        dataroot.put("azienda", "codice azienda");
        dataroot.put("registro", "protocollo generale");
        dataroot.put("numero", "0000011 / 2014");
        dataroot.put("data", "07/01/2014 16:31");
        //dataroot.put("oggetto", "test peccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");        
        dataroot.put("oggetto", "PROVVEDIMENTI DERIVANTI DA ATTIVITA' LIBERO-PROFESSIONALE INTRAMURARIA INDIVIDUALE E DI EQUIPE, \n" +
"CONSULENZE AD ENTI PUBBLICI E AD AZIENDE SANITARIE R.E.R., PRESTAZIONI OCCASIONALI E PERIZIE, EFFETTUATE\n" +
"DA DIRIGENTI MEDICI, VETERINARI E SANITARI A RAPPORTO ESCLUSIVO - LIQUIDAZIONE CON EMOLUMENTI STIPENDIALI\n" +
"DEL MESE DI DICEMBRE 2014");
        dataroot.put("firmatario", "Paolo Mosna <br/>\n" +
"Pinco Pallo <br/>\n" +
"Tizio Caio <br/>");
        
        dataroot.put("movimentazione","out");
        
        
        dataroot.put("unita_dirigente", "Uoc Sistemi Informativi E Telecomunicazioni [unita_dirigente]");   
        
        dataroot.put("fascicolo", "<ul>\n" +
"  <li>Coffee</li>\n" +
"  <li>Tea</li>\n" +
"  <li>Milk</li>\n" +
"</ul>");    
        
      
      //  dataroot.put("classificazione", "");   
      
               dataroot.put("destinatario","<ul>\n"+
                       "<li> prova1 </li>\n" +
"<li> prova2 </li>\n" +
"<li> prova3 </li>"+
"</ul>"); 
        
        
        dataroot.put("impronta","<tr>	\n" +
                                    "	<td>	\n" +
                                    "		PG0001003_2013_FILE1.JPGGGGGGGGGGGGGGGGGGGGGGGGGGG \n" +
                                    "	</td>\n" +
                                    "	<td>		\n" +
                                    "		94029ABE182880437BA99EF580437BA99EF584975E65D93BF2DCD8A7\n" +
                                    "	</td>               "+ 
        "</tr> \n"+
        "<tr>	\n" +
                                    "	<td>	\n" +
                                    "		PG0001003_2013_FILE1.JP\n" +
                                    "	</td>\n" +
                                    "	<td>		\n" +
                                    "		94029ABE182880437BA9\n" +
                                    "	</td>               "+ 
        "</tr> \n"+
                "<tr>	\n" +
                                    "	<td>	\n" +
                                    "		PG0001003_2013_FILE1.JPGGGGGGGGGGGGGGGGGGGGGGGGGGG \n" +
                                    "	</td>\n" +
                                    "	<td>		\n" +
                                    "		94029ABE182880437BA99EF580437BA99EF584975E65D93BF2DCD8A7\n" +
                                    "	</td>               "+ 
        "</tr> \n"+
        "<tr>	\n" +
                                    "	<td>	\n" +
                                    "		PG0001003_2013_FILE1.JP\n" +
                                    "	</td>\n" +
                                    "	<td>		\n" +
                                    "		94029ABE182880437BA9\n" +
                                    "	</td>               "+ 
        "</tr> \n" +
                "<tr>	\n" +
                                    "	<td>	\n" +
                                    "		PG0001003_2013_FILE1.JPGGGGGGGGGGGGGGGGGGGGGGGGGGG \n" +
                                    "	</td>\n" +
                                    "	<td>		\n" +
                                    "		94029ABE182880437BA99EF580437BA99EF584975E65D93BF2DCD8A7\n" +
                                    "	</td>               "+ 
        "</tr> \n"+
        "<tr>	\n" +
                                    "	<td>	\n" +
                                    "		PG0001003_2013_FILE1.JP\n" +
                                    "	</td>\n" +
                                    "	<td>		\n" +
                                    "		94029ABE182880437BA9\n" +
                                    "	</td>               "+ 
        "</tr> \n"+
                "<tr>	\n" +
                                    "	<td>	\n" +
                                    "		PG0001003_2013_FILE1.JPGGGGGGGGGGGGGGGGGGGGGGGGGGG \n" +
                                    "	</td>\n" +
                                    "	<td>		\n" +
                                    "		94029ABE182880437BA99EF580437BA99EF584975E65D93BF2DCD8A7\n" +
                                    "	</td>               "+ 
        "</tr> \n"+
        "<tr>	\n" +
                                    "	<td>	\n" +
                                    "		PG0001003_2013_FILE1.JPgggggggggggggggggggggggggggggggggg\n" +
                                    "	</td>\n" +
                                    "	<td>		\n" +
                                    "		94029ABE182880437BA9\n" +
                                    "	</td>               "+ 
        "</tr>");

                        
        Template temp = cfg.getTemplate("909_frontespizio_berbero_locale.xhtml");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Writer out = new OutputStreamWriter(baos);
        temp.process(dataroot, out);

        ITextRenderer renderer = new ITextRenderer();
  
        renderer.setListener(new PDFCreationListener() {

            @Override
            public void preOpen(ITextRenderer itr) {
            
                PdfWriter writer = itr.getWriter();
//                writer.setPDFXConformance(PdfWriter.PDFA1A);
                writer.setPdfVersion(PdfWriter.PDF_VERSION_1_4);

            }

            @Override
            public void onClose(ITextRenderer itr) {

                //renderer.getOutputDevice().getWriter().setPdfVersion(PdfWriter.VERSION_1_3);
                PdfWriter writer = itr.getWriter();
                

                try {
                    // icc = ICC_Profile.getInstance(new FileInputStream("./AdobeRGB1998.icc"));
                    PdfDictionary structureTreeRoot = new PdfDictionary();
                    structureTreeRoot.put(PdfName.TYPE, PdfName.STRUCTTREEROOT);
                    writer.getExtraCatalog().put(PdfName.STRUCTTREEROOT, structureTreeRoot);

                    PdfDictionary markInfo = new PdfDictionary(PdfName.MARKINFO);
                    markInfo.put(PdfName.MARKED, new PdfBoolean("true"));
                    writer.getExtraCatalog().put(PdfName.MARKINFO, markInfo);

                    PdfDictionary outi = new PdfDictionary(PdfName.OUTPUTINTENT);
                    outi.put(PdfName.OUTPUTCONDITIONIDENTIFIER, new PdfString("sRGBIEC61966-2.1"));
                    outi.put(PdfName.INFO, new PdfString("sRGB IEC61966-2.1"));
                    outi.put(PdfName.S, PdfName.GTS_PDFA1);

                    ICC_Profile icc = ICC_Profile.getInstance(new FileInputStream("./AdobeRGB1998.icc"));
                    PdfICCBased ib = new PdfICCBased(icc);
                    ib.remove(PdfName.ALTERNATE);
                    outi.put(PdfName.DESTOUTPUTPROFILE, writer.addToBody(ib).getIndirectReference());
                    writer.getExtraCatalog().put(PdfName.OUTPUTINTENTS, new PdfArray(outi));

                    writer.createXmpMetadata();

                } catch (Exception ex) {
                    Logger.getLogger(TemplateFrontespizio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void preWrite(ITextRenderer itr, int i) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

           
        });

        renderer.setDocumentFromString(baos.toString("UTF-8"));
        renderer.layout();
        renderer.createPDF(new FileOutputStream("frontespizio.pdf"));

        renderer.finishPDF();

    }

}
