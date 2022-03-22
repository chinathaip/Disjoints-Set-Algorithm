import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class SearchforOverLap {
    public static void main (String[] args)throws FileNotFoundException {
        Scanner userinput = new Scanner(System.in);
        System.out.println("What is the name of the first file? ");
        String file1 = userinput.next();
        Scanner file1_reader = new Scanner(new File(file1)); //read file
        System.out.println("What is the name of the second file? ");
        String file2 = userinput.next();
        Scanner file2_reader = new Scanner(new File(file2));
        ArrayList<String> data_file1 = CreateWordList(file1_reader);//use the returned list from createwordlist
        ArrayList<String> data_file2 = CreateWordList(file2_reader);
        int common_words = getOverlap(data_file1,data_file2);// find the overlap using the returned list from createwordlist as parameters (data_file1,data_file2)
        double size_file1 = data_file1.size();
        double size_file2 = data_file2.size();
        System.out.println("Common words = "+common_words);
        System.out.println("% of file 1 in overlap = "+(common_words/size_file1)*100);
        System.out.println("% of file 2 in overlap = "+(common_words/size_file2)*100);

    }

    public static ArrayList<String> CreateWordList(Scanner inputfile){
        ArrayList<String> WordList = new ArrayList<>();
        ArrayList<String> Filtered_list = new ArrayList<>();
        while (inputfile.hasNext()){
            String word = inputfile.next().toLowerCase(); //add words to the list
            WordList.add(word);
        }

        Collections.sort(WordList); // sort the list

        for(int i =1;i<WordList.size();i++){
            if(!WordList.get(i).equals(WordList.get(i-1))){  //if index i isn't a duplicate of index i+1, then add to the new list
                // '!=' doesnt work for some reason
                Filtered_list.add(WordList.get(i));
            }
        }
        return Filtered_list;
    }


    public static int getOverlap (ArrayList<String> WordList1,ArrayList<String>WordList2){
        int common_words = 0;
        for(int i = 0;i<WordList1.size();i++){
            if(WordList2.contains(WordList1.get(i))){ // if wordlist2 contains the same word as wordlist[i] then counter = counter + 1
                common_words += 1;
            }
        }

        return  common_words;
    }
}
