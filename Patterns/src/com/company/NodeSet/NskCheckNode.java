package com.company.NodeSet;

/**
 * Created by palen on 12.10.2016.
 */
public class NskCheckNode extends AbstractNode {
    int value;

    public NskCheckNode(int value){
        this.value=value;
    }

    NskCheckNode(){
        this.value=1;
    }

    @Override
    public double getResult() {
        if (this.value == 54) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
