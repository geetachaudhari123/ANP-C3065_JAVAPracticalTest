package com.mymart.dao;
	import java.util.LinkedList;

import com.mymart.model.Product;

	public class ProductDAO {
		
		  private static LinkedList<Product>List=new LinkedList();
				  public boolean addProduct(Product product) {
		                boolean addStatus=false;
		                List.add(product);
		                addStatus=true;
		                return addStatus;
		                
		  }
		LinkedList<Product>getAllProduct(){
		  return List;
		}
		LinkedList<Product>searchByProductsNameLinkedList(){
		           return List;
		
		}
	         
		LinkedList<Product>searchByProductsidLinkedList(){
			
	        return List;

	}
		LinkedList<Product>deleteByProductsidLinkedList(){
	        return List;

	}
	       
	}







}
