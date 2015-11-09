/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1;

import java.util.*;

/**
 *
 * @author Азамат
 */
public class CollectionModel
{

    private Map<Integer, Task> a = new HashMap<Integer, Task>();

    public Task getTask(int key)
    {
        Task obj = null;
        for (Map.Entry e : a.entrySet())
        {
            if (key == (int) e.getKey())
            {
                obj = (Task) e.getValue();
                break;
            }
        }
        return obj;
    }

    public void setTask(Task task, int key)
    {
        for (Map.Entry e : a.entrySet())
        {
            if (key == (int) e.getKey())
            {
                e.setValue(e);
                break;
            }
        }
    }

    public void deleteTask(int key)
    {
        for (Map.Entry e : a.entrySet())
        {
            if (key == (int) e.getKey())
            {
                a.remove(key);
                break;
            }
        }
    }
}
