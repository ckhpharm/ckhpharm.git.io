// 소스코드 3-19 (dsArray.java)
// 클래스이름 : dsArray.class
// 배열을 이용한 요일 검색, 삭제

class dsArray
{
  public static void main (String[] args)
  {
    String[] dsStr;
    dsStr = new String[100];
    int nItems = 0;
    String searchKey;
    String deleteKey;

    dsStr[0] = "Monday";
    dsStr[1] = "Tuesday";
    dsStr[2] = "Wednesday";
    dsStr[3] = "Thursday";
    dsStr[4] = "Friday";
    dsStr[5] = "Saturday";
    dsStr[6] = "Sunday";
    nItems = 7;

    for (int i = 0; i < nItems; i++)
    {
      System.out.print(dsStr[i] + " ");
    }
    System.out.println(" ");

    searchKey = "Wednesday";
    int i;
    for (i = 0; i < nItems; i++)
    {
      if (dsStr[i] == searchKey)
      {
        break;
      }
    }
    if (i == nItems)
    {
      System.out.println("Can't find " + searchKey);
    }
    else
    {
      System.out.println("Found " + searchKey);
    }

    deleteKey = "Thursday";
    for (i = 0; i< nItems; i++)
    {
      if (dsStr[i] == deleteKey)
      {
        break;
      }
    }
    for (int k = i; k < nItems-1; k++)
    {
      dsStr[k] = dsStr[k + 1];
    }
    nItems--;
    for (i = 0; i < nItems; i++)
    {
      System.out.print(dsStr[i] + " ");
    }
    System.out.println(" ");
  }
}
