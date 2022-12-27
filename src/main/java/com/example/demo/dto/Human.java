package com.example.demo.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Human {
    private String name;
    private int age;
    private String sex;
}
