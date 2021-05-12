package model;

public class Person {
private String name;
private int age;
private Skills intro;

  public Person(){
    super();
  }

  public Person(String name, int age){
    this.name=name;
    this.age=age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
  public Skills getIntro() {
    return intro;
  }

  public void setIntro(Skills intro) {
    this.intro = intro;
  }

  @Override
  public String toString(){
    return "\n\t"+this.getName() +
      " has being doing a great job, so far no complaints.If I can use one word to describe him it would be \""
      + this.getIntro().getWord()
      + "\".\n\n Although, I haven't seen it I've heard is speciality is something like \""+ this.getIntro().getSpeciality()+"!\".";
  }

}
