package in.chandan.repository;

import in.chandan.entity.MenuItems;
import in.chandan.entity.OrderItems;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface OrderItemsRepository extends MongoRepository<OrderItems, String> {

    @Query("{'order._id' : ?0 }")
    List<OrderItems> findOrderItems(String id);
}
