/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.questao2.Chassi;
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
public class TestChassi {
    
    @Test
    public void calculadorChassi1(){
        Chassi chassi = new Chassi();

        String a = "9BP17164GA0000001";
        int b = 2010;
        assertEquals(b,Chassi.verificarchassi(a));
    }
    
    @Test
    public void calculadorChassi2(){
        Chassi chassi = new Chassi();

        String a = "9BP17164GB0000001";
        int b = 2011;
        assertEquals(b,Chassi.verificarchassi(a));
    }
    
    @Test
    public void calculadorChassi3(){
        Chassi chassi = new Chassi();

        String a = "9BP17164GC0000001";
        int b = 2012;
        assertEquals(b,Chassi.verificarchassi(a));
    }
    
    @Test
    public void calculadorChassi4(){
        Chassi chassi = new Chassi();

        String a = "9BP17164Ga0000001";
        int b = 1;
        assertEquals(b,Chassi.verificarchassi(a));
    }
    
    @Test
    public void calculadorChassi5(){
        Chassi chassi = new Chassi();

        String a = "9BP17164GA000000123423";
        int b = 0;
        assertEquals(b,Chassi.verificarchassi(a));
    }
    
}
