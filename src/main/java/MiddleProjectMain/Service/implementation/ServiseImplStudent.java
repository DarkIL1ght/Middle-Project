package MiddleProjectMain.Service.implementation;

import MiddleProjectMain.Dto.DtoStudent;
import MiddleProjectMain.model.Student;
import java.util.List;

public interface ServiseImplStudent {
     void update(DtoStudent dtoStudent, Long id);
     void add(DtoStudent dtoStudent);
     void delete(Long id);
     List<DtoStudent> getAll();
     DtoStudent getById(Long id);
     DtoStudent toDto(Student student);
     Student toEntity(DtoStudent dtoStudent);

}
