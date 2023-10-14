//C:\Users\Win10\Projeto-Revisao-Equipe\
import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.util.XMLResourceDescriptor;
import org.w3c.dom.Document;

public class SVGLer {
    public static void main(String[] args) {
        try {
            // Carregue o arquivo SVG
            String svgURI = "DistanciasCidadesCSV.csv";
            String parser = XMLResourceDescriptor.getXMLParserClassName();
            SAXSVGDocumentFactory factory = new SAXSVGDocumentFactory(parser);
            Document document = factory.createDocument(svgURI);

            // Agora você pode processar o conteúdo do documento SVG
            // Por exemplo, acessar elementos, atributos, etc.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}