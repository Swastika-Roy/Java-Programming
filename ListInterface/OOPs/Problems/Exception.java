package Java.ListInterface.OOPs.Problems;

public class Exception {
    public static void main(String[] args) {
        int a = 5, b = 0;
        int arr[] = {1,2,3};
        String s = "Ram";
        int d[] = null;

        for (int i = 0; i < 4;i++){
            try {
                switch (i){
                    case 0 : System.out.println(a/b);
                    break;
                    case 1 : System.out.println(arr[5]);
                    break;
                    case 2 : System.out.println(s.charAt(5));
                    break;
                    case 3 : System.out.println(d[1]);
                    break;
                }
            }
            catch (ArithmeticException e){
                System.out.println(e);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            catch (StringIndexOutOfBoundsException e){
                System.out.println(e);
            }
            catch (NullPointerException e){
                System.out.println(e);
            }
            finally {
                System.out.println("program run again");
            }
        }
        System.out.println("quit");
    }
}
