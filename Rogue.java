import java.util.Random;

public class Rogue extends Character{
    private int hp;

    public Rogue(int hp){
        this.hp = hp;
    }

    @Override
    public void setHp(int hp){
        this.hp = hp;
    }

    @Override
    public int getHp(){
        return hp;
    }

    @Override
    public void displayName(){
        System.out.println("Rogue");
        System.out.println("HP: " + getHp());
    }

    @Override
    public int skill1(){
        Random rnd = new Random();
        int damageSkill1 = rnd.nextInt(101);
        System.out.println("Rogue used Quick Slash dealt: " + damageSkill1);
        return damageSkill1;


    }
    
}
