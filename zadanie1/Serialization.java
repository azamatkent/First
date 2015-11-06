/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1;

import java.io.*;

/**
 *
 * @author Азамат
 */
public class Serialization implements Serializable
{

    private TaskController all; // объект типа контроллера должен быть 

    public static void safe(Serialization s)
    {
        try
        {
            FileOutputStream file = new FileOutputStream("C:\\Users\\Азамат\\Desktop\\t.txt");
            ObjectOutputStream object = new ObjectOutputStream(file);
            object.writeObject(s);
            object.flush();
            object.close();
            file.close();
        } catch (IOException e)
        {

        }
    }

    public static Serialization load()
    {
        Serialization object = null;
        try
        {
            FileInputStream file = new FileInputStream("C:\\Users\\Азамат\\Desktop\\t.txt");
            ObjectInputStream ob = new ObjectInputStream(file);
            object = (Serialization) ob.readObject();
            ob.close();
            file.close();
        } catch (FileNotFoundException e)
        {
            File file = new File("C:\\Users\\Азамат\\Desktop\\t.txt");

        } catch (IOException | ClassNotFoundException e)
        {

        }

        return object;
    }
}
