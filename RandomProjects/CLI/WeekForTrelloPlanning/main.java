import java.io.FileWriter;
import java.io.IOException;
public class Main{
public static void main(String[] args){
    //                                  1          2          3         4         5          6         7
    String[] daysWeek = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    //                                  0          1          2          3         4         5         6
    int startDayWeek = 5; 
    boolean flag_a = false;
    int iterator = 4;
    try {
        FileWriter writer = new FileWriter("MyFile.txt", true);

        for(int index = 1; index < 32; index++){
            /*if(flag_a == true){
                startDayWeek++;
            }*/
            if(startDayWeek!=7){
                writer.write(" "+daysWeek[startDayWeek]+" 06/"+index+"/2024 ");
                //writer.write(" "+daysWeek[startDayWeek]+" 10/["+index+"]/2021 ["+startDayWeek+"] A");
                writer.write("\r\n");
                writer.write("\r\n");
                startDayWeek++;
            }else{
                startDayWeek = 0;
                writer.write(" "+daysWeek[startDayWeek]+" 06/"+index+"/2024 ");
                //writer.write(" "+daysWeek[startDayWeek]+" 10/["+index+"]/2021 ["+startDayWeek+"] B");
                writer.write("\r\n");
                writer.write("\r\n");
                startDayWeek++;
                //flag_a = true;
                
            }

        }
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
//writer.write("Hello World");
//writer.write("\r\n");   // write new line
//writer.write("Good Bye!");
        