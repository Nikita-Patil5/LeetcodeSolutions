class Solution {
    public int tribonacci(int n) {
        if(n < 2)
        {
            return n;
        }

        if( n == 2)
        {
            return 1;
        }
        int first = 0, second = 1, third = 1, fourth = 0;
       for (int i = 3; i <= n; i++)
        {
           
            fourth = first + second + third;
            first = second;
            second = third;
            third = fourth;
        }

        return fourth;

        
    }
}