package group.shop.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import group.shop.entity.Categorys;
import group.shop.repositorys.CategorysRepository;
import group.shop.services.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired 
	private CategorysRepository categorysRepository;

	@Override
	public <S extends Categorys> S save(S entity) {
		return categorysRepository.save(entity);
	}

	@Override
	public <S extends Categorys> Optional<S> findOne(Example<S> example) {
		return categorysRepository.findOne(example);
	}

	@Override
	public Page<Categorys> findAll(Pageable pageable) {
		return categorysRepository.findAll(pageable);
	}

	@Override
	public List<Categorys> findAll() {
		return categorysRepository.findAll();
	}

	@Override
	public List<Categorys> findAll(Sort sort) {
		return categorysRepository.findAll(sort);
	}

	@Override
	public Optional<Categorys> findById(Integer id) {
		return categorysRepository.findById(id);
	}

	@Override
	public List<Categorys> findAllById(Iterable<Integer> ids) {
		return categorysRepository.findAllById(ids);
	}

	@Override
	public <S extends Categorys> List<S> saveAll(Iterable<S> entities) {
		return categorysRepository.saveAll(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return categorysRepository.existsById(id);
	}

	@Override
	public void flush() {
		categorysRepository.flush();
	}

	@Override
	public <S extends Categorys> S saveAndFlush(S entity) {
		return categorysRepository.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<Categorys> entities) {
		categorysRepository.deleteInBatch(entities);
	}

	@Override
	public <S extends Categorys> Page<S> findAll(Example<S> example, Pageable pageable) {
		return categorysRepository.findAll(example, pageable);
	}

	@Override
	public long count() {
		return categorysRepository.count();
	}

	@Override
	public void deleteAllInBatch() {
		categorysRepository.deleteAllInBatch();
	}

	@Override
	public void deleteById(Integer id) {
		categorysRepository.deleteById(id);
	}

	@Override
	public Categorys getOne(Integer id) {
		return categorysRepository.getOne(id);
	}

	@Override
	public void delete(Categorys entity) {
		categorysRepository.delete(entity);
	}

	@Override
	public <S extends Categorys> long count(Example<S> example) {
		return categorysRepository.count(example);
	}

	@Override
	public void deleteAll(Iterable<? extends Categorys> entities) {
		categorysRepository.deleteAll(entities);
	}

	@Override
	public <S extends Categorys> boolean exists(Example<S> example) {
		return categorysRepository.exists(example);
	}

	@Override
	public void deleteAll() {
		categorysRepository.deleteAll();
	}

	@Override
	public <S extends Categorys> List<S> findAll(Example<S> example) {
		return categorysRepository.findAll(example);
	}

	@Override
	public <S extends Categorys> List<S> findAll(Example<S> example, Sort sort) {
		return categorysRepository.findAll(example, sort);
	}

	
	
}
