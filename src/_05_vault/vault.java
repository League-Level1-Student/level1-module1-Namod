package _05_vault;

import sun.reflect.generics.tree.ReturnType;

public class vault {

	int secretCode;

	vault(int secret) {
		this.secretCode = secret;
	}

	boolean tryCode(int num) {
		// TODO Auto-generated method stub
		if (num == secretCode) {
			System.out.println("done");
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		vault x = new vault(1);
		x.tryCode(1);
	}
}
