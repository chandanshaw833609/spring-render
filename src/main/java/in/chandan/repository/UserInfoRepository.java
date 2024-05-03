package in.chandan.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.chandan.entity.UserInfo;

import java.util.Optional; 

@Repository
public interface UserInfoRepository extends MongoRepository<UserInfo, String> {
	Optional<UserInfo> findByEmail(String email);
}

