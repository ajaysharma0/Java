// Syntax for an enhanced for loop (for each) in Java

for (ElementType variable : collection) {
    // Code to be executed for each element in the collection
}

/*
ElementType is the type of elements in the collection.
variable is the loop variable that takes on the value of each element in turn.
collection is the iterable structure (array, list, etc.).
  */

class main{
  public static void main(String args[]){
    int arr[]={1,2,3,4,5};
    for(int i:arr){
      System.out.print(i);
    }
}
