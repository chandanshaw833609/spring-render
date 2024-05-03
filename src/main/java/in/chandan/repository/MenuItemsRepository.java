package in.chandan.repository;

import in.chandan.entity.MenuItems;
import in.chandan.entity.MenuTitle;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MenuItemsRepository extends MongoRepository<MenuItems, String> {
    List<MenuItems> findByMenuTitle(String id);
    @Query("{'menuTitle._id' : ?0 }")
    List<MenuItems> findByMenuItemId(String id);
}
