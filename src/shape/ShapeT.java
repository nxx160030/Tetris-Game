package shape;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class ShapeT extends Shape {

	VerticalEdge edge1,edge2,edge3,edge4;
	
	public ShapeT(Graphics g, Point origin, int size) {
		super(g, origin, size);

		this.coordinates[0][0] = 0;
		this.coordinates[0][1] = 0;
		
		this.coordinates[1][0] = 1;
		this.coordinates[1][1] = 0;
		
		this.coordinates[2][0] = 2;
		this.coordinates[2][1] = 0;
		
		this.coordinates[3][0] = 1;
		this.coordinates[3][1] = 1;
	}

	public void drawShape() {
		
		this.draw(new Color(244,188,66));

	}

	@Override
	public void clockWiseRotate() {
		switch(direction){
		case 1:
			this.coordinates[0][0] = 1;
			this.coordinates[0][1] = 0;
			
			this.coordinates[1][0] = 0;
			this.coordinates[1][1] = 1;
			
			this.coordinates[2][0] = 1;
			this.coordinates[2][1] = 1;
			
			this.coordinates[3][0] = 1;
			this.coordinates[3][1] = 2;
			
			direction = 2;
			edge1=new VerticalEdge(origin.x,origin.y+size,origin.y+size*2);
			edge2=new VerticalEdge(origin.x+size,origin.y,origin.y+size);
			edge3=new VerticalEdge(origin.x+size,origin.y+size*2,origin.y+size*3);
			edge4=new VerticalEdge(origin.x+size*2,origin.y,origin.y+size*3);
			break;
		case 2:
			this.coordinates[0][0] = 1;
			this.coordinates[0][1] = 0;
			
			this.coordinates[1][0] = 0;
			this.coordinates[1][1] = 1;
			
			this.coordinates[2][0] = 1;
			this.coordinates[2][1] = 1;
			
			this.coordinates[3][0] = 2;
			this.coordinates[3][1] = 1;
			
			direction = 3;
			edge1=new VerticalEdge(origin.x,origin.y+size,origin.y+size*2);
			edge2=new VerticalEdge(origin.x+size,origin.y,origin.y+size);
			edge3=new VerticalEdge(origin.x+size*2,origin.y,origin.y+size);
			edge4=new VerticalEdge(origin.x+size*3,origin.y,origin.y+size);
			break;			
		case 3:
			this.coordinates[0][0] = 0;
			this.coordinates[0][1] = 0;
			
			this.coordinates[1][0] = 0;
			this.coordinates[1][1] = 1;
			
			this.coordinates[2][0] = 1;
			this.coordinates[2][1] = 1;
			
			this.coordinates[3][0] = 0;
			this.coordinates[3][1] = 2;
			
			direction = 4;
			edge1=new VerticalEdge(origin.x,origin.y,origin.y+size*3);
			edge2=new VerticalEdge(origin.x+size,origin.y,origin.y+size);
			edge3=new VerticalEdge(origin.x+size,origin.y+size*2,origin.y+size*3);
			edge4=new VerticalEdge(origin.x+size*2,origin.y+size,origin.y+size*2);
			break;
		case 4:
			this.coordinates[0][0] = 0;
			this.coordinates[0][1] = 0;
			
			this.coordinates[1][0] = 1;
			this.coordinates[1][1] = 0;
			
			this.coordinates[2][0] = 2;
			this.coordinates[2][1] = 0;
			
			this.coordinates[3][0] = 1;
			this.coordinates[3][1] = 1;
			
			direction = 1;	
			edge1=new VerticalEdge(origin.x,origin.y,origin.y+size);
			edge2=new VerticalEdge(origin.x+size,origin.y+size,origin.y+size*2);
			edge3=new VerticalEdge(origin.x+size*2,origin.y+size,origin.y+size*2);
			edge4=new VerticalEdge(origin.x+size*3,origin.y,origin.y+size);
		}
		
	}

	@Override
	public void counterClockWiseRotate() {
		switch(direction){
		case 1:
			this.coordinates[0][0] = 0;
			this.coordinates[0][1] = 0;
			
			this.coordinates[1][0] = 0;
			this.coordinates[1][1] = 1;
			
			this.coordinates[2][0] = 1;
			this.coordinates[2][1] = 1;
			
			this.coordinates[3][0] = 0;
			this.coordinates[3][1] = 2;
			
			direction = 4;
			edge1=new VerticalEdge(origin.x,origin.y,origin.y+size*3);
			edge2=new VerticalEdge(origin.x+size,origin.y,origin.y+size);
			edge3=new VerticalEdge(origin.x+size,origin.y+size*2,origin.y+size*3);
			edge4=new VerticalEdge(origin.x+size*2,origin.y+size,origin.y+size*2);
			break;
		case 2:
			this.coordinates[0][0] = 0;
			this.coordinates[0][1] = 0;
			
			this.coordinates[1][0] = 1;
			this.coordinates[1][1] = 0;
			
			this.coordinates[2][0] = 2;
			this.coordinates[2][1] = 0;
			
			this.coordinates[3][0] = 1;
			this.coordinates[3][1] = 1;
			
			direction = 1;
			edge1=new VerticalEdge(origin.x,origin.y,origin.y+size);
			edge2=new VerticalEdge(origin.x+size,origin.y+size,origin.y+size*2);
			edge3=new VerticalEdge(origin.x+size*2,origin.y+size,origin.y+size*2);
			edge4=new VerticalEdge(origin.x+size*3,origin.y,origin.y+size);
			break;			
		case 3:
			this.coordinates[0][0] = 1;
			this.coordinates[0][1] = 0;
			
			this.coordinates[1][0] = 0;
			this.coordinates[1][1] = 1;
			
			this.coordinates[2][0] = 1;
			this.coordinates[2][1] = 1;
			
			this.coordinates[3][0] = 1;
			this.coordinates[3][1] = 2;
			
			direction = 2;
			edge1=new VerticalEdge(origin.x,origin.y+size,origin.y+size*2);
			edge2=new VerticalEdge(origin.x+size,origin.y,origin.y+size);
			edge3=new VerticalEdge(origin.x+size,origin.y+size*2,origin.y+size*3);
			edge4=new VerticalEdge(origin.x+size*2,origin.y,origin.y+size*3);
			break;
		case 4:
			this.coordinates[0][0] = 1;
			this.coordinates[0][1] = 0;
			
			this.coordinates[1][0] = 0;
			this.coordinates[1][1] = 1;
			
			this.coordinates[2][0] = 1;
			this.coordinates[2][1] = 1;
			
			this.coordinates[3][0] = 2;
			this.coordinates[3][1] = 1;
			
			direction = 3;
			edge1=new VerticalEdge(origin.x,origin.y+size,origin.y+size*2);
			edge2=new VerticalEdge(origin.x+size,origin.y,origin.y+size);
			edge3=new VerticalEdge(origin.x+size*2,origin.y,origin.y+size);
			edge4=new VerticalEdge(origin.x+size*3,origin.y,origin.y+size);
		}
		
	}

	@Override
	protected void createEdges() {		
		edge1=new VerticalEdge(origin.x,origin.y,origin.y+size);
		edge2=new VerticalEdge(origin.x+size,origin.y+size,origin.y+size*2);
		edge3=new VerticalEdge(origin.x+size*2,origin.y+size,origin.y+size*2);
		edge4=new VerticalEdge(origin.x+size*3,origin.y,origin.y+size);
		this.edgeList.add(edge1);
		this.edgeList.add(edge2);
		this.edgeList.add(edge3);
		this.edgeList.add(edge4);
	}



}
