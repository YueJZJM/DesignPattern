package flyweight;

import java.util.HashMap;
import java.util.Map;

import decorator.old.NetworkStream;

public class FontFactory {
    private Map<String, Font> mMap = new HashMap<String, Font>();

    public Font getFont(String key) {
        if (mMap.containsKey(key)) {
            return mMap.get(key);
        } else {
            Font font = new Font(key);
            mMap.put(key, font);
            return font;
        }
    }
}
