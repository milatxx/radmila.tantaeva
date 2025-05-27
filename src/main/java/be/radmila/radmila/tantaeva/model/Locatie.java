package be.radmila.radmila.tantaeva.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Locatie {
    @Id @GeneratedValue
    private Long id;
    private String naam;
    private String adres;
    private int capaciteit;
}
