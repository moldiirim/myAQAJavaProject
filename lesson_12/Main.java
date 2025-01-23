package lesson_12;

public class Main {
    public static void main(String[] args) {
        // Создаем AppData
        AppData appData = new AppData();
        appData.setHeader(new String[]{"Value 1", "Value 2", "Value 3"});
        appData.setData(new int[][]{
                {100, 200, 123},
                {300, 400, 500}
        });

        // Сохраняем в файл
        String filePath = "data.csv";
        CsvWriter writer = new CsvWriter();
        writer.save(appData, filePath);

        // Загружаем из файла
        CsvReader reader = new CsvReader();
        AppData loadedData = reader.load(filePath);

        // Выводим загруженные данные
        System.out.println("Header:");
        for (String column : loadedData.getHeader()) {
            System.out.print(column + " ");
        }
        System.out.println("\nData:");
        for (int[] row : loadedData.getData()) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
