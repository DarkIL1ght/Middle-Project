package MiddleProjectMain.Service;


import MiddleProjectMain.Dto.DtoGroup;
import MiddleProjectMain.Dto.DtoStudent;
import MiddleProjectMain.Service.implementation.GroupServiceImpl;
import MiddleProjectMain.model.Group;
import MiddleProjectMain.model.Student;
import MiddleProjectMain.repository.GroupRepos;
import MiddleProjectMain.repository.StudentRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupService implements GroupServiceImpl {
    final GroupRepos groupRepos;

    public void update(DtoGroup dtoGroup, Long id){
        Group group = groupRepos.findById(id).orElse(null);

        group.setId(dtoGroup.getId());
        group.setName(dtoGroup.getName());
        group.setDescription(dtoGroup.getDescription());

        groupRepos.save(group);
    }
    public void add(DtoGroup dtoGroup){groupRepos.save(toEntity(dtoGroup));}
    public void delete(Long id){groupRepos.deleteById(id);}
    public List<DtoGroup> getAll(){
        List<DtoGroup> dtoGroups = new ArrayList<>();
        List <Group> groups = groupRepos.findAll();

        for (Group s : groups){dtoGroups.add(toDto(s));}
        return dtoGroups;
    }
    public DtoGroup getById(Long id){return toDto(groupRepos.findById(id).orElse(null));}

    public DtoGroup toDto(Group group){
        DtoGroup dtoGroup = new DtoGroup();

        dtoGroup.setId(group.getId());
        dtoGroup.setName(group.getName());
        dtoGroup.setDescription(group.getDescription());

        return dtoGroup;
    }
    public Group toEntity(DtoGroup dtoGroup){
        Group group = new Group();

        group.setId(dtoGroup.getId());
        group.setName(dtoGroup.getName());
        group.setDescription(dtoGroup.getDescription());

        return group;
    }
}
