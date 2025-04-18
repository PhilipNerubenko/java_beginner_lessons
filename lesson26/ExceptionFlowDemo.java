package lesson26;

/**
 * A class that demonstrates the flow of exceptions in Java.
 */
public class ExceptionFlowDemo {
  /**
   * A method that returns a string.
   *
   * @return A string.
   */
  static String abc() {
    String s1 = "";
    String s2 = null;
    try {
      try {
        s1 += "1";
        s2.charAt(3);
        s1 += "2";
      } catch (NullPointerException e) {
        s1 += "3";
        throw new RuntimeException();
      } finally {
        s1 += "4";
        throw new Exception();
      }
    } catch (Exception e) {
      s1 += "5";
    }
    return s1;
  }

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    System.out.println(abc());
  }
}
