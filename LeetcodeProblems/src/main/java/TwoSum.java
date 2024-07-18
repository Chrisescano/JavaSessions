public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {11, 2, 15, 7};
        int target = 9;

        //2 pointer method
        /*
        in our base case we want to compare numbers from
        [0,1], [0,2] ... [0, L - 1]
        which allows us to compare the first element to all the elements of the array

        what happens if we want to compare numbers from
        [1,2], [1,3] ... [1, L - 1] ?
        well we just change n = nums[ 0 ] to n = nums [ 1 ]
        and we change i = 1 to i = 2

        what happens if we want to compare all numbers following the method above?
        we will have to follow the pattern
        [2,3], [2,4] ... [2, L - 1] all the way to [L - 2, L - 1] which is the last comparison

        is there a pattern to this thinking?
         */

        //            if ( n + m == target ) {
//                System.out.printf("Found solution [%d,%d]", n, m);
//                break;
//            }

//        for (int i = 1; i < nums.length; i++) {
//            int n = nums[ 0 ];
//            int m = nums[ i ];
//        }
//
//        for (int i = 2; i < nums.length; i++) {
//            int n = nums[ 1 ];
//            int m = nums[ i ];
//        }
//
//        for (int i = 3; i < nums.length; i++) {
//            int n = nums[ 2 ];
//            int m = nums[ i ];
//        }

//        for (int b = 0; b < nums.length; b++) {
//
//            for (int i = b + 1; i < nums.length; i++) {
//                int n = nums[ b ];
//                int m = nums[ i ];
//
//                if ( n + m == target ) {
//                    System.out.printf("Found solution [%d,%d]", n, m);
//                    break;
//                }
//            }
//        }

        int[] solution = twoSum(nums, target);
        System.out.println("Solution ["+solution[0]+","+solution[1]+"]");

        //your 2 pointer solution is a double for loop implementation
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int b = 0; b < nums.length; b++) {

            for (int i = b + 1; i < nums.length; i++) {
                int n = nums[ b ];
                int m = nums[ i ];

                if ( n + m == target ) {
                    //return new int[] {b,i}; //short-hand way
                    int[] solution = new int[2]; //long-hand way
                    solution[0] = b;
                    solution[1] = i;
                    return solution;
                }
            }
        }
        return null;
    }
}
