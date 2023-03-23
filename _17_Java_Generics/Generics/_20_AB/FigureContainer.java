package _20_AB;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class FigureContainer {

	private List<Figure> figures;

    public FigureContainer () {
        this.figures = new Vector<Figure>();
    }

    public void add ( Figure f ) {
        this.figures.add(f);
    }

    public Figure getFigure ( int id ) {
        for ( Figure f : this.figures ) {
            if ( f.id == id ) {
                return f;
            }
        }
        return null;
    }

    public boolean contains ( int id ) {
        for ( Figure f : this.figures ) {
            if ( f.id == id ) {
                return true;
            }
        }
        return false;
    }

    public Iterator<Figure> iterator () {
        return this.figures.iterator();
    }

    public int size () {
        return this.figures.size();
    }

    public void drawAll () {
        for ( Figure f : this.figures ) {
            f.draw();
        }
    }

}
