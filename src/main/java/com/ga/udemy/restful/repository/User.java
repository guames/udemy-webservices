package com.ga.udemy.restful.repository;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private Long id;
    private String name;
    private Date birthDate;

}
