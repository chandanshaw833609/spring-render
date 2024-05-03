package in.chandan.entity;

//import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
@Document(collection = "orderItem")
public class OrderItems {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
//    @ManyToOne
//    @JoinColumn(name = "menu_item")
    private MenuItems menuItem;

//    @ManyToOne
//    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Orders order;
    private int quantity;

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MenuItems getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItems menuItem) {
        this.menuItem = menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
