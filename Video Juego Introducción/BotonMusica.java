import greenfoot.*;

public class BotonMusica extends Actor
{
    private boolean silenciado = false;

    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            MyWorld mundo = (MyWorld)getWorld();

            if (!silenciado)
            {
                mundo.getMusica().setVolume(0);
                silenciado = true;
            }
            else
            {
                mundo.getMusica().setVolume(35);
                silenciado = false;
            }
        }
    }
}
