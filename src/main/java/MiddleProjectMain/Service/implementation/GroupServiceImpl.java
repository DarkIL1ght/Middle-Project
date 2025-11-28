package MiddleProjectMain.Service.implementation;


import MiddleProjectMain.Dto.DtoGroup;
import MiddleProjectMain.model.Group;
import java.util.List;

public interface GroupServiceImpl {
     void update();
     void add();
     void delete(Long id);
     DtoGroup toDto(Group group);
     Group toEntity(DtoGroup dtoGroup);
}
