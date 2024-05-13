package com.gps.poi.Controller;


import com.gps.poi.Model.NearbyPOI;
import com.gps.poi.Model.PointsOfInterestRequest;
import com.gps.poi.Service.PointsOfInterestService;
import com.gps.poi.repository.PointsOfInterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PointsOfInterestController {


    private final PointsOfInterestService pointsService;


    @Autowired
    public PointsOfInterestController(PointsOfInterestService pointsService) {
        this.pointsService = pointsService;
    }


    @GetMapping("/poi")
    public ResponseEntity<List<?>> getAllPoints(){
        return ResponseEntity.ok(pointsService.getAllPOI());
    }
    @PostMapping("/poi")
    public ResponseEntity<?> updatePointsOfInterest(@RequestBody PointsOfInterestRequest requestPOI){
        pointsService.validatorPOI(requestPOI);
        pointsService.createPOI(pointsService.returnPOI(requestPOI));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @GetMapping("/poi/nearby")
    public ResponseEntity<?> nearbyPoints(@RequestBody NearbyPOI requestPOI){
        var poiNearby=pointsService.findByProximity(requestPOI);
        return ResponseEntity.ok().body(poiNearby);
    }

}
