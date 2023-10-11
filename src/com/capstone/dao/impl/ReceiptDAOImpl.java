package com.capstone.dao.impl;

import com.capstone.dao.interfce.IReceiptDAO;
import com.capstone.util.SQLHelper;
import com.capstone.util.SQLStatements;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * A DAO object that handles database functions to 'tbl_receipt'.
 * 
 * @author Russel
 */
public class ReceiptDAOImpl implements IReceiptDAO {

    @Override
    public List<Date> retrieveReservedDates() {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Date> reservedDates = null;

        connection = SQLHelper.getConnection();
        try {
            statement = connection.prepareStatement(SQLStatements.CAPSTONESQL_RCP001);
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                if(reservedDates == null){
                    reservedDates = new ArrayList<Date>();
                }
                
                reservedDates.add(resultSet.getDate("reservationDate"));
            }
            
        } catch (SQLException e) {

        }

        return reservedDates;
    }

}
