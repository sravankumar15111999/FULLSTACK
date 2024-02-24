package com.pattern.ArchitecturePattern;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepo extends JpaRepository<Account, Integer> {



    @Modifying
    @Transactional
    @Query("update Account set balance=?1 where number=?2")
    void updateBalance(long balance, int number);


    @Modifying
    @Query(value = "update Account set name =?1 where number =?2", nativeQuery = true)
    void updateName(@Param("name") String name, @Param("number") int number);


    /*@Modifying
    @Query(value = "update Account set name =?1 where number =?2", nativeQuery = true)
    void updateName(@Param("name") String name, @Param("number") int number);*/
}
