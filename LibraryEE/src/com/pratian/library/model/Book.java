package com.pratian.library.model;

public class Book {
	private int id;
	private String ISBN;
	private String title;
	private String publication;
	private String category;
	private double price;
	private int stockCount;
	private int authId;
	public Book(int id, String iSBN, String title, String publication, String category, double price, int stockCount,
			int authId) {
		super();
		this.id = id;
		ISBN = iSBN;
		this.title = title;
		this.publication = publication;
		this.category = category;
		this.price = price;
		this.stockCount = stockCount;
		this.authId = authId;
	}
	
	public Book(String iSBN, String title, String publication, String category, double price, int stockCount,
			int authId) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.publication = publication;
		this.category = category;
		this.price = price;
		this.stockCount = stockCount;
		this.authId = authId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockCount() {
		return stockCount;
	}

	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}

	public int getAuthId() {
		return authId;
	}

	public void setAuthId(int authId) {
		this.authId = authId;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", ISBN=" + ISBN + ", title=" + title + ", publication=" + publication + ", category="
				+ category + ", price=" + price + ", stockCount=" + stockCount + ", authId=" + authId + "]";
	}
	
	
}
