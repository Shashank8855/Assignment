package com.company;
import java.util.*;
public class SortNames{
    static void mapKeySort() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "Gupta");
        map.put("5","Aman");
        map.put("3","Kashi");
        map.put("2","Bala");
        map.put("7","Zebra");

        Map<String,String>  sorted=new TreeMap<>(map);
        System.out.println("Sorted Map :");
        for(Map.Entry<String,String> entry:sorted.entrySet())
        {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        SortNames.mapKeySort();
    }
}