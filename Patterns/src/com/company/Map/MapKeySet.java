package com.company.Map;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by palen on 12.10.2016.
 */
public class MapKeySet {
    Map<String, Integer> values;
    Scanner in;

    public MapKeySet(){
        values=new HashMap<>();
    }

    public Map<String, Integer> fillMap() {
        values = new HashMap<>();
        in = new Scanner(System.in);
        System.out.println("Регион: ");
        values.put("region",in.nextInt());
        System.out.println("Зарплата: ");
        values.put("salary",in.nextInt());
        System.out.println("Сумма кредита: ");
        values.put("creditAmount",in.nextInt());
        System.out.println("Срок кредитования: ");
        values.put("creditTerm",in.nextInt());
        return values;
    }
}
