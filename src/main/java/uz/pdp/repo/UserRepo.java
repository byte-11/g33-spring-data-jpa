package uz.pdp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
}
