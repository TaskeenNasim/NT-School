// 05/07/2022

System.out.println("Sorting the sort....");
// Insert 




java: <identifier> expected

// ye code likhne par aisa aa raha, samajh nai aa raha kaha galat hai

int pos=1;
{
        int min;
        for(int i = pos; i < size - 1; i++)
        {
            min = i;
            {

            for(int j=i+1; j< size; j++) {              //why j<size, why not j<size-1 ?
                 if ( myArrayList.get(j) < myArrayList.get(min) ) {
                     int temp = myArrayList.get(i);
                     myArrayList.set(i, myArrayList.get(min));
                     myArrayList.set(min, temp);
                 }
            }
            }
        }
        System.out.println("Print sorted element: ");
        System.out.println(myArrayList);

    }