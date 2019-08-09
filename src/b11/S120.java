package b11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.pool.OracleDataSource;

public class S120 {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private static final String USER = "me";
	private static final String PASSWORD = "password";

	private OracleDataSource ods;

	public S120() throws SQLException {
		ods = new OracleDataSource();

		ods.setURL(URL);
		ods.setUser(USER);
		ods.setPassword(PASSWORD);
	}

	public List<Coder> getCoders() throws SQLException {
		try (Connection conn = ods.getConnection(); //
				Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery("SELECT first_name, last_name, salary FROM coders ORDER BY 1"); // resultset
																												// è un
																												// risultato
																												// un
																												// po'
																												// strano
																												// quindi
																												// la
																												// vogliamo
																												// tenere
																												// localizzata
																												// in
																												// arraylist

			List<Coder> results = new ArrayList<>();
			while (rs.next()) {
				// Coder coder = new Coder(rs.getString(1),rs.getString(2),rs.getInt(3));
				results.add(new Coder(rs.getString(1), rs.getString(2), rs.getInt(3)));
			} // se c'è un eccezione qua dentro viene ritirata
			return results;
		}
	}

	public List<Coder> getCodersBySalary(double lower) throws SQLException{
		try (Connection conn = ods.getConnection(); 
				Statement stmt = conn.createStatement()) {
			String query = "SELECT first_name, last_name, salary FROM coders WHERE salary >= " + lower + "  ORDER BY 3"; // attenzione
																															// alla
																															// sql
																															// injection,
																															// cioè
																															// la
																															// gestione
																															// delle
																													        //																										// tramite
																															// stringa
			ResultSet rs = stmt.executeQuery(query);

			List<Coder> results = new ArrayList<>();
			while (rs.next()) {
				// Coder coder = new Coder(rs.getString(1),rs.getString(2),rs.getInt(3));
				results.add(new Coder(rs.getString(1), rs.getString(2), rs.getInt(3)));
			

		}
		return results;
	}
}
	

	public static void main(String[] args) {
		try {
			S120 sample = new S120();
			List<Coder> coders = sample.getCoders();

			System.out.println("Coder names are: " + coders);

			coders = sample.getCodersBySalary(6000);
			System.out.println("Rich coders are: " + coders);

		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}

	}
}

class Coder { // questo java bean rappresenta semplicemente la riga della tabella
	private String firstName;
	private String lastName;
	private int salary;

	public Coder() { // col costruttore di default devo mettere anche i setters

	}

	public Coder(String firstName, String lastName, int salary) { // che in realtà posso mettere qui
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Coder [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}