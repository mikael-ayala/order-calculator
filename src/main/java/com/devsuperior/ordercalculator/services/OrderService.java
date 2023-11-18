package com.devsuperior.ordercalculator.services;

import com.devsuperior.ordercalculator.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double discount = (order.getDiscount() * order.getBasic()) / 100;
        return order.getBasic() + shippingService.shipment(order) - discount;
    }
}
