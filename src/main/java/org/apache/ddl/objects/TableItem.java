package org.apache.ddl.objects;

import java.util.ArrayList;
public class TableItem {
    String name;
    String type = "table";
    ArrayList<Column> columns;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Column> getColumns() {
        return columns;
    }

    public void setColumns(ArrayList<Column> columns) {
        this.columns = columns;
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", columns=" + columns +
                '}';
    }
}
