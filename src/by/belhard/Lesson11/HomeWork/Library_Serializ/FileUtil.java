package by.belhard.Lesson11.HomeWork.Library_Serializ;

import by.belhard.Lesson5.HomeWork.Librery.Reader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*Задача 2:
Добавите в проект Library отдельный класс FileUtil, у которого определите два статических метода:
•	boolean saveReadersList(List<Reader> readers >)
•	List<Reader> restoreReadersList()
Первый метод принимает в себя список читателей и сохраняет их всех в один файл и вызывается в конце программы
(подсказка, сохранять в файл нужно не каждого читателя по очереди, а сразу весь список).
В случае, если записать не получилось, выводит об этом сообщение в консоли.
Второй пытается считать из этого же файла список читателей и возвращает его, вызывается в начале программы. В случае, если считать не получилось, выводит об этом сообщение в консоль.
Таким образом у вас должна получиться программа, которая не теряет данные после её выключения/включения.
*/
public class FileUtil {

   // private static String FILE_NAME = "/Users/andrejvoroncov/Andrei/Belhard/test/Readers.txt";
    private static String FILE_NAME = "Readers.dat";

   public static boolean saveReadersList(List<Reader> readers){

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
            oos.writeObject(readers);
            return true;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            return false;
        }
    }

  public static List<Reader> restoreReadersList(){
        List<Reader> readers = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))){
           readers = (ArrayList<Reader>) ois.readObject();

        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
      return readers;
   }

}
