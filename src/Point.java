import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Point {

    private static final Logger logger = LogManager.getLogger(Main.class);
    public Point(int x, int y){
        this.x=x;
        this.y=y;
        this.status=IS_EMPLY;
    }

    public final static int IS_EMPLY=0;
    public final static int CUP =1;


    private int x;
    private int y;
    private int status;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
