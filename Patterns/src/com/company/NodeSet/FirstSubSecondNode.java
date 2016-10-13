package com.company.NodeSet;

/**
 * Created by palen on 06.10.2016.
 */
public class FirstSubSecondNode extends AbstractNode {

    @Override
    public double getResult() {
        return childNodes.get(1).getResult()- childNodes.get(1).getResult();
    }
}
