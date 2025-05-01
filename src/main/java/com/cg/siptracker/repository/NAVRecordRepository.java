package com.cg.siptracker.repository;

import com.cg.siptracker.model.NAVRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface NAVRecordRepository extends JpaRepository<NAVRecord, Long> {
    boolean existsByFundNameAndDate(String fundName, LocalDate date);
     List<NAVRecord> findByFundNameContainingIgnoreCase(String fundName);

}
