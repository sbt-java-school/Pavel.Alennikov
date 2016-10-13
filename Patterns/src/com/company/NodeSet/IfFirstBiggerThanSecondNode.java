package com.company.NodeSet;

/**
 * Created by palen on 06.10.2016.
 */
public class IfFirstBiggerThanSecondNode extends AbstractNode {

    @Override
    public double getResult() {
        if (childNodes.get(0).getResult() > childNodes.get(1).getResult()){
            return 1;
        }
        else {
            return 0;
        }
    }
}
