/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1;

import java.io.*;
import java.util.Map;

/**
 *
 * @author Азамат
 */
public class Serialization implements Serializable
{

    public static void safe(Map s)
    {
        try
        {
            FileOutputStream file = new FileOutputStream("C:\\Users\\Азамат\\Desktop\\t.txt");
            ObjectOutputStream object = new ObjectOutputStream(file);
            try
            {
                object.writeObject(s);
            } catch (IOException e)
            {

            } finally
            {
                object.close();
                file.close();
            }
        } catch (IOException e)
        {

        }
    }

    public static Map<Integer, Task> load()
    {
        Map<Integer, Task> object = null;
        FileInputStream file;
        ObjectInputStream ob;
        try
        {
            file = new FileInputStream("C:\\Users\\Азамат\\Desktop\\t.txt");
            ob = new ObjectInputStream(file);
            try
            {
                object = (Map<Integer, Task>) ob.readObject();
            } catch (IOException e)
            {

            } finally
            {
                ob.close();
                file.close();
            }
        } catch (FileNotFoundException e)
        {
            File file1 = new File("C:\\Users\\Азамат\\Desktop\\t.txt");

        } catch (IOException | ClassNotFoundException e)
        {

        }

        return object;
    }
}
