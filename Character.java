public abstract class Character {
    private int hp;

    public void setHp(int hp){
        this.hp = hp;
    }

    public int getHp(){
        return hp;
    }
    
    public abstract void displayName();

    public abstract int skill1();
}
