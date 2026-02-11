package stackforg.dev.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stackforg.dev.consumer.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
