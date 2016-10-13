package com.company.NodeSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by palen on 06.10.2016.
 */
public class AbstractNode implements Node{

    List<Node> childNodes = new ArrayList<>(2);

    @Override
    public void addChild(Node child) throws ArrayIndexOutOfBoundsException{
        childNodes.add(child);
    }

    @Override
    public double getResult() {
        return 0;
    }

}
