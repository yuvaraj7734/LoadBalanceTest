public class Final {
    public static boolean getMax(int[] requests) {
        int leftPointer = 1;
        int rightPointer = requests.length - 2;
        int leftPartSum, middlePartSum, rightPartSum;
        int[] sumArray = new int[requests.length];

        sumArray[0] = requests[0];
        for (int i = 1; i < requests.length; i++)
            sumArray[i] = sumArray[i - 1] + requests[i];

        while (leftPointer < rightPointer) {
            leftPartSum = sumArray[leftPointer] - requests[leftPointer];
            middlePartSum = sumArray[rightPointer] - sumArray[leftPointer] - requests[rightPointer];
            rightPartSum = sumArray[requests.length - 1] - sumArray[rightPointer];
            if (leftPartSum == middlePartSum && middlePartSum == rightPartSum)
                return true;
            if (leftPartSum < rightPartSum)
                leftPointer++;
            else if (leftPartSum > rightPartSum)
                rightPointer--;
            else {
                leftPointer++;
                rightPointer--;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int requests[] = {1,1,1,1,1,1};
        System.out.println("Load Distributed :" + getMax(requests));
    }
}
