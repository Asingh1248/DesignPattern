package com.animesh.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	private String shopName;
	List<Book> books = new ArrayList<>();

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void loadData()
	{
		// Db COnnection --> Data is coming from there
		for(int i=1; i<=10;i++) {
			Book b = new Book();
			b.setBid(i);
			b.setBname("Book "+i);
			getBooks().add(b);
		}
		
	}
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}

	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		// Simple method for Shallow Cloning
		//return super.clone(); - 
		
		BookShop shop = new BookShop();
		

		for(Book b : this.getBooks())
		{
			shop.getBooks().add(b); // fetching the data from old object -- storing into new object 
		}
			
		return shop;
	}
    
}
