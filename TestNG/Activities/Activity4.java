package activities;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

class Activity4 {
    public static void main(String[] args) throws IOException, CsvException {
        CSVReader readerObj = new CSVReader(new FileReader("src/test/resources/employees.csv"));
        List<String[]> employees = readerObj.readAll();
        for (String[] employee : employees) {
            for (int i = 0; i < employee.length; i++) {
                System.out.println(employee[i]);
            }

        }
    }
}