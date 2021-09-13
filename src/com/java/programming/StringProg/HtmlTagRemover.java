package com.java.programming.StringProg;

/**
 * @Author pankaj
 * @create 9/13/21 7:49 AM
 */
class HtmlTagRemover
{
    public static void main(String a[])
    {
        String text = "<p>This tags going to disappear.</p>";
        System.out.println(text);

        text = text.replaceAll("\\<.*?\\>", "");
        System.out.println(text);
    }
}
