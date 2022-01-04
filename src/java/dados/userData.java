package dados;

import java.util.Objects;

public class userData implements Comparable<userData>  {
    private String name;
    private double score;
    private int count;

    public userData() {}
    
    
    
    public userData(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public userData(double score) {
        this.score = score;
    }

    public userData(String name, double score, int count) {
        this.name = name;
        this.score = score;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }
    
    public String getScoreString(){
        return String.valueOf(score);
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "userData{" + "name=" + name + ", score=" + score + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final userData other = (userData) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    

    @Override
    public int compareTo(userData o) {
        return getScoreString().compareTo(o.getScoreString());
    }
    
    
    
    
}
