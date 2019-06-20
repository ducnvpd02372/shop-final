package group.shop.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import group.shop.entity.Transactions;

@Repository
public interface TransactionRepository extends CrudRepository<Transactions, Integer> {

}
