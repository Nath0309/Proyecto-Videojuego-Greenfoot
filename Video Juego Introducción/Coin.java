import greenfoot.*;

public class Coin extends Actor{
    private int speed = 2;

    public void act(){
        setLocation(getX(), getY() + speed);

        Actor car = getOneIntersectingObject(Mclaren.class);
        if (car != null){
            getWorld().removeObject(this);
            return;
        }

        if (getY() >= getWorld().getHeight()){
            getWorld().removeObject(this);
            return;
        }
    }
}