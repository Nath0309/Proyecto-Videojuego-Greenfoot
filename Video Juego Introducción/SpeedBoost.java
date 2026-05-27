import greenfoot.*;

public class SpeedBoost extends Actor
{
    private int speed = 3;

    public void act()
    {
        // Movimiento hacia abajo
        setLocation(getX(), getY() + speed);

        // Eliminar al salir de pantalla
        if(getY() >= getWorld().getHeight()-10)
        {
            getWorld().removeObject(this);
            return;
        }

        // Detectar colisión con el carro
        Actor car = getOneIntersectingObject(Mclaren.class);

        if(car != null)
        {
            
            Mclaren player = (Mclaren) car;

            player.aumentarVelocidad();

            getWorld().removeObject(this);
        }
    }
}