
package com.auth.integration.repository;

import com.auth.integration.model.GoogleSheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoogleSheetRepository extends JpaRepository<GoogleSheet, Long> {
}
