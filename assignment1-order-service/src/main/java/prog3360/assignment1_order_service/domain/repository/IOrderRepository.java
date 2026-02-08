package prog3360.assignment1_order_service.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prog3360.assignment1_order_service.domain.entity.Order;

@Repository
public interface IOrderRepository extends JpaRepository<Order, Long> {
}
