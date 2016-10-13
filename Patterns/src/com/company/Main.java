package com.company;

import com.company.Map.MapKeySet;
import com.company.Scoring.ScoringSetup;


public class Main {
    public static void main(String[] args) {
        MapKeySet values = new MapKeySet() ;
        ScoringSetup creditScoring = new ScoringSetup(values.fillMap());
        System.out.println(creditScoring.getScoring());
    }

//double Scoring ( Map<String,Double> values);
    //Написать ноды для дерева принятия решений (+-Ю=)
    // ключи город запралата срок кредита в месяцах и сумма кредита
    // только клиенты из нск и ещемесячный платеж не превышал 50% от их зарплаты
    //шапблон композит
}