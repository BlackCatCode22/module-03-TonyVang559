public class App {
    public static void main(String [] args) {

      //Here's my student object
      Student collegeStudent = new Student();

      //Student object's information data
      collegeStudent.firstName = "\n" + "Tony";
      collegeStudent.lastName = "\n" + "Vang";
      collegeStudent.major = "\n" + "Computer Information Systems";
      collegeStudent.gpa = 3.0;
      collegeStudent.age = 31;
      collegeStudent.onProbation = false;
      collegeStudent.city = "\n" + "Fresno";
      collegeStudent.state = "\n" + "California";
      collegeStudent.county = "\n" + "Fresno";

      //Here's my second student object
      Student collegeStudent2 = new Student();

      //Student object's information data
      collegeStudent2.firstName = "\n" + "Bruce";
      collegeStudent2.lastName = "\n" + "Lee";
      collegeStudent2.major = "\n" + "Computer Information Technology";
      collegeStudent2.gpa = 2.5;
      collegeStudent2.age = 25;
      collegeStudent2.onProbation = false;
      collegeStudent2.city = "\n" + "San Diego";
      collegeStudent2.state = "\n" + "California";
      collegeStudent2.county = "\n" + "San Diego";

      //Display student's object information
      System.out.println("\n" + "College student first name is: " + collegeStudent.firstName);
      System.out.println("\n" + "College student last name is: " + collegeStudent.lastName);
      System.out.println("\n" + "College student major is: " + collegeStudent.major);
      System.out.println("\n" + "College student age is: " + collegeStudent.age);
      System.out.println("\n" + "College student major is: " + collegeStudent.major);
      System.out.println("\n" + "College student lives in: " + collegeStudent.city);

    }
}
