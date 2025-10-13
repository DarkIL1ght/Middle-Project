package MiddleProjectMain.repository;

import MiddleProjectMain.model.Lecture;
import MiddleProjectMain.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepos extends JpaRepository<Lecture, Long> {
}
