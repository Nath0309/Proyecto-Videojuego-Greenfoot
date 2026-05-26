import greenfoot.*;

public class HUD extends Actor
{
    private int puntos = 0;
    private int nivel = 1;

    public HUD()
    {
        actualizar();
    }

    public void sumarPuntos(int cantidad)
    {
        puntos += cantidad;

        
        nivel = (puntos / 50) + 1;

        actualizar();
    }
    
    public int getNivel()
    {
        return nivel;
    }

    public int getPuntos()
    {
        return puntos;
    }

    private void actualizar()
    {
        setImage(new GreenfootImage(
            "PUNTOS: " + puntos +
            "    NIVEL: " + nivel,
            30,
            Color.WHITE,
            Color.BLACK
        ));
    }
}
