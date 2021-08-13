package com.pluralsight.order.util;

import java.sql.SQLException;

/**
 * Utility class to handle exceptions
 */
public class ExceptionHandler {

    /**
     * Method to extract and print information from a SQLException
     * @param sqlException Exception from which information will be extracted
     */
    public static void handleException(SQLException sqlException) {
        System.out.println("Error code "+sqlException.getErrorCode());
        System.out.println("Stack Trace " + sqlException.getStackTrace());
        System.out.println("Sql State " + sqlException.getSQLState());
    }
}
