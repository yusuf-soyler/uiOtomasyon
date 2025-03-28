package utils;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.openqa.selenium.By;

public class locatorReader {

    private JSONObject locators;

    public locatorReader(String page_name) {
        try {
            String path = "src/test/resources/locators/" + page_name + ".json";
            String content = new String(Files.readAllBytes(Paths.get(path)));
            locators = new JSONObject(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public By get(String key) {
        JSONObject locator = locators.getJSONObject(key);
        String type = locator.getString("type");
        String value = locator.getString("value");

        return switch (type.toLowerCase()) {
            case "id" -> By.id(value);
            case "xpath" -> By.xpath(value);
            case "css" -> By.cssSelector(value);
            case "name" -> By.name(value);
            case "class" -> By.className(value);
            case "tag" -> By.tagName(value);
            default -> throw new RuntimeException("Unknown locator type: " + type);
        };
    }

    public By getDynamicLocator(String key, String replacement) {
        JSONObject locator = locators.getJSONObject(key);
        String type = locator.getString("type");
        String value_template = locator.getString("value");

        // {{LOCATION}} gibi placeholder'ı değiştir
        String dynamic_value = value_template.replace("{{LOCATION}}", replacement);

        return switch (type.toLowerCase()) {
            case "id" -> By.id(dynamic_value);
            case "xpath" -> By.xpath(dynamic_value);
            case "css" -> By.cssSelector(dynamic_value);
            case "name" -> By.name(dynamic_value);
            case "class" -> By.className(dynamic_value);
            case "tag" -> By.tagName(dynamic_value);
            default -> throw new RuntimeException("Unknown locator type: " + type);
        };
    }

}
