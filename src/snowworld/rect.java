package snowworld;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class rect implements Actor{
    private double x,y;

    public rect(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        if(this.y <= 600){
            this.y++;
        }else{
            this.y=0;
        }
    }

    @Override
    public void render(Graphics graphics) {

        graphics.drawRect((float) this.x, (float) this.y,20,20);
    }
}
