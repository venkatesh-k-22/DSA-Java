package com.binarysearch;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
//leetcode easy problem same as flooring number but don't return equal values
//return greater than the equal value, if the element is not present return first index element.
public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'j';
        char res = smallestLetter(letters, target);
        System.out.println(res);
    }

    static char smallestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;

        while(start <= end){
            int mid = (start+end)/2;
            if(target<letters[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return letters[start%letters.length];
    }
}
