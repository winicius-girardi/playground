package com.gps.poi.Controller;


import com.gps.poi.Model.PointsOfInterest;
import com.gps.poi.Model.PointsOfInterestRequest;
import com.gps.poi.Service.PointsOfInterestService;
import com.gps.poi.repository.PointsOfInterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PointsOfInterestController {

    @Autowired
    private PointsOfInterestService pointsService;
    @Autowired
    private PointsOfInterestRepository pointsOfInterestRepository;

    @GetMapping("/poi")
    public ResponseEntity<List<?>> getAllPoints(){
        return ResponseEntity.ok(pointsOfInterestRepository.getAllPOI());
    }
    @PutMapping("/poi")
    public ResponseEntity<?> updatePointsOfInterest(@RequestBody PointsOfInterestRequest requestPOI){
        pointsService.validatorPOI(requestPOI);
        pointsOfInterestRepository.insertPOI(pointsService.returnPOI(requestPOI));
        return ResponseEntity.ok().build();
    }


}
