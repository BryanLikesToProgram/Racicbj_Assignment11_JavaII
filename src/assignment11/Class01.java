package assignment11;

public class Class01 {
	public boolean paramater (int x, int y, int z){
		if (y >= x){
			return false;
		}
		if (z >= x){
			return false;
		}
		if (z >= y){
			return false;
		}
		return true;
	}
}
