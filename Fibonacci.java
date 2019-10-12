/*****************************************************************************
CS Tutorial for Children 
Author: SRMK

*******************************************************************************/

public class Fibonacci
{
    
    final int MAX = 100;
    final int NIL = -1;
    int lookUp[] = new int [MAX];
    
    void _initialize(){
        for(int i=0; i<MAX;i++){
            lookUp[i]=NIL;
        }
    }
    public int fib(int n){
        if(lookUp[n]==NIL){
            if(n<=1){
                lookUp[n]= n;
            }
            else {
                lookUp[n]=fib(n-1)+fib(n-2);
            }
        }
        return lookUp[n];
    }
    
    
}
