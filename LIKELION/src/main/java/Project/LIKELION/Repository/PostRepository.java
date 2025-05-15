package Project.LIKELION.Repository;

import Project.LIKELION.DTO.POST.PostDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Project.LIKELION.Entity.POST.PostEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Integer> {
    Optional<Object> findById(PostDTO dto);
    // 어차피 포스트 엔티티에 태그 엔티티를 일대다로 매핑 시켜뒀으니까
    //여기서는 그냥 Jpa로 포스트 엔티티만 다루면 됨.
}
