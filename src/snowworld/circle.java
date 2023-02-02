package snowworld;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class circle implements Actor{
    private MoveRight mr;

    public circle(MoveRight mr) {
        super();
        this.mr = mr;
    }

    public void update(GameContainer gc, int delta){
        mr.update(delta);
    }
    public void render(Graphics graphics){
        graphics.drawOval((float) this.mr.getX(), (float) this.mr.getY(), 20, 20);
    }
}
