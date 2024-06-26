package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FileSystem file=new File("Vishu");
        FileSystem file1=new File("Ravi");

        Directory dir=new Directory("Dvishu");
        Directory dir1=new Directory("Dravi");

        dir.add(dir1);

        dir.add(file);
        dir.add(file1);

        dir.ls();
    }
}