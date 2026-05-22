import greenfoot.*;  

public class Mclaren extends Actor
{
    public void act()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 1, getY());
        }

        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 1, getY());
        }

        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 1);
        }

        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 1);
        }

        // Limites de carretera

        if(getX() < 250)
        {
            setLocation(250, getY());
        }

        if(getX() > 470)
        {
            setLocation(470, getY());
        }
    }
}