package com.hemenace;

class Greeter {

   public Person[] getPeople() {
      return people;
   }

   public void setPeople(Person[] people) {
     this.people = people;
   }

   public String[] getGreetings() {
      return greetings;
   }

   public void setGreetings(String[] greetings) {
      this.greetings = greetings;
   }

   private  Person[] people;
   private  String[] greetings;


   public static String[] greet(Person[] people){

      String[] greetings = new String[people.length];

      for (int i = 0; i < greetings.length; i++) {
         greetings[i] =  "Hello "  + people[i].firstName + " "  + people[i].lastName + "!";
      }
   return greetings;
   }

}
