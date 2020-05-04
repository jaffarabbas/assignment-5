package com.jaffar;


import java.util.ArrayList;

class Librery{
   private String name;
   private String address;

    void check(){
        System.out.println("This is Library:  ");
        this.name ="Themoria";
        this.address="Five star karachi";
        System.out.println(name);
        System.out.println(address);
    }
}

class librarian{
    Librery lib;
    ArrayList<book>Books;


    librarian(Librery lib,ArrayList<book>Books){
        lib.check();
        this.lib = lib;
        this.Books = Books;
    }
}

 class book{
    private String name;
    private double price;

       book(String name,double price){
           this.name = name;
           this.price = price;
           Booksail();
       }

       book B;

      double getPrice(){
         return this.price;
      }

      public double setPrice(double p){
           this.price = p;
          return this.price;
      }

      void InStudentAccount(Student student){
           student.HaveBook(B);
      }

    void Booksail(){
           double sail = 0.1f;
           double per =  setPrice(43.4) * sail;
           double result = setPrice(43.4) - per;
        System.out.println("Price after sail = "+result);
    }
 }

 class Student{
    Student s;
     void HaveBook(book Book){
         System.out.println("I Have Book : ");
     }

     ArrayList<book> Book = new ArrayList<book>();

     Librery m = new Librery();

     void show(){
         for (int i = 0; i < 5; i++) {
             librarian obj = new librarian(m,Book);
             book Books = new book("asd",23.4);
             Book.add(Books);
             Books.InStudentAccount(s = new Student());
         }

     }
 }


class test{
Student obj = new Student();
    test(){
        obj.show();
    }
}



class task_A{
    public static void main (String[] args) {
     test obj = new test();
    }
}