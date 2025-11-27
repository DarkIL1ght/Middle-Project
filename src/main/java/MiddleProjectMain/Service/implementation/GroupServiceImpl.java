package MiddleProjectMain.Service.implementation;


import MiddleProjectMain.Dto.DtoGroup;
import MiddleProjectMain.model.Group;
import java.util.List;

public interface GroupServiceImpl {
     void update(DtoGroup dtoGroup, Long id);
     void add(DtoGroup dtoGroup);
     void delete(Long id);
     List<DtoGroup> getAll();
     DtoGroup getById(Long id);
     DtoGroup toDto(Group group);
     Group toEntity(DtoGroup dtoGroup);
}
