package com.devsuperior.ordercalculator.services;

import com.devsuperior.ordercalculator.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        if (order.getBasic() < 100.0) {
            return 20.0;
        } else if (order.getBasic() < 200.0) {
            return 12.00;
        } else {
            return 0;
        }
    }
}
