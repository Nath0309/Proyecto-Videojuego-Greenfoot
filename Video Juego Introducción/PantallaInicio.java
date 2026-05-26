import greenfoot.*;

public class PantallaInicio extends World
{
    public PantallaInicio()
    {
        super(720, 600, 1);

        showText("PIXEL RACER", 360, 220);
        showText("Presiona ENTER", 360, 320);
        showText("Flechas para moverte", 360, 380);
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
