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
public class TemplateCorpo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, DocumentException, IOException, TemplateException {
        // TODO code application logic here
        Configuration cfg = new Configuration();
        cfg.setDirectoryForTemplateLoading(new File("../templates"));
        cfg.setObjectWrapper(new DefaultObjectWrapper());
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
        cfg.setIncompatibleImprovements(new Version(2, 3, 20));

        Map dataroot = new HashMap();

        String testo1 = new String();
        String templa = "960_corpo";
//        Template temp = cfg.getTemplate("105_corpo.xhtml");
//        Template temp = cfg.getTemplate("106_corpo.xhtml");
        Template temp = cfg.getTemplate(templa + ".xhtml");
        dataroot.put("applicazione", "procton");
        dataroot.put("logo", "carta_intestata_DPO");

        testo1 = "<u>\n"
                + "}Sed ut perspiciatislorem eum fugiat quo voluptas nulla pariatur?\n"
                + "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar?  perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar  Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar?  perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar  Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar?  perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar  Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar?  perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar  Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar?  perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar perspiciatis unde omnis iste natus error sit voluptatem accusantiumoluptatem quia voluptas sit ar  </u>";
        //testo1= testo1.replaceAll("<br />", "</p><p>");
        //testo1 = testo1.replaceAll("</p><p></p><p>", "</p><p><br /></p><p>");
        //testo1 = testo1.replaceAll("</p><p>\n </p><p>", "</p><p><br /></p><p>")
        dataroot.put("resourcePath", "C:/Users/Top/Documents/prova/templates");

        dataroot.put("unita_resproc", "Uoc Sistemi Informativi E Telecomunicazioni[unita_resproc]");
        dataroot.put("unita_firmatario", "Servizio Unico Metropolitano<br/>\n"
                + //"unita 2 <br/>\n" +
                //"unita 3<br/>\n" +
                "Contabilità e Finanza <br/>");

        dataroot.put("titolo_corpo", "DETERMINAZIONE");      //DE
        dataroot.put("utente", "Utente Prova 2 (mail nsi) Utente Prova 2 (mail nsi) g.demarco@nsi.it"); //PI  

        dataroot.put("oggetto", "jha dfadh adjf hasd dkajfsjds haj hdfa dkjah fjakodia dfja djaj hf");

        dataroot.put("introduzione", "Introduciamo il presente verbale jkò ladsfòj fasdf òl òljòlfa dkja òdflkja òldkfj òaldksfòlasjdfòlaslòò òaòdl f");

        dataroot.put("decisione", "RINNOVO DELLE CONVENZIONI PER PRESTAZIONI DI CONSULENZA IN DERMATOLOGIA E PEDIATRIA A FAVORE DELL'ISTITUTO ORTOPEDICO RIZZOLI - ANNO 2014 <br/>  <br/> ADESIONE A CONVENZIONE CONSIP “AUTOVEICOLI 7 ”-LOTTO 5");

        dataroot.put("conclusione", "concludiamo la seduta del verbale jkò ladsfòj fasdf òl òljòlfa dkja òdflkja òldkfj òaldksfòlasjdfòlaslòò òaòdl f");

        dataroot.put("testo1", testo1);
        dataroot.put("tipo_corpo", "DETERMINA");            //DE
        dataroot.put("testo2", "secondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasdsecondo testo dfsvòlda kàòlasfsdkàfklasdòfl kàasòldfkàdòlas kfàòlaskdfàòl kasàòdfkla àòsldfkòasl dkfàask dfòlkasdòflkasd");         //DE
        dataroot.put("resproc", "pinco pallino");
        dataroot.put("destinatario", "<li class=\"li_de\"> prova1 </li>\n"
                + "<li class=\"li_de\"> prova2 </li>\n"
                + "<li class=\"li_de\"> prova3 </li>"); //DE
        dataroot.put("firmatario", "Paolo Mosna <br/>\n"
                + "Tizio Caio <br/>");

        dataroot.put("alias_pedice_firma", "(alias_pedice_firma)");//

        dataroot.put("pedice_footer_ausl", "<b>Direzione Generale<br/>\n"
                + "U.O. Area Comunicazione</b><br/>\n"
                + "T. +39.0532.236.059<br/>\n"
                + "F. +39.0532.236.895<br/>\n"
                + "g.putinati@ospfe.it");

        //dataroot.put("mostra_pedice_footer_sx", null);       
        //  s_orsola, ISO, CRS, rizzoli
        dataroot.put("caption_logo", "4000 PGI-A");//   4000 ING-A,     4000 PGI-A,   4000 FOR-A,  4000-L

        dataroot.put("esiste_footer", "Proponente");

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
                    Logger.getLogger(TemplateCorpo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void preWrite(ITextRenderer itr, int i) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

        renderer.setDocumentFromString(baos.toString("UTF-8"));
        renderer.layout();
        renderer.createPDF(new FileOutputStream(templa+".pdf"));

        renderer.finishPDF();

    }

}
