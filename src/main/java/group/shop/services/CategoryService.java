package group.shop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import group.shop.entity.Categorys;

public interface CategoryService {

	<S extends Categorys> List<S> findAll(Example<S> example, Sort sort);

	<S extends Categorys> List<S> findAll(Example<S> example);

	void deleteAll();

	<S extends Categorys> boolean exists(Example<S> example);

	void deleteAll(Iterable<? extends Categorys> entities);

	<S extends Categorys> long count(Example<S> example);

	void delete(Categorys entity);

	Categorys getOne(Integer id);

	void deleteById(Integer id);

	void deleteAllInBatch();

	long count();

	<S extends Categorys> Page<S> findAll(Example<S> example, Pageable pageable);

	void deleteInBatch(Iterable<Categorys> entities);

	<S extends Categorys> S saveAndFlush(S entity);

	void flush();

	boolean existsById(Integer id);

	<S extends Categorys> List<S> saveAll(Iterable<S> entities);

	List<Categorys> findAllById(Iterable<Integer> ids);

	Optional<Categorys> findById(Integer id);

	List<Categorys> findAll(Sort sort);

	List<Categorys> findAll();

	Page<Categorys> findAll(Pageable pageable);

	<S extends Categorys> Optional<S> findOne(Example<S> example);

	<S extends Categorys> S save(S entity);

	
}
