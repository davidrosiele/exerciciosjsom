import com.google.gson.Gson;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class TesteJson {
    static Map<String, String> dadosTesteMap = new HashMap<String, String>();
    static Gson gson = new Gson();
    static Reader reader;

    public static void main(String[] args) throws IOException {
        leiturajson();
        escritaArquivoJson();
    }
    public static void leiturajson() throws FileNotFoundException {
    reader = new FileReader("./src/main/resources/massaTeste.json");
    dadosTesteMap = gson.fromJson(reader, Map.class);

    System.out.println(dadosTesteMap.get("url"));
        System.out.println(dadosTesteMap.get("produto"));
        System.out.println(dadosTesteMap.get("valor"));
    }
    public static void escritaArquivoJson() throws IOException {
        dadosTesteMap.put("email", "Teste@teste.com.br");
        dadosTesteMap.put("senha", "Teste@123");

        FileWriter writer = new FileWriter("./src/main/resources/copia_massaTeste.json");
        gson.toJson(dadosTesteMap, writer);
        writer.flush();
        writer.close();
    }
}