package com.gps.poi.Model;

public class NearbyPOI {

    private Integer coordX;
    private Integer coordY;
    private Integer maxDistance;


    public NearbyPOI(Integer coordX, Integer coordY, Integer maxDistance) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.maxDistance = maxDistance;
    }

    public NearbyPOI(){

    }

    public Integer getCoordX() {
        return coordX;
    }

    public void setCoordX(Integer coordX) {
        this.coordX = coordX;
    }

    public Integer getCoordY() {
        return coordY;
    }

    public void setCoordY(Integer coordY) {
        this.coordY = coordY;
    }

    public Integer getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(Integer maxDistance) {
        this.maxDistance = maxDistance;
    }
}
