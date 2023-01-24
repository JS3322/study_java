package pattern.facade;

import java.util.HashMap;
import java.util.Map;

public class Json {
    public Map<String, Object> parse(String str) {
        Map<String, Object> result = new HashMap<>();
        result.put("address", "아산시 연화로");
        return result;
    }
}