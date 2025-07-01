package org.uni.hms.task;


import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.uni.hms.service.PatientService;

@Component
@Slf4j
@RequiredArgsConstructor
public class  ScheduledTasks {

    private final PatientService service;

    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
         service.emailSender();
    }
}