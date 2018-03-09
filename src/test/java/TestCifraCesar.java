/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.criptografiadecesar.CifraCesar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author caio
 */
public class TestCifraCesar {
    
   @Test
    public void calcularCifra1(){
        CifraCesar cifra = new CifraCesar();

        String a = "Rafael Guimaraes Sakurai";
        int b = 3;
        
        assertEquals(a,cifra.decriptar(b, cifra.encriptar(b, a)));
    }
}
