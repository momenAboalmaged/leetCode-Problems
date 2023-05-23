class Solution {
      public static boolean isIsomorphic(String s, String t) {
        if (s.length()==t.length()){
            HashMap<Character,Character> map=new HashMap<>();
            for (int i = 0; i <s.length() ; i++) {
                char key =s.charAt(i);
                char value =t.charAt(i);


                if (!map.containsKey(key)){

                    if (map.containsValue(value)) {
                        return false;
                    }else {
                        map.put(key, value);
                       
                    }


                }else {
                    if (map.get(key)!=value){
                        return false;
                       // System.out.println("flaaag here  "+flag);
                    }else {
                        map.put(key, value);
                      //  flag=true;
                        //System.out.println("flaaag here again "+flag);
                    }

                }


            }
            return true;
        }return  false;

    }
}