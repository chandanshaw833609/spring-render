package in.chandan.entity;

//import jakarta.persistence.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
@Document(collection = "menuItem")
public class MenuItems {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String price;
    private String imageUrl;
//    @ManyToOne
//    @JoinColumn
    private MenuTitle menuTitle;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public MenuTitle getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(MenuTitle menuTitle) {
        this.menuTitle = menuTitle;
    }
}
