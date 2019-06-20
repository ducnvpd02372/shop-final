package group.shop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import group.shop.entity.Products;

public interface ProdutService {

	<S extends Products> List<S> findAll(Example<S> example, Sort sort);

	<S extends Products> List<S> findAll(Example<S> example);

	void deleteAll();

	<S extends Products> boolean exists(Example<S> example);

	void deleteAll(Iterable<? extends Products> entities);

	<S extends Products> long count(Example<S> example);

	void delete(Products entity);

	Products getOne(Integer id);

	void deleteById(Integer id);

	void deleteAllInBatch();

	long count();

	<S extends Products> Page<S> findAll(Example<S> example, Pageable pageable);

	void deleteInBatch(Iterable<Products> entities);

	<S extends Products> S saveAndFlush(S entity);

	void flush();

	boolean existsById(Integer id);

	<S extends Products> List<S> saveAll(Iterable<S> entities);

	List<Products> findAllById(Iterable<Integer> ids);

	Optional<Products> findById(Integer id);

	List<Products> findAll(Sort sort);

	List<Products> findAll();

	Page<Products> findAll(Pageable pageable);

	<S extends Products> Optional<S> findOne(Example<S> example);

	<S extends Products> S save(S entity);

	
}
