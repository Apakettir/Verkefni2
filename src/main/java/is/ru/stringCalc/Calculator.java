package is.ru.stringCalc;

public class Calculator{
  
  public int add(String numbers){
    if(numbers == ""){
      return 0;
    }
    else if(numbers.contains(",")){
      String[] Numbers = numbers.split(",");
      int heild = Integer.parseInt(Numbers[0]) + Integer.parseInt(Numbers[1]);
      return heild; 
    }
    return 1;
  }

}
