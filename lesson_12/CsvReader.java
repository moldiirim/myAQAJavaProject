package lesson_12;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CsvReader {
    public AppData load(String filePath) {
        AppData appData = new AppData();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Читаем заголовок
            String headerLine = reader.readLine();
            if (headerLine != null) {
                appData.setHeader(headerLine.split(";"));
            }

            // Читаем данные
            int[][] data = reader.lines()
                    .map(row -> {
                        String[] values = row.split(";");
                        int[] intValues = new int[values.length];
                        for (int i = 0; i < values.length; i++) {
                            intValues[i] = Integer.parseInt(values[i]);
                        }
                        return intValues;
                    })
                    .toArray(int[][]::new);

            appData.setData(data);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return appData;
    }
}
