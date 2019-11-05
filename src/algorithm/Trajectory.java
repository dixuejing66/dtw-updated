package algorithm;
public class Trajectory {
	public long[] times;
	public Point[] points;
	public Trajectory() {
	}
	public Trajectory(Point[] points,long[] times) {
		this.points = points;
		this.times = times;
	}
	public Trajectory(Trajectory t) {
		this.points = t.points;
		this.times = t.times;
	}
	
	public long[] getTimes() {
		return times;
	}
	public void setTimes(long[] times) {
		this.times = times;
	}
	public Point[] getPoints() {
		return points;
	}
	public void setPoints(Point[] points) {
		this.points = points;
	}
	
	public int length() {
		return points.length;
	}
	
}
