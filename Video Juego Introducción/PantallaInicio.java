import greenfoot.*;

public class PantallaInicio extends World
{
    public PantallaInicio()
    {
        super(720, 600, 1);

        showText("PIXEL RACER", 360, 220);
        showText("Presiona ENTER para empezar", 360, 320);
        showText("Usa las flechas para moverte", 360, 380);
        showText("Procura no chocar!", 360, 410);
        
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
