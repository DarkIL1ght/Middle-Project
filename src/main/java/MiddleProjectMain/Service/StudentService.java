package MiddleProjectMain.Service;


import MiddleProjectMain.Dto.DtoStudent;
import MiddleProjectMain.model.Student;
import MiddleProjectMain.repository.StudentRepos;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    final StudentRepos studentRepos;

    public void update(DtoStudent dtoStudent, Long id){
        Student student = studentRepos.findById(id).orElse(null);

        student.setId(dtoStudent.getId());
        student.setName(dtoStudent.getName());
        student.setSurname(dtoStudent.getSurname());
        student.setAge(student.getAge());

        studentRepos.save(student);
    }
    public void add(DtoStudent dtoStudent){studentRepos.save(toEntity(dtoStudent));}
    public void delete(Long id){studentRepos.deleteById(id);}
    public List<DtoStudent> getAll(){
        List<DtoStudent> dtoStudents = new ArrayList<>();
        List <Student> students = studentRepos.findAll();

        for (Student s : students){dtoStudents.add(toDto(s));}
        return dtoStudents;
    }
    public DtoStudent getById(Long id){return toDto(studentRepos.findById(id).orElse(null));}

    public DtoStudent toDto(Student student){
        DtoStudent dtoStudent = new DtoStudent();

        dtoStudent.setId(student.getId());
        dtoStudent.setName(student.getName());
        dtoStudent.setSurname(student.getSurname());
        dtoStudent.setAge(student.getAge());

        return dtoStudent;
    }
    public Student toEntity(DtoStudent dtoStudent){
        Student student = new Student();

        student.setId(dtoStudent.getId());
        student.setName(dtoStudent.getName());
        student.setSurname(dtoStudent.getSurname());
        student.setAge(dtoStudent.getAge());

        return student;
    }


}
