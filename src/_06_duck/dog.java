package _06_duck;

public class dog {
	 int numofsleep;
	 boolean doesPlay;

dog( boolean doesPlay, int numofsleep) {
    this.doesPlay = doesPlay;
    this.numofsleep = numofsleep;
}
void doesPlay() {
	if(this.doesPlay==true) {
		System.out.println("he play");
	}
	else {
		System.out.println("he doesnt play");
	}
	}
void sleep() {
	System.out.println("dog will sleep for " + this.numofsleep +"hours");
	
	
}

}