package ru.ibs;


import org.apache.commons.lang3.StringUtils;

public class App
{
    public static void main( String[] args )
    {
       System.out.println(StringUtils.upperCase(args[0]));
    }
}
