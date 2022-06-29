package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tcs
 */
public class CollectionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list);
        Map<String,String> map = new HashMap<>();
        map.put("hello","src");
        System.out.println(map);
    }
}
