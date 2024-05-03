package in.chandan.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

//@Entity
@Document(collection = "orders")
public class Orders {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

//    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
//    @JsonIgnore


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private List<OrderItems> orderItemsList;

    public Orders() {
        this.orderItemsList = new ArrayList<>();
    }

    public List<OrderItems> getOrderItemsList() {
        return orderItemsList;
    }

    public void setOrderItemsList(List<OrderItems> orderItemsList) {
        this.orderItemsList = orderItemsList;
    }
}
