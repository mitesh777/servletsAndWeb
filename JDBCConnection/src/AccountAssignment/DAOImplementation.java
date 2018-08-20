package AccountAssignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.pratian.travelapp.entity.Airline;



public class DAOImplementation implements AccountDAO{
	private Connection connection;
	
	
	public DAOImplementation(Connection connection) {
		super();
		this.connection = connection;
	}

	@Override
	public void openAccount(Account acc) {
		// TODO Auto-generated method stub
		try {
			String query = "insert into Account(name,balance,pin,isActive,"
					+ "openingDate,closingDate)\n" + 
					" values (?,?,?,?,?,?)";
			java.sql.Date startDate = new java.sql.Date(acc.getOpeningDate().getDate());
			java.sql.Date endDate = null;
			if(acc.getClosingDate()!=null) {
				endDate = new java.sql.Date(acc.getClosingDate().getDate());
			}
				 
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, acc.getName());
			stmt.setDouble(2, acc.getBalance());
			stmt.setInt(3, acc.getPin());
			stmt.setBoolean(4, true);
			stmt.setDate(5, startDate);
			//stmt.setString(5, startDate);
			stmt.setDate(6, endDate);
			stmt.execute();
			System.out.println("successfully added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void closeAccount(int accNo) {
		// TODO Auto-generated method stub
		
		try {
			String sql = "update Account set isActive = ? where accNum = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setBoolean(1, false);
			statement.setInt(2, accNo);
			statement.execute();
			System.out.println("closed id = " + accNo);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void withdraw(int accNo, double amount) {
		// TODO Auto-generated method stub
		try {
			String sql = "update Account set balance = balance - ? where accNum = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setDouble(1, amount);
			statement.setInt(2, accNo);
			statement.execute();
			System.out.println("balance updated = " + accNo);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deposit(int accNo, double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getBalance(int accNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Account getAccount(int accno) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
