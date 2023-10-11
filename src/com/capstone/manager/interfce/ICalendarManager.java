package com.capstone.manager.interfce;

import java.util.Date;
import java.util.List;

/**
 * A Manager interface that holds all functions with regards to calendar.
 * 
 * @author Russel
 */
public interface ICalendarManager {
    
    /**
     * Loads all currently reserved dates and returns it back to the caller.
     * 
     * @return List of Dates
     */
    public List<Date> loadReservedDates();
}
