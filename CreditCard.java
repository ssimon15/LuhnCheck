 public class CreditCard
{
  public boolean verify(String a)
  {
    boolean g;
    if(!(a.length()>12 && a.length()<17)) g = false;
    else
    {
    String b ="";
    for(int c = a.length(); c > 0; c--)
    {
      b += a.charAt(c-1);
    }
    int f = a.length()+1;
    int[] odd = new int [ f/2 ];
    int[] even = new int [a.length()/2];
    for(int c = 0; c < odd.length-1 ; c ++)
    {
      odd[c] = Integer.parseInt(a.substring(2 * c,2 * c+1));
    }
    for(int c = 0; c < even.length-1; c++)
    {
      even[c] = Integer.parseInt(a.substring(c*2+1,2*c+2));
    }
    int osum = 0;
    int esum = 0;
    for(int c = 0; c < odd.length-1; c++)
    {
      osum += odd[c];
    }
    for(int c = 0; c < even.length-1; c++)
    {
      int d = even[c];
        d *=2;
        if (d>9)
      {
          d = 1+(d%10) ;
      }
      esum +=d;
    }
    g = ((osum+esum)%10==0);
    }
    return g;
  }
  public int findType(String a)
  {
    int b = 0;
    int c = Integer.parseInt(a.substring(0,1));
    if(c == 5) b=1;
    if(c == 4) b=2;
    if(c == 6) b=4;
    if(c == 3)
    {
     int d = Integer.parseInt(a.substring(1,2));
     if(c == 4 || c == 7) b = 3;
     if(c == 0 || c == 6 || c == 8) b = 5;
    }
    return b;
  }
}