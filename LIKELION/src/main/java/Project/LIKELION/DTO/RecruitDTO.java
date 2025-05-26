
package Project.LIKELION.DTO;

import java.util.Date;

import lombok.*;

@Builder
@Getter
@NoArgsConstructor//get메서드 자동 사용
@AllArgsConstructor
//웹드바이랑 조인컬럼
public class RecruitDTO {
    private int id;               // 아이디
    private String url;               // 구글폼 URL
    private Date applyDate;      // 서류 모집 날짜
    private Date announceDate;   // 합격자 발표 날짜
    private Date interviewDate;  // 면접 날짜
    private Date passDate;       // 최종 합격 날짜
    private Date otDate;         // OT 날짜
}


