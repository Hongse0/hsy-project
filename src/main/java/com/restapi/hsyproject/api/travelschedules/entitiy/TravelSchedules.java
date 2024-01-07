package com.restapi.hsyproject.api.travelschedules.entitiy;

import com.restapi.hsyproject.api.user.entitiy.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "travel_schedules")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TravelSchedules {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "departure_date", nullable = false)
    private LocalDate departureDate;

    @Column(name = "arrival_date", nullable = false)
    private LocalDate arrivalDate;

    @Column(name = "theme", nullable = false, length = 50)
    private String theme;

    @Column(name = "destination", nullable = false, length = 255)
    private String destination;


}
