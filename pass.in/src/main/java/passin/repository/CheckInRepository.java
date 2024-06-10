package passin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import passin.entities.CheckIn;

import java.util.Optional;

public interface CheckInRepository extends JpaRepository<CheckIn, Integer> {
    Optional<CheckIn> findByAttendeeId(String attendeeId);
}
