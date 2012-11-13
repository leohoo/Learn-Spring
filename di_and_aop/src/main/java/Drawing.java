public class Drawing {
	private IShape shape;

	public Drawing(){
		
	}
	
	public Drawing(IShape shape) {
		this.shape = shape;
	}

	public void draw() {
		shape.draw();
	}
}
