package group.shop.services;

import java.util.Optional;

import group.shop.entity.Customers;

public interface CustomerService {

	void deleteAll();

	void deleteAll(Iterable<? extends Customers> entities);

	void delete(Customers entity);

	void deleteById(Integer id);

	long count();

	Iterable<Customers> findAllById(Iterable<Integer> ids);

	Iterable<Customers> findAll();

	boolean existsById(Integer id);

	Optional<Customers> findById(Integer id);

	<S extends Customers> Iterable<S> saveAll(Iterable<S> entities);

	<S extends Customers> S save(S entity);

	Optional<Customers> findByPhone(String phone);

	Optional<Customers> findByName(String name);

	
}
