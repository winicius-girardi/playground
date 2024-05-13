package com.gps.poi.Service;

import com.gps.poi.Model.NearbyPOI;
import com.gps.poi.Model.PointsOfInterest;
import com.gps.poi.Model.PointsOfInterestRequest;
import com.gps.poi.repository.PointsOfInterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointsOfInterestService {


    private final PointsOfInterestRepository pointsOfInterestRepository;

    @Autowired
    public PointsOfInterestService(PointsOfInterestRepository pointsOfInterestRepository1){
        this.pointsOfInterestRepository = pointsOfInterestRepository1;
    }


    public void validatorPOI(PointsOfInterestRequest pointsOfInterest) {
        if(pointsOfInterest.getCoordX() == null ||
                pointsOfInterest.getCoordX()<0||
                pointsOfInterest.getCoordY()==null||
                pointsOfInterest.getCoordY()<0)
            throw new IllegalArgumentException("Coords  cannot be null or negative");
        if(pointsOfInterest.getTitle().isEmpty())
            throw new IllegalArgumentException("Title cannot be empty/null");
    }

    public PointsOfInterest returnPOI(PointsOfInterestRequest request) {
        return new PointsOfInterest(request.getTitle(), request.getCoordX(), request.getCoordY());
    }

    public List<PointsOfInterest> findByProximity(NearbyPOI request) {
        return pointsOfInterestRepository.getPointsOfInterestByRange(request);
    }

    public void createPOI(PointsOfInterest pointsOfInterest) {
        pointsOfInterestRepository.insertPOI(pointsOfInterest);
    }

    public List<?> getAllPOI() {
        return pointsOfInterestRepository.getAllPOI();
    }
}
