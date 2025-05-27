package be.radmila.radmila.tantaeva.config;

import be.radmila.radmila.tantaeva.model.Activiteit;
import be.radmila.radmila.tantaeva.model.Locatie;
import be.radmila.radmila.tantaeva.repository.ActiviteitRepository;
import be.radmila.radmila.tantaeva.repository.LocatieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDateTime;

@Configuration
public class DataLoader {
    @Bean
    CommandLineRunner loadData(LocatieRepository locatieRepo, ActiviteitRepository activiteitRepo) {
        return args -> {
            Locatie zaal = new Locatie(null, "Gemeentezaal", "Plein 1", 100);
            Locatie cc = new Locatie(null, "Cultuurhuis", "Kunstlaan 5", 200);
            locatieRepo.save(zaal);
            locatieRepo.save(cc);

            activiteitRepo.save(new Activiteit(null, LocalDateTime.now().plusDays(1),
                    "Voedselbedeling", "Voor mensen in nood", "NGO", "hulp@ngo.be", zaal));
            activiteitRepo.save(new Activiteit(null, LocalDateTime.now().plusDays(2),
                    "Koffienamiddag", "Gezellig samenzijn", "PartnerX", "contact@partner.be", cc));
        };
    }
}
