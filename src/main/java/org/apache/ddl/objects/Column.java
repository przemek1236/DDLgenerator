package org.apache.ddl.objects;

import java.util.ArrayList;

public class Column {
    String name;
    String type;
    String mode = "NULLABLE"; // default mode is NULLABLE for table columns in BigQuery

    //    String description;
    PolicyTag policyTags;
    ArrayList<Column> fields;

    public ArrayList<Column> getFields() {
        return fields;
    }

    public void setFields(ArrayList<Column> fields) {
        this.fields = fields;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public PolicyTag getPolicyTags() {
        return policyTags;
    }

    public void setPolicyTags(PolicyTag policyTags) {
        this.policyTags = policyTags;
    }

    @Override
    public String toString() {
        return "Column{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", mode='" + mode + '\'' +
                ", policyTags=" + policyTags +
                ", fields=" + fields +
                '}';
    }
}
