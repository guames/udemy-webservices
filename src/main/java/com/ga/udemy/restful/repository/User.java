package com.ga.udemy.restful.repository;

import lombok.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {

    private Long id;
    private String name;
    private Date birthDate;

}
