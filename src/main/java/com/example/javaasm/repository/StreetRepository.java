package com.example.javaasm.repository;

import com.example.javaasm.entity.Street;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StreetRepository extends JpaRepository<Street, Integer> {

    public Page<Street> findStreetByNameContainsAndDistrictName(String streetName, String districtId, Pageable pageable);

    public Page<Street> findStreetsByNameContains(String streetName, Pageable pageable);

    public Page<Street> findStreetByDistrictName(String districtName, Pageable pageable);
}
