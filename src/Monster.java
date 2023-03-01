// Basic class definition
// public means this class can be used by other classes
// class names should begin with a capital letter
// A file cant contain two public classes. it can contain classes that are not public
// If you place class files in the same folder the java compiler will be able to
public class Monster {
     public final String TOMBSTONE = " Here Lies a Dead monster";
    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int xPosition = 0;
    private int yPosition = 0;
    private boolean alive = true;
    public String name = " Big Monster ";

    public int getAttack(){
        return attack;
    }
    public int getMovement(){
        return movement;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth (int decreaseHealth){
        health = health - decreaseHealth;
        if (health < 0){
            alive = false;
        }
    }
    public void setHealth (double decreaseHealth){
        int intDecreaseHealth = (int) decreaseHealth;
        health = health - intDecreaseHealth;
        if (health <0){
            alive = false;
        }
    }

    public Monster(int health, int attack, int movement){
        this.health = health;
        this.attack = attack;
        this.movement = movement;
    }
    public Monster(){

    }
    public static void main(String[] args){
        Monster Frank = new Monster();
        System.out.println(Frank.attack);
    }
}
