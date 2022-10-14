package fr.lixtec.form10.j2.cours;

/**
 * Cette classe implemente un détecteur de température.
 * 
 * @author Ludovic.terral
 */
public class DetecteurTemperature
{
    // ---------- static fields ----------
    private static final String CRITIQUE_STATE = "critique";
    private static final String ELEVE_STATE = "élévé";
    private static final String NORMAL_STATE = "normal";
    
    
    
    // ---------- instance fields ----------
    private float temperature;    
    


    // ---------- static methods ----------
    public static void main(String[] args)
    {
        DetecteurTemperature detecteurTemperature = new DetecteurTemperature();

        for(float temperature = 25; temperature < 45; temperature += 2) {
          detecteurTemperature.setTemperature(temperature);
          System.out.println("Température actuelle    = " + temperature);
          System.out.println("Niveau actuel           = " + detecteurTemperature.getNiveau());
          System.out.println("Niveau normal atteint   = " + detecteurTemperature.isNiveauAtteint(NORMAL_STATE));
          System.out.println("Niveau élevé atteint    = " + detecteurTemperature.isNiveauAtteint("élevé"));
          System.out.println("Niveau critique atteint = " + detecteurTemperature.isNiveauAtteint(CRITIQUE_STATE));
          System.out.println("###################################");
        }
    }

    

    // ---------- instance methods ----------
    public void setTemperature(float t) 
    {
        this.temperature=t;
    }
    
    
    public String getNiveau() 
    {
        String result = NORMAL_STATE;
        if (temperature<=30) 
        {
            result = NORMAL_STATE;
        }
        else if (temperature>30 && temperature<38)
        {
            result = ELEVE_STATE;
        }
        else
        {
            result=CRITIQUE_STATE;
        }
        return result;
    }
    
    
    
    public boolean isNiveauAtteint(String niveau) 
    {
        String state = getNiveau();
        return state.equals(niveau);
    }
}