package com.company.Scoring;

import com.company.NodeSet.*;

import java.util.Map;

/**
 * Created by palen on 12.10.2016.
 */
public class ScoringSetup {
    Map<String,Integer> values;
    public ScoringSetup(Map<String, Integer> values){
        this.values = values;
    }
    public double getScoring (){
        Node salary = new ConstNode(this.values.get("salary"));
        Node creditAmount = new ConstNode(this.values.get("creditAmount"));
        Node creditTerm = new ConstNode(this.values.get("creditTerm"));
        Node region = new NskCheckNode(this.values.get("region"));
        Node perMonthPayment = new FirstDivSecondNode();
        perMonthPayment.addChild(creditAmount);
        perMonthPayment.addChild(creditTerm);
        Node halfOfSalary = new FirstDivSecondNode();
        halfOfSalary.addChild(salary);
        halfOfSalary.addChild(new ConstNode(2));
        Node paymentCheck = new IfFirstBiggerThanSecondNode();
        paymentCheck.addChild(halfOfSalary);
        paymentCheck.addChild(perMonthPayment);
        Node nskAndPaymentCheckResult = new MultNode();
        nskAndPaymentCheckResult.addChild(region);
        nskAndPaymentCheckResult.addChild(paymentCheck);
        return nskAndPaymentCheckResult.getResult();
    }

}
