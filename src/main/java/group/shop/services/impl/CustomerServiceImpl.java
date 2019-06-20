package group.shop.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.shop.entity.Customers;
import group.shop.repositorys.CustomerRepository;
import group.shop.services.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Optional<Customers> findByName(String name) {
		return customerRepository.findByName(name);
	}

	@Override
	public Optional<Customers> findByPhone(String phone) {
		return customerRepository.findByPhone(phone);
	}

	@Override
	public <S extends Customers> S save(S entity) {
		return customerRepository.save(entity);
	}

	@Override
	public <S extends Customers> Iterable<S> saveAll(Iterable<S> entities) {
		return customerRepository.saveAll(entities);
	}

	@Override
	public Optional<Customers> findById(Integer id) {
		return customerRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return customerRepository.existsById(id);
	}

	@Override
	public Iterable<Customers> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Iterable<Customers> findAllById(Iterable<Integer> ids) {
		return customerRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return customerRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		customerRepository.deleteById(id);
	}

	@Override
	public void delete(Customers entity) {
		customerRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Customers> entities) {
		customerRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		customerRepository.deleteAll();
	}

	
	
}
