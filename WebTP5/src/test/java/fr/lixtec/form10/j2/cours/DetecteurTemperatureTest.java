package fr.lixtec.form10.j2.cours;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class DetecteurTemperatureTest
{
    static DetecteurTemperature detecteur;

    
    @BeforeAll
    static void setUp()
    {
        detecteur = new DetecteurTemperature();
    }



    @Test
    void testIsNiveauAtteint()
    {
        Assert.assertTrue(detecteur!=null);
    }
}