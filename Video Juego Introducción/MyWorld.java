import greenfoot.*;

public class MyWorld extends World
{
    private HUD hud;
    private int spawnTimer = 0;

    private int obstacleSpeed = 3;
    private int coinSpeed = 2;
    
    private GreenfootSound musica;

    public MyWorld()
    {
        super(720, 600, 1);

        prepare();

        
        hud = new HUD();
        addObject(hud, 120, 30);
        
        musica = new GreenfootSound("SoundTrack.mp3");
        musica.setVolume(35);
        musica.playLoop();
        
    }

    private void prepare()
    {
        Mclaren car = new Mclaren();
        addObject(car, 360, 500);
    }

    public void act()
    {
        spawnTimer++;

        
        if(spawnTimer % 60 == 0)
        {
            spawnObject();
        }

        
        int nivel = hud.getNivel();

        if(nivel == 2)
        {
            obstacleSpeed = 4;
            coinSpeed = 3;
        }

        if(nivel >= 3)
        {
            obstacleSpeed = 5;
            coinSpeed = 4;
        }
    }

    private void spawnObject()
    {
        int x = Greenfoot.getRandomNumber(220) + 250;

        int roll = Greenfoot.getRandomNumber(10);

        if(roll < 6)
        {
            Coin c = new Coin(coinSpeed);
            addObject(c, x, 0);
        }
        else
        {
            Obstacle o = new Obstacle(obstacleSpeed);
            addObject(o, x, 0);
        }
    }

    
    public void addScore(int puntos)
    {
        hud.sumarPuntos(puntos);
    }
    
    public HUD getHUD()
    {
        return hud;
    }
    
    public void gameOver()
    {
        musica.stop();

        Greenfoot.setWorld(
            new GameOver(hud.getPuntos())
        );
    }
}
