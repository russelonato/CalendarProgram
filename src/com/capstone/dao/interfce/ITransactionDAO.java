package com.capstone.dao.interfce;

import java.util.List;

/**
 * An interface DAO that corresponds to the table tbl_transaction
 * 
 * @author Russel
 */
public interface ITransactionDAO {
    
    /**
     * Retrieves a list of the transaction_rdates from all the rows of the tbl_transaction table.
     * 
     * @return List of Strings 
     */
    public List<String> retrieveReservedDates();
}
