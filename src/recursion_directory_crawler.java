import java.io.File;

import java.util.Scanner;

public class recursion_directory_crawler {
    public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        System.out.println("What is the name of the file?");
        File file = new File(userinput.next());
        directory(file,0);
    }
    public static void directory(File file,int level){
        System.out.print("File level "+level+": ");
        System.out.println(file.getName());
        if(file.isDirectory()){
            for (File subfile: file.listFiles()){ // for each subfile in file
                directory(subfile,level+1);
            }
        }
    }
}
