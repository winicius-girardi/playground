package com.gps.poi.Service;

import com.gps.poi.Model.PointsOfInterest;
import com.gps.poi.Model.PointsOfInterestRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class PointsOfInterestService {


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
}
