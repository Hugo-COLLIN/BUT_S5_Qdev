package org.iut.func;

import java.io.*;

public class WordCount {
  public long countInFile(String wordToFind, String filePath) throws IOException {

    long count = 0;
    var bufferedReader = new BufferedReader(new FileReader(filePath));
    String line = null;

    while ((line = bufferedReader.readLine()) != null) {
      String[] words = line.split(" ");
      for (String word : words) {
        if (word.equals(wordToFind)) {
          count++;
        }
      }
    }
    return count;
  }
}
