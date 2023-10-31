import java.util.*;
public class MutipleChoice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] reponse={"","","",""};
        String[] answer={"c","b","a","d"};

        System.out.println("Who is the developer of java?");
        System.out.println("a)Linus Torvalds");
        System.out.println("b)Guido van Rossum");
        System.out.println("c)James Gosling");
        System.out.println("d)Dennis Ritchie");

        System.out.println("Number of primitive data types in java are?");
        System.out.println("a)6");
        System.out.println("b)8");
        System.out.println("c)7");
        System.out.println("d)9");

        System.out.println("What is the size of float and double in java?");
        System.out.println("a)32 and 64");
        System.out.println("b)32 and 32");
        System.out.println("c)64 and 64");
        System.out.println("d)64 and 32");

        System.out.println("Automatic type conversion is possible in which of the possible cases?");
        System.out.println("a)byte to int");
        System.out.println("b)long to int");
        System.out.println("c)short to int");
        System.out.println("d)int to long");
        
        reponse[0]=sc.next();
        reponse[1]=sc.next();
        reponse[2]=sc.next();
        reponse[3]=sc.next();

        System.out.println(reponse[0]);
        System.out.println(reponse[1]);
        System.out.println(reponse[2]);
        System.out.println(reponse[3]);
        
        int score=0;
        for(int i=0;i<4;i++){
            if(reponse[i].equalsIgnoreCase(answer[i])){
              score++;
            }
        }
        System.out.println("Score:"+score+"/4");
    }
}
