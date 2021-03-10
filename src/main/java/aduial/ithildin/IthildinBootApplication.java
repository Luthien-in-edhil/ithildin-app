package aduial.ithildin;

import javafx.application.Application;
import aduial.ithildin.application.IthildinJfxApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.filechooser.FileSystemView;
import java.io.*;

/**
 * @author (original) Rene Gielen
 */
@SpringBootApplication
public class IthildinBootApplication {

    public static void main(String[] args) {
        try {
            File outputFile = File.createTempFile("ithildin-debug", ".log", FileSystemView.getFileSystemView().getDefaultDirectory());
            PrintStream output = new PrintStream(new BufferedOutputStream(new FileOutputStream(outputFile)), true);
            System.setOut(output);
            System.setErr(output);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Application.launch(IthildinJfxApplication.class, args);

    }

}

