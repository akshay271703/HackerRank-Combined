

    static boolean isAnagram(String a, String b) {
        if(a.length()==b.length())
        {
          a=a.toLowerCase();
          b=b.toLowerCase();
          int char1[]= new int[26];
          int char2[]= new int[26];
          for(int i=0;i<=25;i++)
          {
            char1[i]=0;
            char2[i]=0;
          }
          for(int i=0;i<=a.length()-1;i++)
          {
            char1[((int)a.charAt(i))-97]++;
            char2[((int)b.charAt(i))-97]++;
          }
          for(int i=0;i<=25;i++)
          {
            if(char1[i]!=char2[i])
            return false;
          }
          return true;
        }
        else
        return false;
    }

