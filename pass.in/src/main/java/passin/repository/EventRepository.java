package passin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import passin.entities.Event;

public interface EventRepository extends JpaRepository<Event, String> {
}
