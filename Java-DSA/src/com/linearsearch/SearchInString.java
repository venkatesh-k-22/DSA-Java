package com.linearsearch;

public class SearchInString {
    public static void main(String[] args) {
        String str = "venkatesh";
        char target = 't';
        System.out.println(search(str,target));
    }

    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }

        //check if the given character is found return true
        for (int index = 0; index < str.length(); index++) {
            char element = str.charAt(index);
            if(element == target){
                return true;
            }
        }
        //if the character is not found then return false
        return false;
    }
}
