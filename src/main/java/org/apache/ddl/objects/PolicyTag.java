package org.apache.ddl.objects;

import java.util.ArrayList;

public class PolicyTag {

    ArrayList<String> names;

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "PolicyTag{" +
                "names=" + names +
                '}';
    }
}
