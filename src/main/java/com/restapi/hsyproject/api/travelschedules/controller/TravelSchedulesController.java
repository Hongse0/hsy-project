package com.restapi.hsyproject.api.travelschedules.controller;

import com.restapi.hsyproject.api.common.ResponseDTO;
import com.restapi.hsyproject.api.travelschedules.dto.TravelSchedulesDto;
import com.restapi.hsyproject.api.travelschedules.service.TravelSchedulesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/travelSchedules")
@RequiredArgsConstructor
public class TravelSchedulesController {

    private final TravelSchedulesService travelSchedulesService;

    @PostMapping("/schedule")
    public ResponseEntity<ResponseDTO> scheduleInsert(TravelSchedulesDto travelSchedulesDto) {

        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "유저의 스케줄 저장",
                travelSchedulesService.insertSchedules(travelSchedulesDto)));
    }


}
