package in.chandan.repository;

import in.chandan.entity.MenuItems;
import in.chandan.entity.MenuTitle;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MenuTitleRepository extends MongoRepository<MenuTitle,String> {
    MenuTitle findByTitle(String title);
}
