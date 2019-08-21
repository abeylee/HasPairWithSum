class Solution{
   public static void main(String[] args) throws java.lang.Exception
      {
          Integer[] arr = {1, 2, 4, 5, 3, 4};
          Integer sum = 8;
          checkHasPairWithSum(Integer[] arr, Integer sum)
      }


    public static boolean checkHasPairWithSum(Integer[] arr, Integer sum){
        ArrayList<Integer> appendValues = new ArrayList<>();
        for(int i = 0; i < arr.length; ++i){
            Integer compliments = sum - arr[i];
            if( compliments == arr[i] ){
                if (Collections.frequency( Arrays.asList( arr ), compliments ) > 1 ) {
                    appendValues.add( compliments );
                }
           } else {
                if(Arrays.asList(arr).contains(compliments)){
                    appendValues.add(compliments);
                }
            }
        }
        System.out.println( appendValues );
        return false;
    }
}
