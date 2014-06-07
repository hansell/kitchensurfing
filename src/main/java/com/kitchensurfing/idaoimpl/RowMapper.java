package com.kitchensurfing.idaoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper<T> {
	 /**  
     * Implementations must implement this method to map each row of data 
     * in the ResultSet. This method should not call <code>next()</code> on 
     * the ResultSet; it is only supposed to map values of the current row. 
     * @param rs the ResultSet to map (pre-initialized for the current row) 
     * @param rowNum the number of the current row 
     * @return the result object for the current row 
     */  
    T mapRow(ResultSet rs, int rowNum) throws SQLException;   
}
