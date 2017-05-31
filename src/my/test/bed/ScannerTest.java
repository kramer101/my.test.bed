package my.test.bed;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ScannerTest {

	
	
	public static void main(String[] args) throws Exception {
		File inputFile = new File("/Users/vyakovlev/work/zephyr_challenge_DS_1.xml");
		
		File providersListFile = new File("/Users/vyakovlev/worr/zephyr-challenge-input-physicians.txt");
		
		String lastName = "Shah";
		
		List<String> data = new ArrayList<>();
		data.add("LastName;FirstName;Initials");
				
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();

		
		DefaultHandler handler = new  DefaultHandler() {

			private String article;
			
			@Override
			public void startElement(String uri, String localName, String qName, Attributes attributes)
					throws SAXException {

				super.startElement(uri, localName, qName, attributes);
				if (qName.equalsIgnoreCase("PubmedArticle") && article == null) {
					article = "<" + qName + ">";
				} else if (article != null) {
					article = article + "<" + qName + ">";
				}
			}
			
			
			@Override
			public void endElement(String uri, String localName, String qName) throws SAXException {

				super.endElement(uri, localName, qName);
				
				if (qName.equalsIgnoreCase("PubmedArticle") && article != null) {
					
					article = article + "</" + qName + ">";
					
					//System.out.println(article);
					
					Document articleDocument =  Jsoup.parse(article);
					
					Elements author =  articleDocument.getElementsByTag("Author");
					for (Element element : author) {
						
						if (element.getElementsByTag("LastName") != null) {
							//System.out.println(element);
							
							String ln = element.getElementsByTag("LastName").size() == 0 ? "" : element.getElementsByTag("LastName").get(0).text();
							
							if (lastName.equals(ln)) {

								String fn = element.getElementsByTag("ForeName").size() == 0 ? "" : element.getElementsByTag("ForeName").get(0).text();
								String initials = element.getElementsByTag("Initials").size() == 0 ? "" : element.getElementsByTag("Initials").get(0).text();
								
								data.add(ln + ";" 
								+ fn + ";" + initials);
							}
								
						}
						
						//System.out.println(element.getElementsByTag("LastName").get(0).text());
					}
 					
					article = null;
				} else {
					article = article + "</" + qName + ">";
				}
			}
			
			@Override
			public void characters(char[] ch, int start, int length) throws SAXException {
				super.characters(ch, start, length);
		
				article = article + String.copyValueOf(ch, start, length);
				
			}
		};
		
		saxParser.parse(inputFile, handler);
		
		FileUtils.writeLines(new File("testEntityToPojo-data_" + lastName + ".csv"), data);
	}
}
