import model.Person;
import model.Skills;

public class driver {

  public static void main(String[] args) {

    Person Matt = new Person("Matt", 1000);
    Skills skills = new Skills("Bars", 90, "Pega Drip");
    Matt.setIntro(skills);

    System.out.println(Matt.toString());
  }
}
