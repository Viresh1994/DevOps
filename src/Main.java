public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int[] arr = new int[1000];
        int count=0;
        for(int i=0; i<arr.length; i++){
            System.out.println("using for: "+count);
            count++;
        }
        int j=0;
        while(j<arr.length){
            System.out.println("using while "+j);
            j++;
        }
    }
}