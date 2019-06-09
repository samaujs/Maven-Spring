package com.adventit.app;

public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message = message;
   }
   public void getMessage(){
      System.out.println("Your Configuration Message : " + message + "\n");
   }
   public void init(){
      System.out.println("\nBean is going through init process...\n");
   }
   public void destroy() {
      System.out.println("\nBean will be destroyed now!\n");
   }
}
