package MiddleProjectMain.repository;

import MiddleProjectMain.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Struct;

public interface StudentRepos extends JpaRepository<Student, Long> {
}
