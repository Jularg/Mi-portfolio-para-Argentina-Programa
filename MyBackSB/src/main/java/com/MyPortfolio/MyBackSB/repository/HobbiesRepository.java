
package com.MyPortfolio.MyBackSB.repository;
import com.MyPortfolio.MyBackSB.model.Hobbies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface HobbiesRepository extends JpaRepository <Hobbies, Long> {
    
}
