package com.devsuperior.dscommerce.repositories;

import com.devsuperior.dscommerce.entities.*;
import org.springframework.data.jpa.repository.*;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
