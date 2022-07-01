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
public class TemplateRegistrazioni {
          
        
   
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

       
        dataroot.put("content","<h2>Registrazioni del 15/04/2015</h2><br/><b>Registro: </b>Deliberazione<br /><br /><table class = 'tabella'><tr><th>Numero</th><th>Data</th></tr><tr><td>0000190</td><td>15/04/2015</td></tr></table><p class='oggetto'><b>Oggetto</b>: REVIEW MEETING 20150415 RM1940 DELI - PENSIONATO CHE HA GI&Agrave;\n" +
"ACCETTATO - NON USARE\n" +
"</p><p><b>Unità: </b>UO Sistema Informativo Metropolitano (SC)\n" +
"</p><p><b>Pubblicazione dal</b> 30/04/2015 <b>al</b> 15/04/2015 <b>numero</b> 2015.511</p><p><b>Stato: </b>Attivo</p><hr /><table class = 'tabella'><tr><th>Numero</th><th>Data</th></tr><tr><td>0000189</td><td>15/04/2015</td></tr></table><p class='oggetto'><b>Oggetto</b>: DELI - PENSIONATO CHE HA GI&Agrave; ACCETTATO\n" +
"</p><p><b>Unità: </b>UO Sistema Informativo Metropolitano (SC)\n" +
"</p><p><b>Pubblicazione dal</b> 30/04/2015 <b>al</b> 15/04/2015 <b>numero</b> 2015.510</p><p><b>Stato: </b>Attivo</p><hr /><table class = 'tabella'><tr><th>Numero</th><th>Data</th></tr><tr><td>0000188</td><td>15/04/2015</td></tr></table><p class='oggetto'><b>Oggetto</b>: PROVA DIRETTORI INIZIALI\n" +
"</p><p><b>Unità: </b>UO Sistema Informativo Metropolitano (SC)\n" +
"</p><p><b>Pubblicazione dal</b> 30/04/2015 <b>al</b> 15/04/2015 <b>numero</b> 2015.508</p><p><b>Stato: </b>Attivo</p><hr /><table class = 'tabella'><tr><th>Numero</th><th>Data</th></tr><tr><td>0000187</td><td>15/04/2015</td></tr></table><p class='oggetto'><b>Oggetto</b>: PROVA LOCK SMISTAMENTI\n" +
"</p><p><b>Unità: </b>UO Sistema Informativo Metropolitano (SC)\n" +
"</p><p><b>Pubblicazione dal</b> 30/04/2015 <b>al</b> 15/04/2015 <b>numero</b> 2015.505</p><p><b>Stato: </b>Attivo</p><hr />"); //DE
        
        
                        
        Template temp = cfg.getTemplate("registrazioni_locale.xhtml");
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
                    Logger.getLogger(TemplateRegistrazioni.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void preWrite(ITextRenderer itr, int i) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

           
        });

        renderer.setDocumentFromString(baos.toString("UTF-8"));
        renderer.layout();
        renderer.createPDF(new FileOutputStream("registrazioni.pdf"));

        renderer.finishPDF();

    }

}
