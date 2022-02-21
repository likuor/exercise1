package miniproject1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Answer {

    /**
     * method to read a file, and extract a random string
     * @return randomStr "" random string extracted from the cities.txt
     */
    public String generateAnswer(){
        File file = new File("/Users/髙橋快弥/Desktop/IdeaProjects/exercise1/src/miniproject1/cities.txt");
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            int randomNum = (int) (Math.random() * randomAccessFile.length());
            randomAccessFile.seek(randomNum);
            randomAccessFile.readLine();
            String randomStr = randomAccessFile.readLine();
            randomAccessFile.close();
            return randomStr;
        }catch (IOException ignored){
        }
        return "";
    }
}
