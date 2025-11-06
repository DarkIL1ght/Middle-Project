
package MiddleProjectMain;

import MiddleProjectMain.Dto.DtoStudent;
import MiddleProjectMain.Service.StudentService;
import MiddleProjectMain.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentMapperTest {
    private final StudentService service = new StudentService(null);
    @Test
    void testToDto() {
        Student student = new Student();
        student.setId(1L);
        student.setName("John");
        student.setSurname("Doe");
        student.setAge(20);

        DtoStudent dto = service.toDto(student);

        assertEquals(student.getId(), dto.getId());
        assertEquals(student.getName(), dto.getName());
        assertEquals(student.getSurname(), dto.getSurname());
        assertEquals(student.getAge(), dto.getAge());
    }

    @Test
    void testToEntity() {
        DtoStudent dto = new DtoStudent();
        dto.setId(2L);
        dto.setName("Alice");
        dto.setSurname("Smith");
        dto.setAge(25);

        Student student = service.toEntity(dto);

        assertEquals(dto.getId(), student.getId());
        assertEquals(dto.getName(), student.getName());
        assertEquals(dto.getSurname(), student.getSurname());
        assertEquals(dto.getAge(), student.getAge());
    }
}
