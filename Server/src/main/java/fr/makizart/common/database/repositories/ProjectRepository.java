package fr.makizart.common.database.repositories;

import fr.makizart.common.database.table.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {

}

