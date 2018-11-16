package com.nal.structuralpattern.proxypattern.example1;

import java.util.Hashtable;

/**
 * Created by nishant on 15/11/18.
 */
public class Warehouse implements IOrder {
    private Hashtable<String, Integer> stock;
    private String address;


    public void fulfillOrder(Order order) {
        for(Item item: order.itemList)
        {
            this.stock.replace(item.sku, stock.get(item.sku)-1);
            //process the order
        }
    }

    public int currentInventory(Item item)
    {
        if(stock.containsKey(item.sku))
        {
            return stock.get(item.sku).intValue();
        }
        return 0;
    }
}
