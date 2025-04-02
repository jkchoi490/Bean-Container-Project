public class Config { //-> 싱글톤으로

    public Human makeSwordHuman(){
        Weapon weapon = WeaponFactory.getSword();
        return new Human(weapon);
    }

    public Human makeBowHuman(){
        Weapon weapon = WeaponFactory.getBow();
        return new Human(weapon);
    }

}
