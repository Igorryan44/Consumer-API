package stackforg.dev.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stackforg.dev.consumer.model.System;

@Repository
public interface SystemRepository extends JpaRepository<System, Long> {
}
