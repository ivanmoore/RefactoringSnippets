package com.oocode;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class Invoice {
    private final List<LineItem> items = new ArrayList<>();

    public void print(PrintStream stream) {
        stream.println("ACME Ltd");
        stream.println("123 High St");
        stream.println("London");
        stream.println("SW12 1AA");

        int totalCost = 0;

        for (LineItem item : items) {
            StringBuffer line = new StringBuffer();
            line.append(item.name);
            line.append("\t");
            line.append(item.price);
            line.append("\t");
            line.append(item.quantity);
            line.append("\t");
            line.append(item.quantity * item.price);
            totalCost += item.quantity * item.price;
            stream.println(line.toString());
        }

        stream.println("Total" + "\t\t\t" + totalCost);
    }
}
