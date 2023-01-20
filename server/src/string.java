A special string s of length n consists of characters
0-9 only. Its characters can only be accessed
sequentially i.e the first '1 ' chosen is the leftmost
'1' in s. There is an array arrof m strings, also
consisting of characters 0-9. Calculate the
minimum number of characters needed from s to
construct a permutation of each of the strings in
arr.
Return an array of integers where the lth element
denotes the minimum length of a substring that
contains a permutation of the string in arr. If a
/*string cannot be constructed, return -1 at that
index.
Example
Consider 12, "064819848398", m = 3, arr=
["088", "364", "07"]
• To construct "088", Alice needs to access the first
7 characters ("064819848398") of the special
string and use only '0', '8', and '8'. Since the
characters can be rearranged, the results for '088',
'808', and '880' are all 7.
• To construct "364", access the first 10 characters
("064819848398") of the special string and use
only '6', 14', and '3. Rearrange to match "364".
• String "07" cannot be constructed from the special
strinp. No 171 is available.*/
    public static List<Integer> countMinimumCharacters(String s, List<String> arr) {
     List<Integer> list=new ArrayList<>();
            for(int i=0;i<arr.size();i++){
         int result=-2;
         char[] ch=s.toCharArray();
        
        String str=String.valueOf(arr.get(i));
        for(int j=0;j<str.length();j++)
        {
            char find=str.charAt(j);
            boolean found = false;
            for(int k=0;k<s.length();k++)
            {
                if(ch[k]==find)
                {
                    found=true;
                    ch[k]='a';
                    if(k>result)
                     result=k;
                    
                    break;
                }
            }
            if(!found){
                result=-2;
                break;
            }
        }
        result++;
        list.add(result);
                }   
                return list; 

    }
