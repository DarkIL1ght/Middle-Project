package MiddleProjectMain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "t_name")
    private String name;
    @Column(name = "t_surname")
    private String surname;
    private int age;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Group> groups;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Lecture> lectures;
}
