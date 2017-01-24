

package matrici;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

/**
 *
 * @author Michele Marisaldi
 */
public class Matrice {
    
    int[][] theMatrix;
    
    // costruttore uno
    public Matrice(int x, int y) {
        theMatrix = new int[x][y];
    }
    
    // costruttore due
    public Matrice(int[][] m) {
        theMatrix = m;
    }
    
    public void fillRandom() {
      for (int i = 0; i < theMatrix.length; i++) {
        for (int j = 0; j < theMatrix[i].length; j++) {
          theMatrix[i][j] = (int) (Math.random()*10);
        }
      }
    }

    @Override
    public String toString() {
        String s ="";
        for (int i = 0; i < theMatrix.length; i++) {
            for (int j = 0; j < theMatrix.length; j++) {
                s += theMatrix[i][j] + "\t";
                
            }
            s +="\n";    
        }
        return s;
    }

    public void toFile( String filename ) {
        try{
            FileWriter fw = new FileWriter(filename);
            fw.write(this.toString());
        }catch(IOException ex){
            Logger.getLogger(Matrice.class.getName());
        }
    }

    public void fromFile( String filename ) {
        
         // da completare
    }
    
}

