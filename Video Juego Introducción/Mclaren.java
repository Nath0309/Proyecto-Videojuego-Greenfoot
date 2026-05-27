import greenfoot.*;

public class Mclaren extends Actor
{
    private int speed = 2;

    public void act()
    {
        mover();
        limites();
        aumentarDificultad();
    }

    private void mover()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + speed, getY());
        }

        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - speed, getY());
        }

        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - speed);
        }

        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + speed);
        }
    }

    private void limites()
    {
        if(getX() < 250)
        {
            setLocation(250, getY());
        }

        if(getX() > 470)
        {
            setLocation(470, getY());
        }
    }

    private void aumentarDificultad()
    {
        MyWorld world = (MyWorld)getWorld();

        int nivel = world.getHUD().getNivel();

        speed = 2 + (nivel / 2);
    }

    // POWER UP
    public void aumentarVelocidad()
    {
        speed += 4;
    }

    // POWER DOWN
    public void disminuirVelocidad()
    {
        speed -= 3;

        if(speed < 2)
        {
            speed = 2;
        }
    }
}