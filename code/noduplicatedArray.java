// 소스코드 3-17 (noduplicatedArray.java)
// 클래스 이름 : noduplicatedArray.class
// 중복을 허용하지 않는 배열의 검색, 삽입, 삭제

class noduplicatedArray
{
  public static void main (String[] args)
  {
    int dsInt[];
    dsInt = new int[100];
    int i;
    int searchKey;
    int deleteKey;
    int insertKey;
    int nItems;

    dsInt[0] = 71;
    dsInt[1] = 72;
    dsInt[2] = 73;
    dsInt[3] = 74;
    dsInt[4] = 75;
    dsInt[5] = 76;
    dsInt[6] = 77;
    dsInt[7] = 78;
    dsInt[8] = 79;
    dsInt[9] = 80;
    dsInt[10] = 81;
    dsInt[11] = 82;
    dsInt[12] = 83;
    dsInt[13] = 84;
    dsInt[14] = 85;
    nItems = 15;

    for (i = 0; i < nItems; i++)
    {
      System.out.print(dsInt[i] + " ");
    }
    System.out.println(" ");

    searchKey = 72;
    insertKey = 86;
    deleteKey = 76;

    System.out.println(" ");
    System.out.println("1) 중복을 허용하지 않는 배열에서 값 찾기: ");
    for (i = 0; i < nItems; i++)
    {
      if (dsInt[i] == searchKey)

      {
        System.out.println((i+1)+ "번째에서 찾음");
        break;
      }
    }
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("2) 중복을 허용하지 않는 배열에서 값 삽입하기 ");
    System.out.println("(순서 배열이 아닌 경우): ");
    {
      nItems++;
      dsInt[nItems-1] = insertKey;
      System.out.println((nItems)+"번째에 삽입됨");
    }
    System.out.println(" ");
    System.out.println("삽입된 결과 출력: ");
    for (i = 0; i < nItems; i++)
    {
      System.out.print(dsInt[i] + " ");
    }
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("3) 중복을 허용하지 않는 배열에서 ");
    System.out.println("값 삭제하기: ");

    for (i = 0; i < nItems; i++)
    {
      if (dsInt[i] == deleteKey)
      {
        for (int k = i; k < nItems - 1; k++)
        {
          dsInt[k] = dsInt[k + 1];

        }
        nItems--;
        break;
      }
    }
    System.out.println(" ");
    System.out.println("삭제된 결과 출력:");
    for (i = 0; i < nItems; i++)
    {
      System.out.print(dsInt[i] + " ");
    }
    System.out.println(" ");
  }
}
