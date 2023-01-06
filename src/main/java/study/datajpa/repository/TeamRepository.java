package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Team;

/**
 * @since       2023.01.06
 * @author      tony
 * @description team repository
 **********************************************************************************************************************/
public interface TeamRepository extends JpaRepository<Team, Long> {
}