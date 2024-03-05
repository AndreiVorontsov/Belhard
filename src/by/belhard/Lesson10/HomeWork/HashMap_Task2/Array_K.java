package by.belhard.Lesson10.HomeWork.HashMap_Task2;

import java.util.HashMap;
import java.util.Map;

class Array_K<K> {
    private K[] ks;

    public Array_K() {
    }

    public <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> mapK = new HashMap<K, Integer>();
        Integer count;
        for (K item : ks) {
            if (mapK.containsKey(item)) {
                count = mapK.get(item) + 1;
                mapK.put(item, count);
            } else {
                mapK.put(item, 1);
            }
        }
        return mapK;
    }

    public void entry(Map<K, Integer> catalog) {
        for (Map.Entry<K, Integer> item : catalog.entrySet()) {
            System.out.println(item);
        }
    }
}
