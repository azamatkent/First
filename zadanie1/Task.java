package zadanie1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Азамат
 */
public class Task
{

    private String name, description;
    private Date date;
    // Еще нужны контакты 

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
}
