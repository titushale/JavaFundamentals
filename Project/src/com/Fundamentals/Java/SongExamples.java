package com.Fundamentals.Java;

public class SongExamples {
	
	
public String bottlesOfBeer() {
	int beerNum = 99;
	String word = "bottles";
	String songEnd = "";
	while (beerNum > 0) {
		if(beerNum == 1) {
			word = "bottle";
		}
		System.out.println(beerNum + " "+word+"of beer on the wall");
		System.out.println(beerNum + " "+word+"of beer");
		System.out.println("Take one down");
		System.out.println("pass it around");
		beerNum --;
		if(beerNum >0) {
			System.out.println(beerNum +""+word+"of beer on the wall\n");
		}else {
			songEnd = "No more bottles of beer on the wall";
		}
	}
	return songEnd;
}
}

	