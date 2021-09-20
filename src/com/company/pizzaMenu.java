package com.company;

import java.util.ArrayList;
import java.util.List;

public class pizzaMenu {
    private List<menuItem> items;

    public pizzaMenu(List<menuItem> items) {
        this.items = items;
        items = new ArrayList<>();
    }

    public List<menuItem> getItems() {
        return items;
    }

    public void addItem(menuItem item){
        items.add(item);
    }
    public int countItems(){
        return items.size();
    }

}
