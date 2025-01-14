package com.project.chamjimayo.repository;

import com.project.chamjimayo.repository.domain.entity.UsedRestroom;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsedRestroomRepository extends JpaRepository<UsedRestroom, Long> {

  UsedRestroom findUsedRestroomByRestroomId(long restroomId);

  Optional<UsedRestroom> findUsedRestroomByReviewId(Long reviewId);
}
