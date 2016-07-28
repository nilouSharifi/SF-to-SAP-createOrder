package CreateOrder;


import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import CreateOrder.Models.OrderModel;

@WebService(endpointInterface = "org.example.CreateOrder",
            serviceName = "CreateOrder")
public class CreateOrderImpl implements CreateOrder {
	@Resource
    private WebServiceContext context;

    public String createOrder (String salesForceOrderId) {
        return "SAP_" + salesForceOrderId;
    }
    
//    public OrderModel createSAPOrder (OrderModel order ){
//        return order;
//    }

}