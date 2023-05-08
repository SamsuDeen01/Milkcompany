package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Arokya;

import jakarta.transaction.Transactional;

public interface Arokyarepo extends JpaRepository<Arokya, Integer> {
@Query(value="select * from product_bill_details",nativeQuery = true)
public List<Arokya> getAllDataQ();

@Query(value="select * from product_bill_details where id=:id",nativeQuery = true)
public List<Arokya> getbyidQ(@Param("id")int id);

@Query(value="select * from product_bill_details where id between :start and :end",nativeQuery = true)
public List<Arokya> getbetweenQ(@Param("start")int start,@Param("end")int end);

@Query("select C from Arokya C where C.name=:name")
public List<Arokya>getQ(String name);

@Modifying
@Transactional
@Query(value="delete from product_bill_details where pieces=?1 and quantity=?2",nativeQuery = true)
Integer deletebyIdQ(@Param("pieces")String pieces,@Param("quantity")String quantity);

@Modifying
@Transactional
@Query(value="update from product_bill_details set quantity=:quantity where name=:name",nativeQuery = true)
public void update1Q(@Param("quantity")String quantity,@Param("name")String name);

@Modifying
@Transactional
@Query("update Arokya C set C.quantity=:quantity where C.id=:id")
public void updatejpQ(@Param("quantity")String quantity,@Param("id")int id);



@Modifying
@Transactional
@Query("delete from Arokya C where C.name=:name")
Integer deleteBynameQ(@Param("name")String name);

}
