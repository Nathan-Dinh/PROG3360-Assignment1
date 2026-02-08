package prog3360.assignment1_order_service.domain.dto;

public class ProductDTO {
        private Long id;
        private String name;
        private double price;
        private int quantity;

        public int getQuantity(){
            return quantity;
        }

        public double getPrice(){
            return price;
        }
}
