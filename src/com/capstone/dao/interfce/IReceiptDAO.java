package com.capstone.dao.interfce;

import java.util.Date;
import java.util.List;

/**
 * A DAO Interface that handles database connections to 'tbl_receipt'.
 * 
 * @author Russel
 */
public interface IReceiptDAO {
    
    /**
     * Connects to the database and retrieves the attribute reservedDate from all rows.
     * 
     * @return List of Dates
     */
    public abstract List<Date> retrieveReservedDates();
    
}
