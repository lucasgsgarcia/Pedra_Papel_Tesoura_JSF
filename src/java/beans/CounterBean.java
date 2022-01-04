package beans;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value="counterBean")
@ApplicationScoped
public class CounterBean {
    private int counter = 0;

    public CounterBean() {
    }
    
    public void inc(){ counter++; }
    
    public void dec(){ counter--; }

    public int getCounter() {return counter;}
    
    
    
}
