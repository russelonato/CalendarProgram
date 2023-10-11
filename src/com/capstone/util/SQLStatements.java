package com.capstone.util;

/**
 * A POJO class that contains SQL Statements to be used.
 * 
 * @author Russel
 */
public class SQLStatements {
    /**
     * A SQL Statement for retrieving all existing reservedDates from tbl_receipt
     */
    public static final String CAPSTONESQL_RCP001 = "SELECT reservationDate FROM tbl_receipt";
    
    /**
     * A SQL Statement for retrieving all existing transaction_rdate from tbl_transaction
     */
    public static final String CAPSTONESQL_TRN001 = "SELECT transaction_rdate FROM tbl_transaction";
}
