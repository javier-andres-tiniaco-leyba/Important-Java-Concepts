class Test {
    public static void main(String args[])
    {
       final int arr[] = {1, 2, 3, 4, 5};  // Note: arr is final
       for (int i = 0; i < arr.length; i++)
       {
           arr[i] = arr[i]*10;
           System.out.println(arr[i]);
       }
    }
}

// The array is declared as final, but the elements of the array
// are changed without any problem. Arrays are objects and object
// variables are references in java. So, when we declare an
// object variable as final, it means the variable can not
// be changed to refer to anything else. See code 21 for difference
