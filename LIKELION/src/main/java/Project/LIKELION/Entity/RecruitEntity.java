//테이블 매핑 느낌
package Project.LIKELION.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Recruit")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class RecruitEntity {
    @Id //컬럼의 이름을 id로 하겟당
    @Column(name = "id")
    private Integer id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String url; //구글폼

    @Column(nullable = false) //nullable이 null값이 들어갈 수 있는지 없는지
    private Date applyDate;

    @Column(nullable = false) //nullable이 null값이 들어갈 수 있는지 없는지
    private Date announceDate;

    @Column(nullable = false) //nullable이 null값이 들어갈 수 있는지 없는지
    private Date interviewDate;

    @Column(nullable = false) //nullable이 null값이 들어갈 수 있는지 없는지
    private Date passDate;

    @Column(nullable = false) //nullable이 null값이 들어갈 수 있는지 없는지
    private Date otDate;
}
