package com.ass1;


public class DrawableMain {

	public static void main(String[] args) {
		
		Drawable rect=new Drawable() {
			
			@Override
			public String draw(String parameter) {
				// TODO Auto-generated method stub
				return "Rectangle Can Draw";
			}
		};
		System.out.println(rect.draw(""));
		
		Drawable circle=(p1)->"Circle can draw with "+p1;

		
		System.out.println(circle.draw("Factor"));
		
		

	}

}
