import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Copy {
   public static void main(String[] var0) throws FileNotFoundException, IOException {
      FileInputStream var1 = new FileInputStream("Text.txt");
      FileOutputStream var2 = new FileOutputStream("copy.txt");
      BufferedInputStream var3 = new BufferedInputStream(var1);
      BufferedOutputStream var4 = new BufferedOutputStream(var2);

      int var5;
      while((var5 = var3.read()) != -1) {
         var4.write(var5);
      }

      var4.close();
      var3.close();
      var2.close();
      var1.close();
   }
}