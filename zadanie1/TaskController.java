/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Азамат
 */
public class TaskController
{

    private Task model;
    private TaskView view;

    TaskController(Task model, TaskView view)
    {
        this.model = model;
        this.view = view;
    }

    public String getTaskName()
    {
        return model.getName();
    }

    public String getTaskDescription()
    {
        return model.getDescription();
    }

    public Date getTaskDate()
    {
        return model.getDate();
    }

    public void setTaskName(String name)
    {
        model.setName(name);
    }

    public void setTaskDescription(String description)
    {
        model.setDescription(description);
    }

    public void setTaskDate(Date date)
    {
        model.setDate(date);
    }
    
    public void updateTask(int key, String name, String description, Date date)
    {
        
    }

    Map<Integer, Task> tasks = new HashMap<Integer, Task>();

    public void addTask(Integer key, String name, String description)
    {
        tasks.put(key, new Task());//.put(key, new Task(key, name, description));
    }
    
    public void delTask()
    {
        
    }

    public void updateView()
    {
        view.printTaskDetails(model.getName(), model.getDescription(), model.getDate());
    }
}
