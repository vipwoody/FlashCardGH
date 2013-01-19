/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package flashcard;

/**
 *
 * @author GiantChiprel
 */

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class ReadXMLFile {

	public static void readXML(int deck, int question) {

	  try {

		File fXmlFile = new File("deck"+deck+".xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();

		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		NodeList nList = doc.getElementsByTagName("question");
		System.out.println("-----------------------");

		//for (int temp = 0; temp < nList.getLength(); temp++) {

		   Node nNode = nList.item(question);
		   if (nNode.getNodeType() == Node.ELEMENT_NODE) {

		      Element eElement = (Element) nNode;

                      FlashcardView.model.deckSize=nList.getLength();

		      System.out.println("Q : " + getTagValue("q", eElement));
                      FlashcardView.model.Question = getTagValue("q", eElement);
		      System.out.println("A1 : " + getTagValue("a1", eElement));
                      FlashcardView.model.answerA = getTagValue("a1", eElement);
	              System.out.println("A2 : " + getTagValue("a2", eElement));
                      FlashcardView.model.answerB = getTagValue("a2", eElement);
		      System.out.println("A3 : " + getTagValue("a3", eElement));
                      FlashcardView.model.answerC = getTagValue("a3", eElement);
                      System.out.println("A3 : " + getTagValue("a3", eElement));
                      FlashcardView.model.rightAnswer = Integer.parseInt(getTagValue("correct", eElement));

		   }
                 //}
	  } catch (Exception e) {
		e.printStackTrace();
	  }
  }

  private static String getTagValue(String sTag, Element eElement) {
	NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();

        Node nValue = (Node) nlList.item(0);

	return nValue.getNodeValue();
  }

}
