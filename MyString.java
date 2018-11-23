
public class MyString implements CharSequence, Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i =0; i < s.length(); i++) {
      data[i] = s.charAt(i);
    }
  }
  public char charAt(int in){
    try {
      return data[in];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      throw new IndexOutOfBoundsException();
    }
  }

  public int length(){
    return data.length;
  }
  public CharSequence subSequence(int start, int end) {
    try {
      String out = "";
      for (int i = start; i < end; i++){
        out += data[i];
      }
      return out;
    }
    catch (ArrayIndexOutOfBoundsException e) {
      throw new IndexOutOfBoundsException();
    }
  }

  public String toString(){
    String out = "";
    for (int i = 0; i < data.length; i++){
      out += data[i];
    }
    return out;
  }
  public int compareTo(CharSequence s){
    return 0;
  }
}
