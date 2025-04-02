public class WeaponFactory {
    private static Weapon weapon;

    private WeaponFactory() {} // private 생성자

    public static Weapon getSword() {
        if (weapon == null) {
            weapon = new Sword(); // 무기를 한 번만 생성
        }
        return weapon;
    }

    public static Weapon getBow() {
        if (weapon == null) {
            weapon = new Bow(); // 무기를 한 번만 생성
        }
        return weapon;
    }
}
