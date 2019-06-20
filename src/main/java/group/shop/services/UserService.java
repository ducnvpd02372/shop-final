package group.shop.services;

import java.util.Optional;

import group.shop.entity.Orders;
import group.shop.entity.Users;

public interface UserService {

	void deleteAll();

	void deleteAll(Iterable<? extends Users> entities);

	void delete(Users entity);

	void deleteById(Integer id);

	long count();

	Iterable<Users> findAllById(Iterable<Integer> ids);

	Iterable<Users> findAll();

	boolean existsById(Integer id);

	Optional<Users> findById(Integer id);

	<S extends Users> Iterable<S> saveAll(Iterable<S> entities);

	<S extends Users> S save(S entity);

	Optional<Users> findByName(String name);

	
	

}
