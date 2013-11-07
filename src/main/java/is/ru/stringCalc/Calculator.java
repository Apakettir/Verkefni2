package is.ru.stringCalc;

public class Calculator{
  
  public int add(String numbers){
    if(numbers == ""){
      return 0;
    }
    if(numbers.startsWith("//")){
      String justNumbers = numbers.substring(3);
      String[] Numbers = justNumbers.split(numbers.substring(2,3));
      return samlagning(Numbers);
    }
    String[] Numbers = split(numbers);
    return samlagning(Numbers); 
  }

  private static String[] split(String numbers){
    return numbers.split("(,)|(\n)");
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
