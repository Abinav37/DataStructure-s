class ABHI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String one="QWERTYUIOP";
        String two="ASDFGHJKL ";
        String three=" ZXCVBNM  ";
        str=str.toUpperCase();
        int res=0;
        int row=1;
        int pos=0;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(one.contains(Character.toString(c)))
            {
                if(row==2)
                    res+=1;
                if(row==3)
                    res+=2;
                row=1;
                res+=Math.abs((one.indexOf(c)-pos));
                pos=one.indexOf(c);
            }
            
            if(two.contains(Character.toString(c)))
            {
                
                res+=(Math.abs((two.indexOf(c)-pos)));
                if(row==1 || row==3)
                    res+=1;
                row=2;
                pos=two.indexOf(c);
            }   
                
            if(three.contains(Character.toString(c)))
            {
                
                res+=(Math.abs((three.indexOf(c)-pos)));
                    if(row==2)
                        res+=1;
                    if(row==1)
                        res+=2;
                    row=3;
                pos=three.indexOf(c);
            }   
            
        }
        System.out.print(res);
    }
}
