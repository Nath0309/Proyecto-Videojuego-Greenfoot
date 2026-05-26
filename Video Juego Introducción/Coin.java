import greenfoot.*;

public class Coin extends Actor
{
    private int speed;

    public Coin(int speed)
    {
        this.speed = speed;
    }

    public void act()
    {
        setLocation(getX(), getY() + speed);

        Actor car = getOneIntersectingObject(Mclaren.class);

        if(car != null)
        {
            Greenfoot.playSound("coin.mp3");
            
            MyWorld world = (MyWorld)getWorld();

            
            world.addScore(10);

            getWorld().removeObject(this);
            return;
        }

        if(getY() >= getWorld().getHeight())
        {
            getWorld().removeObject(this);
        }
    }
}