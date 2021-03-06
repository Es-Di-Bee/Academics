package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

class FileCopyDemo {
    public static void main(String args[]) throws Exception {
        String source = "src.flv";
        String destination = "copy.flv";
        InputStream in = new FileInputStream(source);
        OutputStream out = new FileOutputStream(destination);
        while (true) {
            int c = in.read();
            if (c == -1) break;
            out.write(c);
        }
        in.close();
        out.close();
    }
}
