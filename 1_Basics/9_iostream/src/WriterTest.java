import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("/Users/highcho/Desktop/Coding/STUDY_JAVA/1_Basics/9_iostream/src/good.txt")) {
            fw.write('A'); // 덮어쓰기가 되네, 없으면 생성해줌 c open 옵션처럼 줄 수 있나?
            char buf[] = {'b', 'c', 'd'};
            fw.write(buf);
            fw.write("file~~ write~~!");
            fw.write("65");
        } catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("출력이 완료되었습니다.");
    }
}
