package net.ge.src.util;

public class Vector {

		private float x;
		private float y;
	
		
		public Vector(float x, float y){
			this.x = x;
			this.y=y;
			}
		public float getX() {
			return x;
		}
		public float getY() {
			return y;
		}
    public float addX(float x) {
        this.x +=x;
        return this.x;
    }
    public float addY(float y){
        this.y+=y;
        return this.y;
    }
    public void multiply(float f){
        this.x *= f;
        this.y *= f;
    }
    public void addVector(Vector v){
        this.x += v.getX();
        this.y += v.getY();
    }
	public void flipY(){
        this.y*=-1;
    }
    public void flipX(){
        this.x*=-1;
    }
}
