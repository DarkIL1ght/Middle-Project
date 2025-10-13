package MiddleProjectMain.Api;

import MiddleProjectMain.Dto.DtoStudent;
import MiddleProjectMain.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/Student")
public class StudentApi {
    private final StudentService service;

    @GetMapping
    public ResponseEntity<?> getAll(){
        return new ResponseEntity(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id) {
        return new ResponseEntity(service.getById(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> add(@RequestBody DtoStudent dtoStudent) {
        service.add(dtoStudent);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody DtoStudent dtoStudent) {
        service.update(dtoStudent,id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }





}














}
