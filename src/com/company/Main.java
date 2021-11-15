package com.company;

import com.company.models.Comments;
import com.company.models.Customer;
import com.company.models.Posts;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Customer> Customers  = new ArrayList<>();
        {
            Customer c1 = new Customer("sai", "s@gmail.com");
            Customer c2 = new Customer("aa", "aa@gmail");
            Customer c3 = new Customer("ss", "ss@gmail");
            Customers.add(c1);
            Customers.add(c2);
            Customers.add(c3);
        }
        List<Posts> Post = new ArrayList<>();
        {
            Posts post1 = new Posts("p1","s@gmail.com","H1","About Food");
            Posts post2= new Posts("p2","aa@gmail.com","H2","About Organisation");
            Posts post3 = new Posts("p3","ss@gmail.com","H3","Personal Comments  ");
            Post.add(post1);
            Post.add(post2);
            Post.add(post3);
        }
        List<Comments> Comment = new ArrayList<>();
        {
            Comments comment1 = new Comments("p1","s@gmail.com","Its Delicious");
            Comments comment2 = new Comments("p2","aa@gmail.com"," Its the best place to learn the technologies");
            Comments comment3 = new Comments("p3","ss@gmail.com","its an beautiful location to prepare and work ");
            Comment.add(comment1);
            Comment.add(comment2);
            Comment.add(comment3);
        }
        for (Customer C : Customers) {
            System.out.println(C.getEmail()+":"+C.getName());
            
        }


    }
}
