public class bubbleSort{
    public static int[] sort(int[] unsorted){
        int currentIndex=0;
        int temp;
        int sortierterBereich=unsorted.length;
        int anzTausche=0;
        int anzVergleiche=0;

        while(sortierterBereich>1){
            currentIndex=0;
            while(currentIndex+1 < sortierterBereich){
                if(unsorted[currentIndex]>unsorted[currentIndex+1]){
                    temp= unsorted[currentIndex];
                    unsorted[currentIndex] = unsorted[currentIndex+1];
                    unsorted[currentIndex+1] = temp;
                    anzTausche++;
                }
                printArr(unsorted);
                anzVergleiche++;
                currentIndex++;
            }
            System.out.println("sortierBEreich ist gewachsen /t"+anzTausche+"/v"+anzVergleiche);
            sortierterBereich--;
        }

        return unsorted;
    }

        public static void printArr(int[] arr){
            for (int i : arr) {
                System.out.print(i+" ");
            }
            System.out.println("");
        
        }
    

       
    
}
