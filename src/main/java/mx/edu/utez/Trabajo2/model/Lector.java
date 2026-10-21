package mx.edu.utez.Trabajo2.model;


import jakarta.persistence.*;
import lombok.*;

@Table(name = "Lectores")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Boolean activo= true;

    @Column()
    private Boolean
}
