package com.gps.poi.repository;


import com.gps.poi.Model.PointsOfInterest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class PointsOfInterestRepository  {


    private final JdbcTemplate jdbcTemplate;
    public PointsOfInterestRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<PointsOfInterest> getAllPOI() {
        return jdbcTemplate.query("SELECT * FROM Points_of_interest", new BeanPropertyRowMapper<PointsOfInterest>(PointsOfInterest.class));
    }

    @Transactional
    public void insertPOI(PointsOfInterest pointsOfInterest) {
        jdbcTemplate.update("INSERT INTO Points_of_interest (title,coord_x,coord_y)"+ "VALUES(?,?,?)",pointsOfInterest.getTitle(),pointsOfInterest.getCoordX(),pointsOfInterest.getCoordY());
    }
}
