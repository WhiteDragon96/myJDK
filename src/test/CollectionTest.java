package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author tcs
 */
public class CollectionTest {
    public static void main(String[] args) {
        safeList();
        safeMap();
    }

    private static void safeList() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("arrayList");
        arrayList.add("arrayList");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        List<String> linkList = new LinkedList<>();
        linkList.add("linkList");
        List<String> vectorList = new Vector<>();
        vectorList.add("vectorList");
        List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("copyOnWriteArrayList");

    }

    private static void safeMap() {
        Map<String, String> hashMap = new HashMap<>();
        String put = hashMap.put("hello", "hashMap");
        String put2 = hashMap.put("hello", "hashMap1");
        Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("hello","concurrentHashMap");
    }

}
