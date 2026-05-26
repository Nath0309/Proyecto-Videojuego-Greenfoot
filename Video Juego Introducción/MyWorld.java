import greenfoot.*;

public class MyWorld extends World{
    private int score = 0;
    private int spawnTimer = 0;

    public MyWorld(){
        super(720, 600, 1);
        prepare();
    }

    private void prepare(){
        Mclaren car = new Mclaren();
        addObject(car, 360, 500);
    }

    public void act(){
        spawnTimer++;

        if (spawnTimer % 60 == 0)
        {
            spawnObject();
        }
    }

    private void spawnObject(){
        int x = Greenfoot.getRandomNumber(220) + 250;

        int roll = Greenfoot.getRandomNumber(10);
        if (roll < 6)
        {
            addObject(new Coin(), x, 0);
        }
        else
        {
            addObject(new Obstacle(), x, 0);
        }
    }
    
    public void gameOver(){
        showText("¡GAME OVER!", getWidth() / 2, getHeight() / 2);
        Greenfoot.stop();
    }
}
