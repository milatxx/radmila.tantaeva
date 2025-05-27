package be.radmila.radmila.tantaeva.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Activiteit {
    @Id @GeneratedValue
    private Long id;

    @NotNull
    private LocalDateTime moment;

    @NotBlank
    private String naam;

    @NotBlank
    private String uitleg;

    @NotBlank
    private String organisator;

    @Email
    private String contactEmail;

    @ManyToOne
    @NotNull
    private Locatie locatie;
}
