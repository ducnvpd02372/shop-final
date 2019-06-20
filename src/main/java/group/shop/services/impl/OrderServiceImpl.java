package group.shop.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.shop.entity.Orders;
import group.shop.repositorys.OrderRepository;
import group.shop.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public <S extends Orders> S save(S entity) {
		return orderRepository.save(entity);
	}

	@Override
	public <S extends Orders> Iterable<S> saveAll(Iterable<S> entities) {
		return orderRepository.saveAll(entities);
	}

	@Override
	public Optional<Orders> findById(Integer id) {
		return orderRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return orderRepository.existsById(id);
	}

	@Override
	public Iterable<Orders> findAll() {
		return orderRepository.findAll();
	}

	@Override
	public Iterable<Orders> findAllById(Iterable<Integer> ids) {
		return orderRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return orderRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		orderRepository.deleteById(id);
	}

	@Override
	public void delete(Orders entity) {
		orderRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Orders> entities) {
		orderRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		orderRepository.deleteAll();
	}
}
