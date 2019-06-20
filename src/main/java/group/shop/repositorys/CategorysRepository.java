package group.shop.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import group.shop.entity.Categorys;
@Repository
public interface CategorysRepository extends JpaRepository<Categorys, Integer> {

}
