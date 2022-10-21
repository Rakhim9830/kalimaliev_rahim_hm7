public class Medic extends Hero{
    @Override
    public void applySuperAbility() {
        setTypeOfSuperAbility("Heal all allies");
        System.out.println("Medic применил супер способность " + getTypeOfSuperAbility());
    }

 int healPoints;
    public void increaseExperience(){
        healPoints = healPoints + (healPoints/10);
    }


}
