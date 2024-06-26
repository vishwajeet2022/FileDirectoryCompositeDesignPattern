package org.example;
import java.util.*;

public class Directory implements FileSystem{
    List<FileSystem> fileSystemList;
    String name;

    Directory(String name){
        this.name = name;
        fileSystemList=new ArrayList<>();
    }
    @Override
    public void ls(){
        System.out.println("Directory "+name);

        for(int i=0; i<fileSystemList.size(); i++) {
            fileSystemList.get(i).ls();
        }
    }
    public void add(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }
}
