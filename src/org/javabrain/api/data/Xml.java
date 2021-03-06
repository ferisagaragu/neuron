package org.javabrain.api.data;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import org.xml.sax.InputSource;

public class Xml {

    public Document document;
    private String data;
    boolean isPaht = false;

    public Xml() {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            document = documentBuilder.newDocument();     
            isPaht = true;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
    
    public Xml(String path) {

        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            document = documentBuilder.parse(new java.io.File(path));     
            data = path;
            isPaht = true;
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

    }
    
    public Xml(Object stg) {

        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            InputSource insrc = new InputSource(new StringReader(stg.toString()));
            if (!stg.toString().isEmpty()) {
                document = documentBuilder.parse(insrc);
                data = stg.toString();
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

    }
    
    public void reload() {
        if (isPaht) {
            new Xml(data);
        } else {
            Object o = data;
            new Xml(o);
        }
    }

    public boolean isValid() {
        try {
            document.getTextContent();
            return true;
        } catch(Exception e) {}
        return false;
    }
    
    public String stringify() {
        try {
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, "yes");
            StringWriter writer = new StringWriter();
            transformer.transform(new DOMSource(document), new StreamResult(writer));
            String output = writer.getBuffer().toString().replace("?>","?>\n");
            return output;
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        return null;
    }

    public NodeList getElementsByTagName(String tagname) {
        return document.getElementsByTagName(tagname);
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

}
