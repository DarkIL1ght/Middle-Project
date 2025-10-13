package MiddleProjectMain.Service;


import MiddleProjectMain.Dto.DtoGroup;
import MiddleProjectMain.Dto.DtoLecture;
import MiddleProjectMain.model.Group;
import MiddleProjectMain.model.Lecture;
import MiddleProjectMain.repository.GroupRepos;
import MiddleProjectMain.repository.LectureRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LectureService {
    final LectureRepos lectureRepos;
    Lecture lecture DtoLecture dtoLecture
    public void update(DtoLecture dtoLecture, Long id){
        Lecture lecture = lectureRepos.findById(id).orElse(null);

        lecture.setId(dtoLecture.getId());
        lecture.setName(dtoLecture.getName());
        lecture.setDescription(dtoLecture.getDescription());

        lectureRepos.save(lecture);
    }
    public void add(DtoLecture dtoLecture){lectureRepos.save(toEntity(dtoLecture));}
    public void delete(Long id){lectureRepos.deleteById(id);}
    public List<DtoLecture> getAll(){
        List <DtoLecture> dtoLectures = new ArrayList<>();
        List <Lecture> lectures = lectureRepos.findAll();

        for (Lecture s : lectures){dtoLectures.add(toDto(s));}
        return dtoLectures;
    }
    public DtoLecture getById(Long id){return toDto(lectureRepos.findById(id).orElse(null));}

    public DtoLecture toDto(Lecture lecture){
        DtoLecture dtoLecture = new DtoLecture();

        dtoLecture.setId(lecture.getId());
        dtoLecture.setName(lecture.getName());
        dtoLecture.setDescription(lecture.getDescription());

        return dtoLecture;
    }
    public Lecture toEntity(DtoLecture dtoLecture){
        Lecture lecture = new Lecture();

        lecture.setId(dtoLecture.getId());
        lecture.setName(dtoLecture.getName());
        lecture.setDescription(dtoLecture.getDescription());

        return lecture;
    }
}
