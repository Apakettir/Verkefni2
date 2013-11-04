package is.ru.stringCalc;

public class Calculator{
  
  public int add(String numbers){
    if(numbers == ""){
      return 0;
    }
    String[] Numbers = numbers.split(",");
    int heild = 0;
    for(String number : Numbers){
      int temp = Integer.parseInt(number);
      heild += temp;
    }

    return heild; 
  }

}
