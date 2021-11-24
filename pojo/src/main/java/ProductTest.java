import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;



public class ProductTest
{
    public static void main(String[] args) throws SerializeException, ParseException {
        //************************Serialization
        //pojo to json
        JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;
        String sellerName []={"Neon Enterprise","ABC Software","XYZ IT solutions"};
        Product product=new Product("MAC book pro",1000,"White",sellerName);
        String json= jsonSerializer.serialize(product);
        System.out.println(json);

        // pojo to xml
        XmlSerializer xmlSerializer =XmlSerializer.DEFAULT_NS_SQ_READABLE;
        String xml =xmlSerializer.serialize(product);
        System.out.println(xml);

        //************************************Deserialization

        //Json to POJO
        JsonParser jsonParser =JsonParser.DEFAULT;
        String jsonVal="{\n" +
                "\t\"color\": \"White\",\n" +
                "\t\"name\": \"MAC book pro\",\n" +
                "\t\"price\": 1000,\n" +
                "\t\"sellerName\": [\n" +
                "\t\t\"Neon Enterprise\",\n" +
                "\t\t\"ABC Software\",\n" +
                "\t\t\"XYZ IT solutions\"\n" +
                "\t]\n" +
                "}\n";
        Product pro= jsonParser.parse(jsonVal,Product.class);
        System.out.println(product.getColor());
        System.out.println(pro);


    }
}
