package group.shop.repositorys;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import group.shop.entity.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer>{
	@Query(value = "SELECT * FROM Users u WHERE u.username = ?1", nativeQuery = true)
	Optional<Users> findByName(String name);

}
