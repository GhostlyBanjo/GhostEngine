package net.ge.src.util;

public class Vector {

		private int x;
		private int y;
	
		
		public Vector(int x, int y){
			this.x = x;
			this.y=y;
			}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
    public int addX(int x) {
        this.x +=x;
        return this.x;
    }
    public int addY(int y){
        this.y+=y;
        return this.y;
    }
    public void multiply(int f){
        this.x *= f;
        this.y *= f;
    }
	
	
}
