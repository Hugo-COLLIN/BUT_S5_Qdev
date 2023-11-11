package org.iut.func;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordCountTest {

    WordCount wordCount;

    @BeforeEach
    void setUp() {
        wordCount = new WordCount();
    }

    /**
     * Test when there is no word in the file
     */
    @Test
    void test_countInFile_noWord() throws IOException {
        assertEquals(0, wordCount.countInFile("test", "src/test/resources/empty.txt"));
    }

    /**
     * Test when the word is the only word in the file
     */
    @Test
    void test_countInFile_word() throws IOException {
        assertEquals(1, wordCount.countInFile("test", "src/test/resources/oneWord.txt"));
    }

    /**
     * Test when the word is not in the file
     */
    @Test
    void test_countInFile_oneWord() throws IOException {
        assertEquals(0, wordCount.countInFile("aerostatic", "src/test/resources/oneWord.txt"));
    }

    /**
     * Test when the word is in a file containing multiple words
     */
    @Test
    void test_countInFile_multipleWords() throws IOException {
        assertEquals(1, wordCount.countInFile("test", "src/test/resources/phrase.txt"));
    }

    /**
     * Test when the word is multiple times in the file
     */
    @Test
    void test_countInFile_paragraphs() throws IOException {
        // 7, not 8 because "ipsum," (word with ponctuation) is not counted
        assertEquals(7, wordCount.countInFile("ipsum", "src/test/resources/paragraphs.txt"));
    }

    /**
     * Test a word followed by a punctuation
     */
    @Test
    void test_countInFile_punctuation() throws IOException {
        assertEquals(0, wordCount.countInFile("test", "src/test/resources/oneWordPonctuation.txt"));
    }


}