/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1;

import java.util.Date;

/**
 *
 * @author Азамат
 */
public class TaskView
{

    public void printTaskDetails(int taskKey, String taskName, String taskDescription, Date taskDate)
    {
        System.out.println("Task: " + taskKey);
        System.out.println("Name: " + taskName);
        System.out.println("Description: " + taskDescription);
        System.out.println("Date: " + taskDate);
    }
}
