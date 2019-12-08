package _06_duck;

public class duckrunner {
public static void main(String[] args) {
	duck x = new duck("pizza", 10);
	x.Quack();
	x.Waddle();
	duck y = new duck("burger", 5);
	System.out.println(x.favoriteFood+" "+x.numberOfFriends);
	System.out.println(y.favoriteFood+" "+y.numberOfFriends);
}
}
