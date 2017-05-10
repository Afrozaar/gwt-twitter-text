package com.afrozaar.util.gwt.twitter.client;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractMethods {

    private String string;

    public ExtractMethods() throws FileNotFoundException, IOException {
        string = IOUtils.toString(new FileInputStream("twitter-text-1.14.3.js"));
    }

    @Test
    public void testGetMethodsWithOptions() throws FileNotFoundException, IOException {
        System.out.println("\ntext, options methods\n");
        Pattern compile = Pattern.compile("twttr\\.txt\\.(.*) = function\\(text, options\\) \\{");

        Matcher matcher = compile.matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
    
    @Test
    public void testGetMethodsWithOutOptions() throws FileNotFoundException, IOException {
        
        System.out.println("\nonly text methods");
        
        Pattern compile = Pattern.compile("twttr\\.txt\\.(.*) = function\\(\\w+\\) \\{");

        Matcher matcher = compile.matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }

}
