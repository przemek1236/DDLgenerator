package org.apache.ddl.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Dataset {

    String name;
    @JsonProperty("tables")
    ArrayList<TableItem> tables;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<TableItem> getTables() {
        return tables;
    }

    public void setTables(ArrayList<TableItem> tables) {
        this.tables = tables;
    }

    @Override
    public String toString() {
        return "Dataset{" +
                "name='" + name + '\'' +
                ", datasets=" + tables +
                '}';
    }
}
