package org.iut.func;

import java.io.*;
import java.util.stream.Stream;

public class WordCount {
  public long countInFile(String wordToFind, String filePath) throws IOException {
    return new BufferedReader(new FileReader(filePath))
          .lines()
          .flatMap(line -> Stream.of(line.split(" ")))
          .filter(word -> word.equals(wordToFind))
          .count();
  }
}
