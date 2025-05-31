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
            Locatie zaal = new Locatie("Gemeentezaal", "Plein 1", 100);
            Locatie cc = new Locatie("Cultuurhuis", "Kunstlaan 5", 200);
            locatieRepo.save(zaal);
            locatieRepo.save(cc);

            activiteitRepo.save(new Activiteit(
                LocalDateTime.now().plusDays(1),
                "Voedselbedeling",
                "Voor mensen in nood",
                "NGO",
                "hulp@ngo.be",
                zaal,
                "Iedereen"
            ));

            activiteitRepo.save(new Activiteit(
                LocalDateTime.now().plusDays(2),
                "Koffienamiddag",
                "Gezellig samenzijn",
                "PartnerX",
                "contact@partner.be",
                cc,
                "Senioren"
            ));

            activiteitRepo.save(new Activiteit(
                LocalDateTime.of(2025, 6, 8, 20, 0),
                "Open Mic Avond",
                "Kom langs en deel je talent: muziek, comedy, poëzie of verhalen. Iedereen welkom!",
                "Jong Anderlecht",
                "openmic@jonganderlecht.be",
                cc,
                "Jongeren en volwassenen"
            ));

            activiteitRepo.save(new Activiteit(
                LocalDateTime.of(2025, 6, 10, 11, 0),
                "Boekensalon & Ruilbeurs",
                "Ruil je gelezen boeken in voor nieuwe pareltjes. Gratis koffie en boekentips inbegrepen!",
                "Bib & Buurt",
                "boeken@bibbuurt.be",
                cc,
                "Boekenliefhebbers van alle leeftijden"
            ));

            activiteitRepo.save(new Activiteit(
                LocalDateTime.of(2025, 6, 12, 14, 0),
                "Creatieve Workshop",
                "Schilderen, tekenen en knutselen in groep, begeleid door lokale kunstenaars.",
                "Kunst voor Allen",
                "creatief@kunst.be",
                zaal,
                "Volwassenen"
            ));

            activiteitRepo.save(new Activiteit(
                LocalDateTime.of(2025, 6, 13, 17, 30),
                "Kookworkshop Gezond Budget",
                "Leer gezonde maaltijden maken met beperkt budget. Gratis ingrediënten inbegrepen.",
                "SamenGezond",
                "info@samengezond.be",
                cc,
                "Gezinnen met kinderen"
            ));

            activiteitRepo.save(new Activiteit(
                LocalDateTime.of(2025, 6, 15, 9, 0),
                "Mindful Ochtend",
                "Start je dag rustig met meditatie en ademhalingsoefeningen.",
                "Mindful Anderlecht",
                "rust@mindful.be",
                cc,
                "Iedereen"
            ));

            activiteitRepo.save(new Activiteit(
                LocalDateTime.of(2025, 6, 17, 18, 0),
                "Taalcafé Nederlands",
                "Oefen je Nederlands met vrijwilligers in een gezellige sfeer.",
                "Taalhuis",
                "taalcafe@taalhuis.be",
                zaal,
                "Anderstaligen"
            ));

            activiteitRepo.save(new Activiteit(
                LocalDateTime.of(2025, 6, 18, 15, 0),
                "Game Namiddag",
                "Gezellige spelletjesnamiddag met bordspellen en retro consoles.",
                "Jeugdcentrum XL",
                "spel@jeugdxl.be",
                cc,
                "Jongeren"
            ));

            activiteitRepo.save(new Activiteit(
                LocalDateTime.of(2025, 6, 20, 10, 0),
                "Brei- & Haakclub",
                "Samen handwerken en ervaringen delen. Beginners welkom!",
                "Creatief Punt",
                "handwerk@punt.be",
                zaal,
                "Senioren en liefhebbers"
            ));
        };
    }
}
                
                

