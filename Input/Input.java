class Input{
  public static void main(String args[]) throws java.io.IOException {
      char ch;
      System.out.println("Enter some symbol and press 'Enter' ");
      ch = (char) System.in.read();
      System.out.println("You enter: " + ch);

      if (ch >= 'a' && ch <= 'm')
        System.out.println(ch + " is in the range (a...m)");
      if (ch >= 'n' && ch <= 'z')
        System.out.println(ch + " is in the range (n...z)");
  }
}
