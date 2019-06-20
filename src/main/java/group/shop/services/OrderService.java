package group.shop.services;

import java.util.Optional;

import group.shop.entity.Orders;

public interface OrderService {

	void deleteAll();

	void deleteAll(Iterable<? extends Orders> entities);

	void delete(Orders entity);

	void deleteById(Integer id);

	long count();

	Iterable<Orders> findAllById(Iterable<Integer> ids);

	Iterable<Orders> findAll();

	boolean existsById(Integer id);

	Optional<Orders> findById(Integer id);

	<S extends Orders> Iterable<S> saveAll(Iterable<S> entities);

	<S extends Orders> S save(S entity);

}
