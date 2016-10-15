package entities;

/**
 * Created with IntelliJ IDEA.
 * User: Sam
 * Date: 9/26/16
 * Time: 9:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class PointTime
{
  private double xPos;
  private double zPos;
  private int tick;
  private double angle;
  private PlayerAction action;

  public PointTime(double xPos, double zPos, int tick, double angle, PlayerAction action) {
    this.xPos = xPos;
    this.zPos =zPos;
    this.tick = tick;
    this.angle = angle;
    this.action = action;
  }

  public double getAngle() {
    return angle;
  }

  public double getXPos() {
    return xPos;
  }

  public double getZPos() {
    return zPos;
  }

  public PlayerAction getAction() {
    return action;
  }
}
