package com.gps.poi.repository;


import com.gps.poi.Model.NearbyPOI;
import com.gps.poi.Model.PointsOfInterest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class PointsOfInterestRepository  {


    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PointsOfInterestRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<PointsOfInterest> getAllPOI() {
        return jdbcTemplate.query("SELECT * FROM Points_of_interest", new BeanPropertyRowMapper<>(PointsOfInterest.class));
    }

    @Transactional
    public void insertPOI(PointsOfInterest pointsOfInterest) {
        String query = "INSERT INTO Points_of_interest (title, coord_x, coord_y) VALUES (?, ?, ?)";
        jdbcTemplate.update(query, pointsOfInterest.getTitle(), pointsOfInterest.getCoordX(), pointsOfInterest.getCoordY());
    }

    public List<PointsOfInterest> getPointsOfInterestByRange(NearbyPOI referencePOI) {
        String query = "SELECT * FROM Points_of_interest WHERE coord_x >= ? AND coord_x <= ? AND coord_y >= ? AND coord_y <= ?";
        Object[] params = {referencePOI.getCoordX() - referencePOI.getMaxDistance(),
                referencePOI.getCoordX() + referencePOI.getMaxDistance(),
                referencePOI.getCoordY() - referencePOI.getMaxDistance(),
                referencePOI.getCoordY() + referencePOI.getMaxDistance()};
        return jdbcTemplate.query(query, params, new BeanPropertyRowMapper<>(PointsOfInterest.class));
    }
}
