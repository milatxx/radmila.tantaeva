package be.radmila.radmila.tantaeva.repository;

import be.radmila.radmila.tantaeva.model.Activiteit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActiviteitRepository extends JpaRepository<Activiteit, Long> {
    List<Activiteit> findTop10ByOrderByMomentDesc();
}
