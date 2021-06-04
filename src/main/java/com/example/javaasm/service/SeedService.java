package com.example.javaasm.service;

import com.example.javaasm.entity.District;
import com.example.javaasm.entity.Street;
import com.example.javaasm.repository.DistrictRepository;
import com.example.javaasm.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SeedService {
    @Autowired
    private StreetRepository streetRepository;
    @Autowired
    private DistrictRepository districtRepository;

    public boolean seed() {
        this.saveDistrict();

        return true;
    }

    private void saveDistrict() {
        List<District> districtList = new ArrayList<District>();

        District district = new District();
        district.setName("Thanh Xuan Trung");
        HashSet<Street> streetList = new HashSet<Street>();
        streetList.add(new Street("Vu Trong Phung", System.currentTimeMillis(), district, "Main road to Nguyen Trai", 1));
        streetList.add(new Street("Nguyen Tuan", System.currentTimeMillis(), district, "Secondary road to Nguyen Trai", 1));
        district.setStreetSet(streetList);
        districtList.add(district);
//        districtRepository.save(district);

        District district2 = new District();
        district2.setName("Thanh Xuan Nam");
        HashSet<Street> streetList2 = new HashSet<Street>();
        streetList.add(new Street( "Street at Thanh Xuan Nam", System.currentTimeMillis(), district2, "Street In Thanh Xuan Name", 2));
        streetList.add(new Street("Another street at Thanh Xuan Name", System.currentTimeMillis(), district2, "Street In Thanh Xuan Name", 1));
        district2.setStreetSet(streetList2);
        districtList.add(district2);
//        districtRepository.save(district2);

        District district3 = new District();
        district3.setName("Thanh Xuan Bac");
        HashSet<Street> streetList3 = new HashSet<Street>();
        streetList.add(new Street("Khuat Duy Tien", System.currentTimeMillis(), district3, "Main road to Nguyen Trai", 3));
        streetList.add(new Street( "Some Street at Street", System.currentTimeMillis(), district3, "Secondary road to Nguyen Trai", 2));
        district3.setStreetSet(streetList3);
        districtList.add(district3);
//        districtRepository.save(district3);

        District district4 = new District();
        district4.setName("Nhan Chinh");
        HashSet<Street> streetList4 = new HashSet<Street>();
        streetList.add(new Street("Hoang Dao Thuy", System.currentTimeMillis(), district4, "Main road to Nguyen Trai", 3));
        streetList.add(new Street("Nguyen Nhu Kon Tum", System.currentTimeMillis(), district4, "Secondary road to Nguyen Trai", 1));
        district4.setStreetSet(streetList4);
        districtList.add(district4);
//        districtRepository.save(district4);

        District district5 = new District();
        district5.setName("Nam Tu Liem");
        HashSet<Street> streetList5 = new HashSet<Street>();
        streetList.add(new Street("Ton That Thuyet", System.currentTimeMillis(), district5, "Main road to Nguyen Hung", 3));
        streetList.add(new Street("Duy Tan", System.currentTimeMillis(), district5, "Secondary road to Nguyen Hung", 1));
        district5.setStreetSet(streetList5);
        districtList.add(district5);
//        districtRepository.save(district5);

        districtRepository.saveAll(districtList);
    }
}
