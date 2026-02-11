package stackforg.dev.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stackforg.dev.consumer.model.Endpoint;

@Repository
public interface EndpointRepository extends JpaRepository<Endpoint, Long> {
}
