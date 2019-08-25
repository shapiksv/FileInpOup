import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInpOup {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String os1 = sc.nextLine();
        List<Integer> i = new ArrayList<>();
        FileInputStream inputStream = new FileInputStream(s);
        FileOutputStream fileOutputStream1 = new FileOutputStream(os1);

        while (inputStream.available() >0){
            i.add(inputStream.read());
        }
        int y = i.size();
        for (int j = y-1; j >= 0 ; j--) {
            fileOutputStream1.write(i.get(j));
        }
        inputStream.close();
        fileOutputStream1.close();
    }
}
