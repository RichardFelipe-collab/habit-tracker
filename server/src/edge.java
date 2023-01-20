 long noOfEdges = n*(n-1)/2;
        
        int noOfGraphs =  fastExpo(2, noOfEdges);
        
        return noOfGraphs;

    }
    var a
a[lee] =
= ['dog',
' fox' ;
console. log(a. length) ;
' cat',
'hen'];
    
    public static int fastExpo(long x, long y) {
        int MOD = (int) 1e9 + 7;
        
        long res = 1;
        
        while( y > 0 ){
            if((y&1) != 0 ){
                res = (res*x) % MOD;
            }
            
            x = (x*x) % MOD;
            y /= 2;
        }
        
        return (int)res;