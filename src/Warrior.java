public class Warrior extends Hero{
    @Override
    public void applySuperAbility() {
        setTypeOfSuperAbility("CriticalDamage");
        System.out.println("Warrior применил суперспособность " + getTypeOfSuperAbility());
    }
}
