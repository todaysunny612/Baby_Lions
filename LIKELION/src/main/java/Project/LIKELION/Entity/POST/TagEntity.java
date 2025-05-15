package Project.LIKELION.Entity.POST;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Post")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class TagEntity {
    @Id
    @Column(name = "project_id")
    private Integer project_id;

    @Column(columnDefinition = "VARCHAR", nullable = false)
    private String name; //구글폼

}
