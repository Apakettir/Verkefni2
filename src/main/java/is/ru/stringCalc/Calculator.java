package is.ru.stringCalc;

import java.io.*;

public class Calculator{
  
  public int add(String numbers){
    try{
    if(numbers == ""){
      return 0;
    }
    String[] Numbers = split(numbers);
    return samlagning(Numbers);
    }
    catch(neikvaedTalaExcep ex){
      System.out.printf("Negatives not allowed: %s", ex.getMessage());
      return 0;
    }
  }

  private static String[] split(String numbers){
    if(numbers.startsWith("//")){
      String justNumbers = numbers.substring(3);
      return justNumbers.split(numbers.substring(2,3));
    }
    else{
      return numbers.split("(,)|(\n)");
    }
  }

  private static int samlagning(String[] Numbers) throws neikvaedTalaExcep{
    int heild = 0;
    boolean neikvaet = false;
    String neikvaedar = null;
    for(String number : Numbers){
      int temp = toInt(number);
      if(temp < 0){
        neikvaet = true;
        neikvaedar = neikvaedar.concat(number);
      }
      heild += temp;
    }
    if(neikvaet){
      throw new neikvaedTalaExcep(neikvaedar);
    }
    else{
    return heild;
    }
  }
  
  private static int toInt(String number){
    return Integer.parseInt(number);
    
  }
  public static class neikvaedTalaExcep extends Exception{
    private String message = null;  
    
    public neikvaedTalaExcep(){
      super();
    }
    public neikvaedTalaExcep(String message){
      super(message);
      this.message = message; 
    }
    
    public neikvaedTalaExcep(Throwable cause){
      super(cause);
    }
    @Override
    public String toString(){
      return message;
    }
    @Override
    public String getMessage(){
      return message;
    }
  
  }
}
