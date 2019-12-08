package _06_duck;

public class duck {
 int numberOfFriends;
 String favoriteFood;


duck( String favoriteFood, int numberOfFriends) {
    this.favoriteFood = favoriteFood;
    this.numberOfFriends = numberOfFriends;
}

void Quack() {
	
	System.out.println("quack, quack, quack");
	
}
void Waddle() {
	System.out.println("duck has waddle");
}
}