package com.jh.browsertime.tracker.repository;

import com.jh.browsertime.tracker.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit, Long> {
    // Custom query methods if needed
}
