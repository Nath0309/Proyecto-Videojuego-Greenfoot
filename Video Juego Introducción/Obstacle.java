import greenfoot.*;

public class Obstacle extends Actor{
    private int speed = 3;

    public void act(){
        setLocation(getX(), getY() + speed);

        if (getY() >= getWorld().getHeight()-10){
            getWorld().removeObject(this);
            return;
        }
        
        Actor car = getOneIntersectingObject(Mclaren.class);
        if (car != null){
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
            return;
        }
    }
}
