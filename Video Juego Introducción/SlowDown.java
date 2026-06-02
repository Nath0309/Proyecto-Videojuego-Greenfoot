import greenfoot.*;

public class SlowDown extends Actor
{
    private int speed = 3;

    public void act()
    {
        setLocation(getX(), getY() + speed);

        // Eliminar al salir de pantalla
        if(getY() >= getWorld().getHeight()-10)
        {
            getWorld().removeObject(this);
            return;
        }

        // Detectar colisión con el jugador
        Actor car = getOneIntersectingObject(Mclaren.class);

        if(car != null)
        {
            Greenfoot.playSound("SlowDown.mp3");
            
            Mclaren player = (Mclaren) car;

            player.disminuirVelocidad();

            getWorld().removeObject(this);
        }
    }
}