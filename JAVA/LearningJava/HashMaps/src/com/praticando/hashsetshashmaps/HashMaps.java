package com.praticando.hashmaps;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("Richard", 12345);
        empIds.put("Carlos", 54321);
        empIds.put("Jonas", 43261);

        System.out.println(empIds);
        System.out.println(empIds.get("Richard"));
        System.out.println(empIds.containsKey("Jonas"));
        System.out.println(empIds.containsValue(15897));

        empIds.put("Richard", 432100);
        System.out.println(empIds);

        empIds.replace("Brabo", 1234567);
        System.out.println(empIds);

        empIds.putIfAbsent("Brabo", 12345678);
        System.out.println(empIds);

        empIds.remove("Brabo", 12345678);
        System.out.println(empIds);
    }
}
