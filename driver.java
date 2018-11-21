public class driver {
  public static void main(String[]args){
    MyString S = new MyString("TEST");
    System.out.println(S.charAt(2));
    System.out.println(S.length());
    System.out.println(S.subSequence(1,3));
    System.out.println(S.subSequence(1,100));
  }
}
