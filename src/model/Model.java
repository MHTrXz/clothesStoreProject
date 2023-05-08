package model;

import java.io.FileWriter;
import java.io.IOException;

public class Model extends PreModel
{

    public static boolean delete(String id, String file) {
        try {
            StringBuilder writeData = new StringBuilder();

            for (String item : getAllData(file)) {
                String[] data = item.split(",");

                if (!data[0].equals(id)) {
                    writeData.append(item).append("\n");
                }
            }
            FileWriter writer = new FileWriter(file);
            writer.write(writeData.toString());
            writer.close();

            return true;
        } catch (IOException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public static boolean update(String id, String appendData, String file)
    {
        try {
            StringBuilder writeData = new StringBuilder();

            for (String item : getAllData(file)) {
                String[] data = item.split(",");

                if (data[0].equals(id)) {
                    writeData.append(appendData).append("\n");
                } else {
                    writeData.append(item).append("\n");
                }
            }
            FileWriter writer = new FileWriter(file);
            writer.write(writeData.toString());
            writer.close();

            return true;
        } catch (IOException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public static boolean create(String data, String file)
    {
        try {
            StringBuilder writeData = new StringBuilder();

            for (String item : getAllData(file)) {
                writeData.append(item).append("\n");
            }
            writeData.append(data).append("\n");
            FileWriter writer = new FileWriter(file);
            writer.write(writeData.toString());
            writer.close();

            return true;
        } catch (IOException e) {
            System.out.println(e.toString());
            return false;
        }
    }
}
