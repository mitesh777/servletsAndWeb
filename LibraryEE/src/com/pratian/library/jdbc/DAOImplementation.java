package com.pratian.library.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pratian.library.dao.LibraryDAO;
import com.pratian.library.model.Book;
import com.pratian.library.model.User;
//import com.pratian.travelapp.entity.Airline;

public class DAOImplementation implements LibraryDAO{
	Connection connection=null;

	public DAOImplementation(Connection connection) {
		super();
		this.connection = connection;
	}
	//add a book, byISBN,allbooks, password/login
	public boolean validUsername(User user) {
		// TODO Auto-generated method stub
		
		try {
			String sql = "select * from user where username = ? and password = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		List<Book> books= new ArrayList<Book>();
		Statement statement;
		try {
			statement = connection.createStatement();
			String sql = "select * from books";
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				books.add(new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getDouble(6), rs.getInt(7), rs.getInt(8)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return books;
		
	}

	@Override
	public List<Book> getBooksByCategory(String category) {
		// TODO Auto-generated method stub
		//String sql
		List<Book> books = new ArrayList<Book>();
		try {
			String sql = "select * from books where category=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, category);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				books.add(new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getDouble(6), rs.getInt(7), rs.getInt(8)));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public Book getBookByISBN(String ISBN) {
		// TODO Auto-generated method stub
		Book book = null;
		try {
			String sql = "select * from books where ISBN=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, ISBN);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				book = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getDouble(6), rs.getInt(7), rs.getInt(8));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return book;
		//return null;
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		
		Book book = null;
		try {
			String sql = "select * from books where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				book = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getDouble(6), rs.getInt(7), rs.getInt(8));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return book;
	}

	
	
}
