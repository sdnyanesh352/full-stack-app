package com.universal.containx.service.impl;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DailyStreakImpl {

    private LocalDate lastDate;
    private int streakCount;

    public DailyStreakImpl(LocalDate lastDate, int streakCount) {
        this.lastDate = lastDate;
        this.streakCount = streakCount;
    }

    public void updateStreak() {
        LocalDate today = LocalDate.now();
        if (ChronoUnit.DAYS.between(lastDate, today) == 1) {
            streakCount++;
        } else if (ChronoUnit.DAYS.between(lastDate, today) > 1) {
            streakCount = 1;
        }
        lastDate = today;
    }

    public LocalDate getLastDate() {
        return lastDate;
    }

    public int getStreakCount() {
        return streakCount;
    }
}
