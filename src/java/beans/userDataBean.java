package beans;

import dados.userData;
import dao.UsuarioDAO;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.inject.Named;


@Named(value = "userDataBean")
@ApplicationScoped
public class userDataBean {
    
    @Inject
    CounterBean contador;
    
    List<userData> users;
    userData user;
    
    
    
    public userDataBean() {
        users = new LinkedList<userData>();
        user = new userData();
        contador = new CounterBean();
    }

    public userData getUser() {
        return user;
    }

    public CounterBean getContador() {
        return contador;
    }
    
    public int getCount(){
        return contador.getCounter();
    }

    public void setContador(CounterBean contador) {
        this.contador = contador;
    }
    
    

    @PostConstruct
    public void iniciar(){
        int x = contador.getCounter();
    }
    
    public void setUser(userData user) {
        this.user = user;
    }

    public List<userData> getUsers() {
        updateScores();
        return users;
    }
    
    public void updateScores(){
        if (!users.contains(user)){
            users.add(user);
        } else {
            int pos = users.indexOf(user);
            users.set(pos, user);
        }
        users.removeIf(user -> user.getScore() == 0);
        user = new userData();
        Collections.sort(users,  Collections.reverseOrder()); 
    }
    
     
    
}
