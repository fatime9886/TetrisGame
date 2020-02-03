package zetcode;


	import java.awt.Color;
import java.awt.Rectangle;

	
	public class Form {

		Rectangle a;
		Rectangle b;
		Rectangle c;
		Rectangle d;
		Color color;
		private String name;
		public int form	=	1;
		public Form (Rectangle a,Rectangle b,Rectangle c,Rectangle d) {
			this.a	=	a;
			this.b	=	b;
			this.c	=	c;
			this.d	=	d;
			
		}
		public Form (Rectangle a,Rectangle b,Rectangle c,Rectangle d,String name) {
			this.a	=	a;
			this.b	=	b;
			this.c	=	c;
			this.d	=	d;
			this.name	=	name;
			
		
		switch(name) {
		case "j":
		color	=	Color.BLACK;
		break;
		case "l":
		color	=	Color.BLUE;
		break;
		case "o":
		color	=	Color.DARK_GRAY;
		break;
		case "s":
		color	=	Color.GREEN;
		break;
		case "t":
		color	=	Color.ORANGE;
		break;
		case "z":
		color	=	Color.PINK;
		break;
		case "i":
		color	=	Color.RED;
		break;
		}
		
		}

		public String getName() {
			return name;
		}
		public void changeForm() {
			if(form !=4) {
				form++;
			}else {
				form	=	1;
			}
		}
	}


