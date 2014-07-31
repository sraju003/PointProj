package com.git.beans;

public class Line {
	
	public double findDistance(Point startPoint,Point endPoint){
		double distance=Math.sqrt(Math.pow((startPoint.getX()-endPoint.getX()),2)+Math.pow((startPoint.getY()-endPoint.getY()),2));
		return distance;
	}

	public static void main(String[] args){
		Point startPoint=new Point();
		startPoint.setX(0);
		startPoint.setY(0);
		Point endPoint=new Point();
		endPoint.setX(5);
		endPoint.setY(12);
		
		Line line=new Line();
		System.out.println(line.findDistance(startPoint, endPoint));
	}
	
}
