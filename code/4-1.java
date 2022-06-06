class LinkNode
{
  private int iData;
  private LinkNode nodeNext;

  //생성자
  public LinkNode (int iDataInput)
  {
    iData = iDataInput;
  }
  // 노드의 자료를 출력하는 메소드
  public void displayNode()
  {
    System.out.print(iData);
  }
  // 자료에 접근하는 메소드
  public int getData()
  {
    return iData;
  }
  public void setData (int inputData)
  {
    iData = inputData;

  }
  public LinkNode getNodeNext()
  {
    return nodeNext;
  }
  public void setNodeNext(LinkNode inputNode)
  {
    nodeNext = inputNode;
  }
}
