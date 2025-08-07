package org.example;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", Cadets!");
        System.out.println(sb);
        sb.append(" Welcome to ");
        sb.append(2025);
        sb.append('.');
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Java is great!");
        sb1.insert(8, "really ");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("This is a test sentence.");
        sb2.delete(8,15);
        System.out.println("After delete (8,15): " + sb2);
        sb2.deleteCharAt(4);
        System.out.println("After deleteCharAt(4): " + sb2);

        StringBuilder sb3 = new StringBuilder("I like programming in Python");
        sb3.replace(22,28, "Java");
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("Start");
        sb4.append("...").insert(0, "Ready, Set, ").delete(12,15);
        System.out.println(sb4);

        StringBuilder sb5 = new StringBuilder("The quick brown fox jumps over the lazy dog.");
        String sub = sb5.substring(16,19); //fox
        System.out.println("Substring: " + sub);
        int indexOfFox = sb5.indexOf("fox");
        System.out.println("Index of fox: " + indexOfFox);
        int indexOfCat = sb5.indexOf("cat");
        System.out.println("Index of car: " + indexOfCat);

        StringBuilder sb6 = new StringBuilder("Status: ");
        sb6.append("Pending");
        String finalStatus = sb6.toString();
        sb6.append(" - Approved");
        System.out.println("StringBuilder: " + sb6);
        System.out.println("Final Status: " + finalStatus);
    }
}