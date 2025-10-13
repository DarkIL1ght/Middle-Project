package MiddleProjectMain.Dto;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "t_name")
    private String name;
    @Column(name = "t_surname")
    private String surname;
    private int age;

}
