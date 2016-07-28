package CreateOrder;

import javax.jws.WebService;

import CreateOrder.Models.OrderModel;

@WebService
public interface CreateOrder {
    String createOrder(String salesForceOrderId);
    //OrderModel createSAPOrder (OrderModel order );
}