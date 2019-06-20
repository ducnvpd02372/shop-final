package group.shop.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.shop.entity.Transactions;
import group.shop.repositorys.TransactionRepository;
import group.shop.services.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService{
@Autowired
private TransactionRepository transactionRepository;

@Override
public <S extends Transactions> S save(S entity) {
	return transactionRepository.save(entity);
}

@Override
public <S extends Transactions> Iterable<S> saveAll(Iterable<S> entities) {
	return transactionRepository.saveAll(entities);
}

@Override
public Optional<Transactions> findById(Integer id) {
	return transactionRepository.findById(id);
}

@Override
public boolean existsById(Integer id) {
	return transactionRepository.existsById(id);
}

@Override
public Iterable<Transactions> findAll() {
	return transactionRepository.findAll();
}

@Override
public Iterable<Transactions> findAllById(Iterable<Integer> ids) {
	return transactionRepository.findAllById(ids);
}

@Override
public long count() {
	return transactionRepository.count();
}

@Override
public void deleteById(Integer id) {
	transactionRepository.deleteById(id);
}

@Override
public void delete(Transactions entity) {
	transactionRepository.delete(entity);
}

@Override
public void deleteAll(Iterable<? extends Transactions> entities) {
	transactionRepository.deleteAll(entities);
}

@Override
public void deleteAll() {
	transactionRepository.deleteAll();
}

}
