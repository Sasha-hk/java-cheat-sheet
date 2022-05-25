package evaluation;

public class Test {
  String lastName;
  String group;
  int evaluation1;
  int evaluation2;
  int evaluation3;
  int evaluationSum;

  public Test(
    String lastName,
    String group,
    int evaluation1,
    int evaluation2,
    int evaluation3
  ) {
    this.lastName = lastName;
    this.group = group;
    this.evaluation1 = evaluation1;
    this.evaluation2 = evaluation2;
    this.evaluation3 = evaluation3;;
    this.evaluationSum = evaluation1 + evaluation2 + evaluation3;
  }

  public void showData() {
    System.out.println("Last name: " + lastName);
    System.out.println("Group: " + group);
    System.out.println("First evaluation: " + evaluation1);
    System.out.println("Second evaluation: " + evaluation2);
    System.out.println("Third evaluation: " + evaluation3);
    System.out.println("Sum evaluation: " + evaluationSum);
    System.out.println("Last name: " + lastName);
  }
}
