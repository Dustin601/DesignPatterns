package snowworld;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import java.util.ArrayList;
import java.util.List;

public class main extends BasicGame {


    private List<Actor> actors;




    public main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        MoveRight mr = new MoveRight(0,0,0.3f);
        //this.actors.add(new rect(20,20));
        //this.actors.add(new oval(200,200));
        this.actors.add(new circle (mr));
        //for (int i = 0; i < 10; i++) {
        //    this.actors.add(new circle(Math.random() *800,Math.random()* 580, 0.5));
        //}

    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(gc, delta);
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }

    }

    public static void main(String[] args) {
        try {
            AppGameContainer container = new AppGameContainer(new main("Wintergame"));
            container.setDisplayMode(800,600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
