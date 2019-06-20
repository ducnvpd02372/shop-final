package group.shop.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import group.shop.entity.Products;
import group.shop.repositorys.ProdutRepository;
import group.shop.services.ProdutService;

@Service
public class ProdutServiceImpl implements ProdutService{
	@Autowired
	private ProdutRepository produtRepository;

	@Override
	public <S extends Products> S save(S entity) {
		return produtRepository.save(entity);
	}

	@Override
	public <S extends Products> Optional<S> findOne(Example<S> example) {
		return produtRepository.findOne(example);
	}

	@Override
	public Page<Products> findAll(Pageable pageable) {
		return produtRepository.findAll(pageable);
	}

	@Override
	public List<Products> findAll() {
		return produtRepository.findAll();
	}

	@Override
	public List<Products> findAll(Sort sort) {
		return produtRepository.findAll(sort);
	}

	@Override
	public Optional<Products> findById(Integer id) {
		return produtRepository.findById(id);
	}

	@Override
	public List<Products> findAllById(Iterable<Integer> ids) {
		return produtRepository.findAllById(ids);
	}

	@Override
	public <S extends Products> List<S> saveAll(Iterable<S> entities) {
		return produtRepository.saveAll(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return produtRepository.existsById(id);
	}

	@Override
	public void flush() {
		produtRepository.flush();
	}

	@Override
	public <S extends Products> S saveAndFlush(S entity) {
		return produtRepository.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<Products> entities) {
		produtRepository.deleteInBatch(entities);
	}

	@Override
	public <S extends Products> Page<S> findAll(Example<S> example, Pageable pageable) {
		return produtRepository.findAll(example, pageable);
	}

	@Override
	public long count() {
		return produtRepository.count();
	}

	@Override
	public void deleteAllInBatch() {
		produtRepository.deleteAllInBatch();
	}

	@Override
	public void deleteById(Integer id) {
		produtRepository.deleteById(id);
	}

	@Override
	public Products getOne(Integer id) {
		return produtRepository.getOne(id);
	}

	@Override
	public void delete(Products entity) {
		produtRepository.delete(entity);
	}

	@Override
	public <S extends Products> long count(Example<S> example) {
		return produtRepository.count(example);
	}

	@Override
	public void deleteAll(Iterable<? extends Products> entities) {
		produtRepository.deleteAll(entities);
	}

	@Override
	public <S extends Products> boolean exists(Example<S> example) {
		return produtRepository.exists(example);
	}

	@Override
	public void deleteAll() {
		produtRepository.deleteAll();
	}

	@Override
	public <S extends Products> List<S> findAll(Example<S> example) {
		return produtRepository.findAll(example);
	}

	@Override
	public <S extends Products> List<S> findAll(Example<S> example, Sort sort) {
		return produtRepository.findAll(example, sort);
	}

	
}
