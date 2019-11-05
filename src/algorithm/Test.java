package algorithm;

import algorithm.Point;

public class Test {

	private Trajectory t1;
	private Trajectory t2;

	public static void main(String[] args) {

		DTW dtw = new DTW();
		Test t = new Test();
		double[][] trajectory1 = { { 1, 1 }, { 1, 2 }, { 3, 2 }, { 4, 4 }, { 4, 5 }, { 5, 5 } };
		double[][] trajectory2 = { { 1, 1 }, { 4, 1 }, { 4, 3 }, { 4, 5 }, { 4, 6 }, { 5, 6 } };

		Point[] p1 = new Point[trajectory1.length];
		Point[] p2 = new Point[trajectory2.length];
		for (int i = 0; i < trajectory1.length; i++) {
			p1[i] = new Point();
			p1[i].x = trajectory1[i][0];
			p1[i].y = trajectory1[i][1];
			p2[i] = new Point();
			p2[i].x = trajectory2[i][0];
			p2[i].y = trajectory2[i][1];
		}
		/*
		 * p2[1] = new Point(); p2[1].x =1.0; p2[1].y =3.0;
		 */
		t.t1 = new Trajectory();
		t.t1.setPoints(p1);
		t.t2 = new Trajectory();
		t.t2.setPoints(p2);
		System.out.println(dtw.calculateDTW(t.t1, t.t2));
	}

}
