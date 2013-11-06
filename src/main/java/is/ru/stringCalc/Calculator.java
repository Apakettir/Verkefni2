package is.ru.stringCalc;

public class Calculator{
  
  public int add(String numbers){
    if(numbers == ""){
      return 0;
    }
    String[] Numbers = split(numbers);
    int heild = samlagning(Numbers);
    return heild; 
  }
  private static String[] split(String numbers){
    return numbers.split(",");
  }

  private static int samlagning(String[] Numbers){
    int heild = 0;
    for(String number : Numbers){
      int temp = toInt(number);
      heild += temp;
    }
    return heild;
  }
  
  private static int toInt(String number){
    return Integer.parseInt(number);
    
  }
}
