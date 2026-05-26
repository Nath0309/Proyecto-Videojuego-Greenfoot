import greenfoot.*;

public class Obstacle extends Actor
{
    private int speed;

    public Obstacle(int speed)
    {
        this.speed = speed;
    }

    public void act()
    {
        setLocation(getX(), getY() + speed);

        if(getY() >= getWorld().getHeight()-10)
        {
            getWorld().removeObject(this);
            return;
        }

        Actor car = getOneIntersectingObject(Mclaren.class);

        if(car != null)
        {
            Greenfoot.playSound("crash.mp3");
            
            MyWorld world = (MyWorld)getWorld();

            world.gameOver();
        }
    }
}
