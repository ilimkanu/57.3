import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String xml = new String(to_deserialize.fxml);
        GeoPlugin geoPluginfromxml = mapper.readValue(xml, GeoPlugin.class);
        System.out.println(xml);
    }
}
