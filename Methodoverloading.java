public class Methodoverloading
{ 
  void sum(int x, int y) 
  { 
    int s = x + y; 
    System.out.println("Sum of two numbers:"+s); 
  }
  void sum(int x, int y, int z)
  { 
   int s = x + y + z; 
   System.out.println("Sum of three numbers:"+s); 
  }
  public static void main(String[] args)
  {
      Methodoverloading obj = new Methodoverloading();
      obj.sum(5, 10);
      obj.sum(10, 20, 30);
    } 
}