 class MinSort {

    String initialString;
    int minPos = -1;
    String result = "";

     MinSort(String initialString) {
        this.initialString = initialString;
    }

     Character rmin(String initialString) {
            if(initialString == null || initialString.length() == 0) {
                return null;
            }
            char ch = initialString.charAt(0);
            if(initialString.length() == 1)
                return ch;
            char c = rmin(initialString.substring(1));
            if (ch < c){
                minPos = initialString.indexOf(ch);
                return ch;
            }
            else{
                minPos = initialString.indexOf(c);
                return c;
            }
        }

     String eliminatedMinPosElement(String initialString){
        String t;
        String t1 = initialString.substring(0, minPos);
        t = t1 + initialString.substring(minPos+1);
        return t;
    }

    public String sort(String s){
        result += rmin(s).toString();
        if (s == null || s.length() == 1) return null;
        sort(eliminatedMinPosElement(s));
        return result;
    }

}
