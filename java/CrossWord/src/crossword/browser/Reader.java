/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crossword.browser;

import crossword.Crossword;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author BamBalooon
 */
public interface Reader {
    LinkedList<Crossword> getAllCws() throws ClassNotFoundException, FileNotFoundException, IOException;
}
