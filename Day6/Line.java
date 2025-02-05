class Line {
  int x;// instance - variables
  int y;

  public Line(int x, int y) {
    this.x = x; // referring to instance - variables
    this.y = y;
  }

    @Override
    public String toString() {
      return ("x: " + x + " y: " + y);
    }

    static void checkLines(Line[] lines) {
      Line line1 = lines[0];
      Line line2 = lines[1];

      if (Math.abs(line1.x - line1.y) > Math.abs(line2.x - line2.y)) {
        System.out.println(line1.toString());
      } else {
        System.out.println(line2.toString());
      }
  }

  public static void main(String[] args) {
    Line[] lines = {
        new Line(1, 3),
        new Line(2, 6)
    };

    checkLines(lines);
  }
}

  //2
  // static void check(String word1, String word2, String str) {
  //   String words[] = str.replaceAll("!", " !").split(" ");
  //   for (int i = 0; i < words.length; i++) {
  //     if (words[i].equals(word1))
  //       words[i] = word2;
  //   }

  //   for (int i = 0; i < words.length; i++) {
  //     System.out.print(words[i] + " ");
  //   }

  // }
