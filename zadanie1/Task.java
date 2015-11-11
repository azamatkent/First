package zadanie1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Азамат
 */
public class Task
{
    
    private int key;
    private String name, description;
    private Date date;
    // Еще нужны контакты 

    public Task(Integer key, String name, String description, Date date)
    {
        this.key = key;
        this.name = name;
        this.description = description;
        this.date = date;
    }
    
    public int getKey()
    {
        return key;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public Date getDate()
    {
        //SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        //System.out.println(format1.format(date));
        return date;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public void setKey(int key)
    {
        this.key = key;
    }
}
