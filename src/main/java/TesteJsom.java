import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class TesteJsom {
    static Map<String, String> dadosTesteMap = new HashMap<String, String>();
    static Gson gson = new Gson();
    static Reader reader;

    public static void main(String[] args) throws FileNotFoundException {
        reader = new FileReader("./src/main/resources/massaTeste.jsom");
        dadosTesteMap = gson.fromJson(reader, Map.class);
        System.out.println(dadosTesteMap.get("url"));
        System.out.println(dadosTesteMap.get("produto"));
        System.out.println(dadosTesteMap.get("valor"));

    }
}
