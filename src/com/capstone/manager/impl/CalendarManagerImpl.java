package com.capstone.manager.impl;

import com.capstone.dao.impl.TransactionDAOImpl;
import com.capstone.dao.interfce.ITransactionDAO;
import com.capstone.manager.interfce.ICalendarManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * A manager object that implements ICalendarManager.
 *
 * @author Russel
 */
public class CalendarManagerImpl implements ICalendarManager {

    @Override
    public List<Date> loadReservedDates() {
        ITransactionDAO transactionDAO = new TransactionDAOImpl();
        List<Date> reservedDates = null;
        List<String> retrivedDates = null;
        SimpleDateFormat formatter = null;

        formatter = new SimpleDateFormat("yyyy-MM-dd");
        retrivedDates = transactionDAO.retrieveReservedDates();

        try {
            for (String retrievedDate : retrivedDates) {
                if (reservedDates == null) {
                    reservedDates = new ArrayList<Date>();
                }

                try {
                    reservedDates.add(formatter.parse(retrievedDate));
                } catch (ParseException e) {
                    System.err.println("Date is in invalid format. Please use yyyy-MM-dd.");
                }
            }
        } catch (NullPointerException e) {
            System.err.println("No data found.");
        }

        return reservedDates;
    }

}
