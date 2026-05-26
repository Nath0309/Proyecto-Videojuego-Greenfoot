import greenfoot.*;

public class GameOver extends World
{
    public GameOver(int puntos)
    {
        super(720, 600, 1);

        showText("GAME OVER", 360, 200);

        showText(
            "PUNTAJE: " + puntos,
            360,
            300
        );

        showText(
            "Presiona R para reiniciar",
            360,
            400
        );
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("r"))
        {
            Greenfoot.setWorld(
                new PantallaInicio()
            );
        }
    }
}
