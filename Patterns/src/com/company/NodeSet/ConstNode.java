package com.company.NodeSet;

/**
 * Created by palen on 06.10.2016.
 */
public class ConstNode extends AbstractNode {

    int value;

    public ConstNode(int value){
        this.value=value;
    }

    ConstNode(){
        this.value=1;
    }

    @Override
    public double getResult() {
        return value;
    }
}
