package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @org.junit.jupiter.api.Test


    void fullNameWithAllParts() {
        String result = NameFormatter.format("Dr", "John", "Michael", "Smith", "Jr.");
        assertEquals("Dr. John Michael Smith, Jr.", result);
    }

    void fullNameWithoutPrefixAndSuffix(){
        String result = NameFormatter.format("", "John", "Michael", "Smith", "");
        assertEquals("John Michael Smith", result);
    }


    void fullNameWithoutMiddleName(){
        String result = NameFormatter.format("Dr", "John", "", "Smith", "Jr.");
        assertEquals("Dr. John Smith, Jr.", result);
    }
    @Test
    void onlyFirstAndLast(){
        String result = NameFormatter.format("", "John", "", "Smith", "");
        assertEquals("John Smith", result);
    }

}