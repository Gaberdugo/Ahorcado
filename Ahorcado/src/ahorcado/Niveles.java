
package ahorcado;

import java.util.ArrayList;

/**
 *
 * @author GUSTAVOADOLFO
 */
public class Niveles {
    private ArrayList<String> palabras = new ArrayList<>();
    private ArrayList<String> frases;
    private ArrayList<String> textos;

    public Niveles() {
        //this.palabras = new ArrayList<>();
        this.frases = new ArrayList<>();
        this.textos = new ArrayList<>();
    }

    public ArrayList<String> getPalabras() {
        return palabras;
    }

    public ArrayList<String> getFrases() {
        return frases;
    }

    public ArrayList<String> getTextos() {
        return textos;
    }

    public void setPalabras(String palabras) {
        this.palabras.add(palabras);
    }

    public void setFrases(String frases) {
        this.frases.add(frases);
    }

    public void setTextos(String textos) {
        this.textos.add(textos);
    }
}