package com.company;
import java.util.*;
public class SortMaps{
    static void mapKeySort() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(24,"Deepa");
        map.put(1,"Aman");



        Map<Integer,String>  sorted=new TreeMap<>(map);
        System.out.println("Sorted Map :");
        for(Map.Entry<Integer,String> entry:sorted.entrySet())
        {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        SortMaps.mapKeySort();
    }
}
