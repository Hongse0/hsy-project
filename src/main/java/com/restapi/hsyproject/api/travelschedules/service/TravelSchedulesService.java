package com.restapi.hsyproject.api.travelschedules.service;

import com.restapi.hsyproject.api.travelschedules.dto.TravelSchedulesDto;
import com.restapi.hsyproject.api.travelschedules.entitiy.TravelSchedules;
import com.restapi.hsyproject.api.travelschedules.repository.TravelSchedulesRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TravelSchedulesService {

    private final TravelSchedulesRepository travelSchedulesRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public String insertSchedules(TravelSchedulesDto travelSchedulesDto) {

        TravelSchedules travelSchedules = modelMapper.map(travelSchedulesDto, TravelSchedules.class);
        travelSchedulesRepository.save(travelSchedules);

        return "스케줄 저장성공";
    }

}
