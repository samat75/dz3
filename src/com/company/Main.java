package com.company;

public class Main {

    public static void main(String[] args) {
        int index=0;
        int[] arr = {1, 12, -15, -37, 143, -554, 223, 3, 9, -8, 231, 777, -888, 111, 10, -11};

        for (int i : arr) {
            if(arr[i]<0){
                index=i;
                break;
            }
        }double sum=0;
        int temp=0;
        for (int i = index; i <arr.length; i++) {

            if(arr[i]>0){
                sum+=arr[i];
                temp++;
            }
        }
        sum=sum/temp;
        System.out.println("Среднее ариф:"+sum);






        }


    }

