package environment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class Environment{

    private static Environment environment;
    private final Properties properties = new Properties();
    private final String filePath = "./src/main/resources/local.properties";
    private final String url = "https://github.com/poteto/hiring-without-whiteboards";

public static Environment getInstance(){
    return environment = new Environment();
}

    public String getUrl() {
        return url;
    }



}