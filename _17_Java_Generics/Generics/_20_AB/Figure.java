package _20_AB;

public class Figure {

	public int id;

    public Figure ( int id ) {
        this.id = id;
    }

    public void draw () {
        System.out.println("Figure.draw() mit id = " + this.id);
    }
	
}
