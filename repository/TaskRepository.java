package com.firstproj.RESTAPI.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.scheduling.config.Task;
@SuppressWarnings("unused")
public interface TaskRepository extends JpaRepository<Task,Long> {

}
