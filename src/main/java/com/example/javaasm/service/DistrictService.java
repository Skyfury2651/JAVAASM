package com.example.javaasm.service;

import com.example.javaasm.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictService {
    @Autowired
    private DistrictRepository districtRepository;
}
