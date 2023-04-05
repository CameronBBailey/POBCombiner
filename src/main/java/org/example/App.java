package org.example;

import org.Connection.PostmanContentFetcher;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        PostmanContentFetcher.getContent("https://pastebin.com/raw/LpFByWnD");

    }

}
