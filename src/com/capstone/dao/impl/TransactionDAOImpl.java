package com.capstone.dao.impl;

import com.capstone.dao.interfce.ITransactionDAO;
import com.capstone.util.SQLHelper;
import com.capstone.util.SQLStatements;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * A DAO implementation class that implements ITransactionDAO
 * @author Russel
 */
public class TransactionDAOImpl implements ITransactionDAO{

    @Override
    public List<String> retrieveReservedDates() {
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<String> reservedDates = null;

        connection = SQLHelper.getConnection();
        try {
            statement = connection.prepareStatement(SQLStatements.CAPSTONESQL_TRN001);
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                if(reservedDates == null){
                    reservedDates = new ArrayList<String>();
                }
                
                reservedDates.add(resultSet.getString("transaction_rdate"));
            }
            
        } catch (SQLException e) {

        }

        return reservedDates;
    }
    
}
