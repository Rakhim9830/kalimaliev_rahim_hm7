public class Magic extends Hero{
    @Override
    public void applySuperAbility() {
        setTypeOfSuperAbility("Fire Wall");
        System.out.println("Magic применил суперспособность " + getTypeOfSuperAbility());
    }
}
