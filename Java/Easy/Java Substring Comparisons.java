

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest  = s.substring(0, k);
        int length=s.length();
        for(int i=0;i<=length-1;i++)
        {
            try
                {
                    
                    String sub=s.substring(i,i+k);
                    if (smallest.compareTo(sub)>0)
                    smallest = sub;
                    
                    if(largest.compareTo(sub)<0)
                    largest=sub;
                    
                }
                catch(Exception e){}
        }
        return smallest + "\n" + largest;
    }

