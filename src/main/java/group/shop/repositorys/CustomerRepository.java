package group.shop.repositorys;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import group.shop.entity.Customers;

@Repository
public interface CustomerRepository extends CrudRepository< Customers, Integer>{
	@Query(value = "SELECT * FROM Customers u WHERE u.email = ?1", nativeQuery = true)
	Optional<Customers> findByName(String name);
	@Query(value = "SELECT * FROM Customers u WHERE u.phone = ?1", nativeQuery = true)
	Optional<Customers> findByPhone(String phone);
	
}
