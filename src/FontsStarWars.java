import java.awt.Font;
import java.io.InputStream;
/**
 * @web http://www.jc-mouse.net
 * @author Mouse
 */
public class FontsStarWars {

    private Font font = null;

    public FontsStarWars() {
        String fontName = "Starjout.ttf" ;
        try {
            //Se carga la fuente
            InputStream is =  getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(fontName + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);            
        }
  }
    public Font MyFont( int estilo, float tamanio)
    {
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }

}
