package hello.core.order;

public interface OrderService {
    //주문서비스
    Order createOrder(Long id, String itemName, int itemPrice);


}
