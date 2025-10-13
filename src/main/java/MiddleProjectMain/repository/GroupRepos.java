package MiddleProjectMain.repository;

import MiddleProjectMain.model.Group;
import MiddleProjectMain.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepos extends JpaRepository<Group, Long> {
}
