class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < nums2.length; i++) {
            set.add(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            if (set.contains(nums1[i]))
                result.add(nums1[i]);
        }

       
       // add all elements in result set into array
        int[] intersectionArr = new int[result.size()];
        Iterator<Integer> it = result.iterator();
        for (int i = 0; it.hasNext();  i++) {
            intersectionArr[i]=it.next();
        }  

        // ---- OR ------
        //  int[] intersectionArr = result.stream().mapToInt(Integer::intValue).toArray();

        return intersectionArr;

    }
}