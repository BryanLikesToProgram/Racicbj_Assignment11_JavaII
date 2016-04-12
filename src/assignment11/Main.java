package assignment11;

public class Main {

	public static void main(String[] args) {
		Class01 class01 = new Class01();
		
		int x = 3;
		int y = 2;
		int z = 1;
		
		for (int i = 1; i > 0; i++){
						
			double xPlusY = Math.sqrt(x + y);
			double xMinusY = Math.sqrt(x - y);
			double xPlusZ = Math.sqrt(x + z);
			double xMinusZ = Math.sqrt(x - z);
			double yPlusZ = Math.sqrt(y + z);
			double yMinusZ = Math.sqrt(y - z);
			
			
			Outerloop:
			while( Math.sqrt(x + y) % 1 == 0){	
				xPlusY = Math.sqrt(x + y);
				//System.out.println('\n' + "x + y = true" + '\n');
				System.out.println("Current x+y+Z = " + (x+y+z));
				while (Math.sqrt(x - y) % 1 != 0){
					if (class01.paramater(x, y, z) == false){
						break Outerloop;
					}
					y = y + 1;
					//break Outerloop;
				}
				while (Math.sqrt(x - y) % 1 == 0){
					 xMinusY = Math.sqrt(x - y);
					//System.out.println('\n' + "x - y = true" + '\n');
					System.out.println("Current x+y+Z = " + (x+y+z));
					if (class01.paramater(x, y, z) == false){
						break Outerloop;
					}
					while (Math.sqrt(x + z) % 1 != 0){
						xPlusZ = Math.sqrt(x + z);
						if (class01.paramater(x, y, z) == false){
							break Outerloop;
						}
						z = z + 1;
						//break Outerloop;
					}
					while (Math.sqrt(x + z) % 1 == 0){
						xPlusZ = Math.sqrt(x + z);
						//System.out.println("x + z = true");
						System.out.println("Current x+y+Z = " + (x+y+z));
						if (class01.paramater(x, y, z) == false){
							break Outerloop;
						}
						while(Math.sqrt(x - z) % 1 != 0){
							xMinusZ = Math.sqrt(x - z);
							if (class01.paramater(x, y, z) == false){
								break Outerloop;
							}
							z = z + 1;
							//break Outerloop;
						}
						while (Math.sqrt(x - z) % 1 == 0){
							xMinusZ = Math.sqrt(x - z);
							//System.out.println("x - z = true");
							System.out.println("Current x+y+Z = " + (x+y+z));
							if (class01.paramater(x, y, z) == false){
								break Outerloop;
							}
							if (Math.sqrt(y + z) % 1 != 0){
								yPlusZ = Math.sqrt(y + z);
								if (class01.paramater(x, y, z) == false){
									break Outerloop;
								}
								y = y + 1;
								//break Outerloop;
							}
							while (Math.sqrt(y + z) % 1 == 0){
								yPlusZ = Math.sqrt(y + z);
								//System.out.println("y + z = true");
								System.out.println("Current x+y+Z = " + (x+y+z));
								if (class01.paramater(x, y, z) == false){
									break Outerloop;
								}
								if (Math.sqrt(y - z) % 1 != 0){
									yMinusZ = Math.sqrt(y - z);
									if (class01.paramater(x, y, z) == false){
										break Outerloop;
									}
									y = y + 1;
									//break Outerloop;
								}
								while (Math.sqrt(y - z) % 1 == 0){
									System.out.println("y - z = true");
									System.out.println("Solution: " + (x+y+z));
									System.out.println("x = " + x + " Y = " + y + " Z = " + z);
									System.exit(0);
								}
							}
						}
					}
				}
				
			}
			//if (i % 10000 == 0){
				System.out.println("Current x+y+Z = " + (x+y+z));	
				if ((x+y+z) == 1006195){
					System.exit(0);
				}
				while(y >= x){
					x = x + 1;
					//break;
				}
				while (z >= x){
					x = x + 1;
					//break;
				}
				while (z >= y){
					y = y + 1;
					//break;
				}
				x = x + 1;
			
		}
		
	}


}
