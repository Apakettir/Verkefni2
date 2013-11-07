package is.ru.stringCalc;

public class Calculator{
  
  public int add(String numbers){
    if(numbers == ""){
      return 0;
    }
    String[] Numbers = split(numbers);
    return samlagning(Numbers); 
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
