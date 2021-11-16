package com.company.models;



import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Customer> Customers  = new ArrayList<>();
        {
            Customer c1 = new Customer("vemula", "Vemula@gmail.com");
            Customer c2 = new Customer("sai", "sai@gmail.com");

            Customer c3 = new Customer("Kiran", "kiran@gmail.com");

            Customer c4 = new Customer("Srinivas","Srinivas@gmai.com");

            Customers.add(c1);
            Customers.add(c2);
            Customers.add(c3);
            Customers.add(c4);

        }
        List<Posts> Post = new ArrayList<>();
        {
            Posts post1= new Posts("p1","Vemula@gmail.com","H1","About Organisation");
            Posts post2 = new Posts("p2","sai@gmail.com","H2","About Food");
            Posts post3= new Posts("p3","Srinivas@gmail.com","H2","About Organisation ");

            Posts post4= new Posts("p4","kiran@gmail.com","H3","About Work ");
            Posts post5 = new Posts("p5","kiran@gmail.com","H4","Personal Comments  ");
            Post.add(post1);
            Post.add(post2);
            Post.add(post3);
            Post.add(post4);
            Post.add(post5);

        }
        List<Comments> Comment = new ArrayList<>();
        {
            Comments comment1 = new Comments("p1","Vemula@gmail.com","Its Delicious");
            Comments comment2 = new Comments("p2","Sai@gmail.com"," Its the best place to learn the technologies");
            Comments comment3 = new Comments("p3","Srinivas@gmail.com","Nice Place ");
            Comments comment4 = new Comments("p4","kiran@gmail.com","its an beautiful location to prepare and work ");
            Comments comment5 = new Comments("p5","kiran@gmail.com","its an beautiful location to prepare and work ");


            Comment.add(comment1);
            Comment.add(comment2);
            Comment.add(comment3);
            Comment.add(comment4);
            Comment.add(comment5);

        }

        System.out.println(" Task 2");
        //System.out.println("   \n   ");
        System.out.println("Customer Details");
        for (Customer C : Customers) {

            System.out.println("Email :"+C.getEmail()+"; Name:"+C.getName());
        }
        System.out.println("");
        System.out.println("Task 2");
        System.out.println("");

//        for (int i = 0; i< Comment.size(); i++)
//
//        {
//            System.out.println(Customers);
//
//        }
        //for()

        for (Customer C : Customers) {
            for (Posts p : Post) {
//                if(C.getEmail()== p.getEmail()){
//                    System.out.println(C.getName()+p.getEmail()+p.getDescription());
//                }


                boolean cond = C.getEmail().equals(p.getEmail());
                if(cond==true) {
                    System.out.println("Customer Name : " + C.getName() + "; " + "Heading : " + p.getHeading() + "; " + "Description : " + p.getDescription() + "; ");
                }
            }
        }
        System.out.println("Task 4");
        System.out.println("");

        for (Comments Comm : Comment) {
            for (Customer cus : Customers)
            {
                for (Posts pos: Post) {
                    if(pos.getPostID()==Comm.getPostID() && pos.getEmail()== cus.getEmail())
                    {
                        System.out.println("Name : "+cus.getName()+"; Heading : "+pos.getHeading()+"; Description : "+ pos.getDescription()+"; Comment : "+ Comm.getComment()+"; Customer Name : "+cus.getName());
                    }

                }
                
            }

           // System.out.println("Email :"+C.getEmail()+"; Name:"+C.getName());
        }


//        System.out.println("   \n   ");
//        System.out.println("Task 2");
//        System.out.println("Post Details");
//        for (Posts p: Post) {
//            System.out.println("Post Id : "+ p.getPostID()+"  E mail Id :"+p.getEmail()+"  Heading :"+p.getHeading()+"  Description : "+p.getDescription());
//
//        }
//        System.out.println("   \n   ");
//        System.out.println("Comment Details");
//
//        for (Comments com : Comment ) {
//
//            System.out.println("Post Id: "+ com.getPostID()+"  Email ID: " +com.getEmail()+"  Comment: "+com.getComment());
//        }



    }
}
