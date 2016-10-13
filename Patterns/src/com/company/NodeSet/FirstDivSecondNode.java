package com.company.NodeSet;

/**
 * Created by palen on 12.10.2016.
 */
public class FirstDivSecondNode extends AbstractNode{
    @Override
    public double getResult() {
        return childNodes.get(0).getResult()/childNodes.get(1).getResult();
    }
}
