package Project.LIKELION.controller;

import Project.LIKELION.DTO.RecruitDTO;
import Project.LIKELION.Entity.RecruitEntity;
import Project.LIKELION.Service.RecruitService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController //그냥으로 하면 메소드마다 뭘 붙여줘야 했었옹
@RequestMapping("/api/recruit")

public class RecruitController {
    private final RecruitService recruitService;



    @GetMapping
    public ResponseEntity<RecruitDTO> getRecruit() {
        RecruitDTO dto = recruitService.getRecruit();

        return ResponseEntity.ok().body(dto);
    }
}
