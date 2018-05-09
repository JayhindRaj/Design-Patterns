/**
 * 
 */
package com.jay.structural.facade;

import java.sql.Connection;

/**
 * @author jayrajpo
 * @Sinnce May 9, 2018
 */
public class MySQLHelper {

	public static Connection getMySQLDBConnection() {
		return null;
	}

	public void generateMySQLHTMLReport(String table, Connection connection) {
		System.out.println("Generating MYSQL HTML report..");
	}

	public void generateMySQLPDFReport(String table, Connection connection) {
		System.out.println("Generating MYSQL PDF report..");
	}
}
