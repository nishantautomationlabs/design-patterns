package com.nal.structuralpattern.proxypattern.example1;

import java.util.List;

/**
 * Created by nishant on 15/11/18.
 */
public class OrderFulfillment implements IOrder {
    private List<Warehouse> warehouses;

    public void fulfillOrder(Order order) {
        //For each item in an order, check each warehouse to see if it is in stock

        //if all items are in stock, create Order from that warehouse

        for(Item item: order.itemList)
        {
            for(Warehouse warehouse: warehouses)
            {
                //check if stock exist
                //if so place the order
            }
        }
    }
}
