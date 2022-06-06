// 소스코드 3-11 (multiArray.java)
// 클래스 이름: multiArray.java

public class multiArray
{
  public static void main (String[] args)
  {
    int [][] dsDigit = new int[4][2];

    dsDigit[0] = new int[] {2,4,6,8};
    dsDigit[1] = new int[] {1,3,5,7};

    System.out.println("The dsDigit array is: \n");
    print (dsDigit);

  }
  private static void print(int[][] dsDigit)
  {
    for (int i = 0; i < 2; i++)
    {
      System.out.print("{");
      for (int j = 0; j < dsDigit.length; j++)
      {
        System.out.print(dsDigit[i][j] + " ");
        System.out.println("}");
      }
      for (int i = 0; i < 4; i++)
      {
        System.out.print("{");
        for (int j = 0; j < 2; j++)
        {
          System.out.print(dsDigit[j][i] + " ");
        }
        System.out.println("}")
      }
    }
  }
}
