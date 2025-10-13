package MiddleProjectMain.Api;

import MiddleProjectMain.Dto.DtoGroup;
import MiddleProjectMain.Dto.DtoLecture;
import MiddleProjectMain.Service.GroupService;
import MiddleProjectMain.Service.LectureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/Group")
public class GroupApi {
    private final GroupService service;

    @GetMapping
    public ResponseEntity<?> getAll(){
        return new ResponseEntity(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id) {
        return new ResponseEntity(service.getById(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> add(@RequestBody DtoGroup dtoGroup ) {
        service.add(dtoGroup);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody DtoGroup dtoGroup) {
        service.update(dtoGroup,id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}