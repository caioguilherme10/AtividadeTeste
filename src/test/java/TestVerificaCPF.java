/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.calculodigitoverificador.VerificaCPF;
import java.math.BigInteger;
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
public class TestVerificaCPF {
    
    @Test
    public void calculadorCPF1(){
        VerificaCPF verificarcpf = new VerificaCPF();

        long a = 33312498740L;
        
        assertTrue(verificarcpf.verificaCPF(a));
    }
    
    @Test
    public void calculadorCPF2(){
        VerificaCPF verificarcpf = new VerificaCPF();

        long b = 9686170421L;
        
        assertTrue(verificarcpf.verificaCPF(b));
    }
}
