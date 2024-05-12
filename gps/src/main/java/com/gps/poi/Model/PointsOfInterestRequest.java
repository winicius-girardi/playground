package com.gps.poi.Model;

public class PointsOfInterestRequest {

        private String title;
        private Integer coordX;
        private Integer coordY;


        public PointsOfInterestRequest(String title, Integer coordX, Integer coordY) {
            this.title = title;
            this.coordX = coordX;
            this.coordY = coordY;
        }

        public PointsOfInterestRequest() {
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
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

}
