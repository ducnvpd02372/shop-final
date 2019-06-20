package group.shop.services;

import java.util.Optional;

import group.shop.entity.Transactions;

public interface TransactionService {

	void deleteAll();

	void deleteAll(Iterable<? extends Transactions> entities);

	void delete(Transactions entity);

	void deleteById(Integer id);

	long count();

	Iterable<Transactions> findAllById(Iterable<Integer> ids);

	Iterable<Transactions> findAll();

	boolean existsById(Integer id);

	Optional<Transactions> findById(Integer id);

	<S extends Transactions> Iterable<S> saveAll(Iterable<S> entities);

	<S extends Transactions> S save(S entity);

}
