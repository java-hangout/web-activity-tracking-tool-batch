package com.jh.browsertime.tracker.repository;

import com.jh.browsertime.tracker.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<Url, Long> {
    // Custom query methods if needed
}
