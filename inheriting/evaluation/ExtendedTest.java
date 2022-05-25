package evaluation;

public class ExtendedTest extends Test {
  int evaluation4;

  public ExtendedTest(
    String lastName,
    String group,
    int evaluation1,
    int evaluation2,
    int evaluation3,
    int evaluation4
  ) {
    super(lastName, group, evaluation1, evaluation2, evaluation3);
    this.evaluation4 = evaluation4;
    this.evaluationSum += evaluation4;
  }

  public void showData() {
    super.showData();

    System.out.println("Fourth evaluation: " + evaluation2);
  }
}
