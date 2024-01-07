package com.restapi.hsyproject.api.travelschedules.dto;

import com.restapi.hsyproject.api.user.dto.UserDto;
import com.restapi.hsyproject.api.user.entitiy.User;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TravelSchedulesDto {

    private Integer id;
    private UserDto user;
    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private String theme;
    private String destination;

}
