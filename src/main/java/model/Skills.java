package model;

public class Skills {
  private String word;
  private int grade;
  private String Speciality;

  public Skills(){
    super();
  }

  public Skills(String words, int grade, String Speciality) {
    this.word = words;
    this.grade = grade;
    this.Speciality=Speciality;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String words) {
    this.word = word;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public String getSpeciality() {
    return Speciality;
  }

  public void setSpeciality(String speciality) {
    Speciality = speciality;
  }
}
