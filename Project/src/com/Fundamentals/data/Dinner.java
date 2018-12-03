package com.Fundamentals.data;

public enum Dinner {
	Turkey, Stuffing, Cranberry, SweetPotatoes, MacCheese, DinnerRolls, Ham, GreenBeanCasorole, GreenRice,
		MashedPotatoes, CornBread, DeviledEggs,PumkinPie,AppleCobler;
	
		private Dinner() {
		System.out.println("Constructor called for"+this.toString());
		}
	public void readyNow() {
		System.out.println("Lets eat already");
	}
}
	
		
