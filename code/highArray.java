// 소스코드 3-27 (highArray.java)
// 클래스 이름: dsInter.class
// 클래스 인터페이스를 사용한 요일 검색, 삭제

class highArray
{
  private String[] highStr;
  private int nItems;

  public highArray (int max)
  {
    highStr = new String[max];
    nItems = 0;
  }
  public boolean find(String searchKey)
  {
    int i;
    for (i = 0; i < nItems; i++)
    {
      if (highStr[i] == searchKey)
      {
        break;
      }
      if (i == nItems)
      {
        return false;
      }
      else
      {
        return true;
      }
    }
    return true;
  }

  public void insert (String value)
  {
    highStr[nItems] = value;
    nItems++
  }

  public boolean delete(String value)
  {
    int i;
    for (i = 0; i < nItems; i++)
    {
      if (value == hightStr[i])
      {
        break;
      }
      if (i == nItems)
      {
        return false;
      }
      else
      {
        for (int k = i; k < nItems; k++)
        {
          hightStr[k] = highStr[k + 1];
        }
        nItems--;
        return true;
      }
    }
    return true;
  }
  public void display()
  {
    for(int i = 0; i < nItems; i++)
    {
      System.out.print(highStr[i] + " ");
    }
    System.out.println(" ");
  }
}

class dsInter
{
  public static void main (String[] args)
  {
    int maxSize = 100;
    hightArray interStr;
    interStr = new highArray(maxSize);

    interStr.insert("Monday");
    interStr.insert("Tuesday");
    interStr.insert("Wednesday");
    interStr.insert("Thursday");
    interStr.insert("Friday");
    interStr.insert("Saturday");
    interStr.insert("Sunday");
    interStr.display();

    String searchKey = "Thursday";
    if (interStr.find(searchKey))
    {
      System.out.println("Found" + searchKey);
    }
    else
    {
      System.out.println("Can't find" + searchKey);
    }
    interStr.delete("Thursday");

    interStr.display();
  }
}
