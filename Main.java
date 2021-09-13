import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    // 1. psuedo code if statement

    // Accepting full time job offer

   
    Scanner s = new Scanner(System.in);

    System.out.println("Starting Salary:");
    int salary = s.nextInt();
    int goal = 75000;

    if (salary > 50000 && salary < goal){
      System.out.println("Negotiate more money.");
    }
    else if (salary > goal){
      System.out.println("Accept the offer.");
    }
    else{
      System.out.println("Reject the offer.");
    }

  

    // 2. psuedo code loop

    // things to juggle this semester (weekly)
    // couldnt get this to work in java

/*
    int work = 24; //total work hours (weekly)
    int inClass = 15; //total credit hours (weekly)
    int service = 1; //total service hours (weekly)
    int busy = 40; //total hours busy (weekly)

    for {
      System.out.println (work);
      System.out.println (inClass);
      while (busy == inClass + work);
      if (busy = 40){
        break;
      }

     if (busy == 40){
       System.out.println ("All things complete");
     }
 */   
    

  }
}