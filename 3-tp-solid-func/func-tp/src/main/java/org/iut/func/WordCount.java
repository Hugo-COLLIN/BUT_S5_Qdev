package org.iut.func;

import java.io.*;
import java.util.Arrays;

public class WordCount {
  public long countInFile(String wordToFind, String filePath) throws IOException {

    long count = 0;
    var bufferedReader = new BufferedReader(new FileReader(filePath));
    String line = null;

    while ((line = bufferedReader.readLine()) != null) {
      String[] words = line.split(" ");
      for (String word : words) {
//          System.out.println(word);
        if (word.equals(wordToFind)) {
          count++;
//            System.out.println(count + " : " + word);
//            System.out.println(Arrays.toString(words));
        }
      }
    }
    return count;
  }
}
