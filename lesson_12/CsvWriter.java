package lesson_12;
import java.io.FileWriter;
import java.io.IOException;
public class CsvWriter {
    public void save(AppData appData, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {

            writer.write(String.join(";", appData.getHeader()) + "\n");


            for (int[] row : appData.getData()) {
                for (int i = 0; i < row.length; i++) {
                    writer.write(String.valueOf(row[i]));
                    if (i < row.length - 1) writer.write(";");
                }
                writer.write("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
