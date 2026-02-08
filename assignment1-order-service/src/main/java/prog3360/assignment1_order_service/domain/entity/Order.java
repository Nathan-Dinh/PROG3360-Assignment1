package prog3360.assignment1_order_service.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;
    private int quantity;
    private double totalPrice;
    private String status;

    public Order() {
    }
    public Order(Long productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getProductId(){
      return productId;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setTotalPrice(double newTotalPrice) {
        this.totalPrice = newTotalPrice;
    }

    public void setStatus(String newStatus){
        this.status = newStatus;
    }
}
