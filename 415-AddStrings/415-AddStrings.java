// Last updated: 8/12/2026, 8:51:48 AM
import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
       BigInteger n=new BigInteger(num1);
       BigInteger m=new BigInteger(num2);
       BigInteger c=n.add(m);

        return c.toString();
    }
}