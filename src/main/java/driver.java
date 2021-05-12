import model.Person;
import model.Skills;

public class driver {

  public static void main(String[] args) {

    Person Matt = new Person("Matt", 1000);
    Skills skills = new Skills("Bars", 90,"Pega Drip");
    Matt.setIntro(skills);

    System.out.println(Matt.getName() +
      "has being doing a great job so no complaints.\n If I can use one word to describe him it would be "
      + Matt.getIntro().getWord()
    + ". Although I haven't seen it I've heard is speciality is something like "+ Matt.getIntro().getSpeciality()+"!");
  }
}
