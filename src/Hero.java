public abstract class Hero implements HavingSuperAbility {
    private int age;
    private int damage;
    private String typeOfSuperAbility;

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setTypeOfSuperAbility(String typeOfSuperAbility) {
        this.typeOfSuperAbility = typeOfSuperAbility;
    }

    public String getTypeOfSuperAbility() {
        return typeOfSuperAbility;
    }
}
