package other;
// { Driver Code Starts
import java.util.*;



public  class FindMinInStack
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int q = sc.nextInt();
            GfG g = new GfG();
            while(q>0)
            {
                int qt = sc.nextInt();

                if(qt == 1)
                {
                    int att = sc.nextInt();
                    g.push(att);
                    //System.out.println(att);
                }
                else if(qt == 2)
                {
                    System.out.print(g.pop()+" ");
                }
                else if(qt == 3)
                {
                    System.out.print(g.getMin()+" ");
                }

                q--;
            }
            System.out.println();
            T--;
        }

    }
}


// } Driver Code Ends

class GfG
{
    int minEle = Integer.MAX_VALUE;
    Stack<Integer> s = new Stack<>();
    List<Integer> a = new ArrayList<>() ;
    /*returns min element from stack*/
    int getMin()
    {
        if(s.size() == 0)
            return  -1 ;
        // Your code here
        return  minEle ;
    }

    /*returns poped element from stack*/
    int pop()
    {

        int x =-1;
        if(s.size() > 0) {
            x= s.pop();
            a.remove(new Integer(x));

            if (x == minEle) {
                if(a.size()> 0)
                    getNewMin();
                else
                    minEle = Integer.MAX_VALUE ;

            }
            // Your code here

        }
        return x;
    }

    private void getNewMin() {
        if(s.size() == 0)
            minEle = Integer.MAX_VALUE ;
        else
        {
            Collections.sort(a);
            minEle = a.get(0);
        }
    }

    /*push element x into the stack*/
    void push(int x)
    {
        s.push(x) ;
        if(minEle > x){
            minEle = x ;

        }
        a.add(x);
        // Your code here
    }
}


/**
 * You are given N elements and your task is to Implement a Stack in which you can get minimum element in
 * O(1) time.
 *
 * Example 1:
 *
 * Input:
 * push(2)
 * push(3)
 * pop()
 * getMin()
 * push(1)
 * getMin()
 * Output: 3 2 1
 * Explanation: In the first test case for
 * query
 * push(2)  the stack will be {2}
 * push(3)  the stack will be {2 3}
 * pop()    poped element will be 3 the
 *          stack will be {2}
 * getMin() min element will be 2
 * push(1)  the stack will be {2 1}
 * getMin() min element will be 1
 */
