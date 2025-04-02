public class Human {
    Weapon weapon;

    public Human(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Human human){
        weapon.attack();
    }
}
