package com.example.demo9.entity;

import java.time.LocalDate; // java.sql.Date から変更
import lombok.Data;

@Data 
public class Review {

    private Integer restaurantId;
    private String userId;
    private LocalDate visitDate;
    private Integer rating;
    private String comment;

}