for (i = 0; i < nItems; i++);
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
