package javax.sql;

import java.sql.*;
import java.io.*;

/** Temporary recreation of DataSource interface, from Sun docco.
 * Just for testing purposes.
 * DO NOT CHANGE THIS INTERFACE.
 */
public interface DataSource {

	public Connection getConnection() throws SQLException;

	public Connection getConnection(String username, String password)
		throws SQLException;

	public int getLoginTimeout();

	public PrintWriter getLogWriter();

	public void setLoginTimeout(int seconds);

	public void setLogWriter(PrintWriter out);

}
