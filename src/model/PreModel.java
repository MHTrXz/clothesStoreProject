package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PreModel
{
    protected static String[] getAllData(String file)
    {
        System.out.println(file);
        try {
            StringBuilder output = new StringBuilder();
            File clothes = new File(file);
            Scanner reader = new Scanner(clothes);
            boolean hasNext = reader.hasNextLine();
            while (hasNext) {
                String line = reader.nextLine();

                hasNext = reader.hasNextLine();

                if (hasNext) {
                    output.append(line).append(" ");
                } else {
                    output.append(line);
                }
            }
            reader.close();
            return output.toString().split(" ");
        } catch (FileNotFoundException e) {
            String[] error = new String[1];
            error[0] = "error";
            System.out.println(e.toString());
            return error;
        }
    }

    public static String[] getById(String id, String file)
    {
        for (String item : getAllData(file)) {
            String[] data = item.split(",");
            if (data[0].equals(id)) {
                return data;
            }
        }
        return null;
    }
}
