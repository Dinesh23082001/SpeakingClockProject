package com.firstProject.SpeakingClock;


import com.firstProject.SpeakingClock.service.TimeConversionService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeConversionServiceTest {

    private final TimeConversionService timeConversionService = new TimeConversionService();

    @Test
    public void testMidnight() {
        assertEquals("It's Midnight", timeConversionService.convertTimeToWords("00:00"));
    }

    @Test
    public void testMidday() {
        assertEquals("It's Midday", timeConversionService.convertTimeToWords("12:00"));
    }

    @Test
    public void testSpecificTime() {
        assertEquals("It's eight thirty four", timeConversionService.convertTimeToWords("08:34"));
        assertEquals("It's eleven twenty five", timeConversionService.convertTimeToWords("11:25"));
    }
}
