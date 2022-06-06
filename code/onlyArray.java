//소스코드 3-9 (onlyArray.java)
// 클래스 이름: onlyArray.class
// 일차원 배열을 생성하고 저장된 자료 값을 출력하는 한 예

public class onlyArray
{
  public static void main(String[] args)
  {
    int dsInt[];   // int형의 자료들을 위한 배열 dsInt 선언

    dsInt = new int[10]; //dsInt 배열의 생성
// 부분 1
    dsInt[0] = 12;
    dsInt[1] = 53;
    dsInt[2] = 49;
    dsInt[3] = 72;
    dsInt[4] = 68;
    dsInt[5] = 27;
    dsInt[6] = 91;
    dsInt[7] = 11;
    dsInt[8] = 7;
    dsInt[9] = 3;
// 부분 2
    for (int i = 0; i < dsInt.length; i++)
    {
      System.out.print(dsInt[i] + " ");
    }
  }
}
