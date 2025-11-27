package MiddleProjectMain.Service.implementation;


import MiddleProjectMain.Dto.DtoLecture;
import MiddleProjectMain.model.Lecture;
import java.util.List;

public interface LectureServiceImpl {
     void update(DtoLecture dtoLecture, Long id);
     void add(DtoLecture dtoLecture);
     void delete(Long id);
     List<DtoLecture> getAll();
     DtoLecture getById(Long id);
     DtoLecture toDto(Lecture lecture);

     Lecture toEntity(DtoLecture dtoLecture);
}
