package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class configReader {
    private static Properties props = new Properties();

    static {
        try {
            FileInputStream input = new FileInputStream("src/test/resources/config.properties");
            props.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return System.getProperty(key, props.getProperty(key));
    }
}
