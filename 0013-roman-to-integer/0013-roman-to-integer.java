class Solution {
    public int romanToInt(String s) {
        int sum = 0;
for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
// Logic for handling 'I'
if(c == 'I'){
if (i + 1 < s.length() && s.charAt(i + 1) == 'X') {
    sum += 9;
    i++;
} else if (i + 1 < s.length() && s.charAt(i + 1) == 'V') {
    sum += 4;
    i++; 
} else {
    sum += 1;
}}

    else if (c == 'V'){
        sum+=5;
    }
    else if (c == 'X'){
// Logic for handling 'x'
if (i + 1 < s.length() && s.charAt(i + 1) == 'L') {
    sum += 40;
    i++; // Skip 'L'
} else if (i + 1 < s.length() && s.charAt(i + 1) == 'C') {
    sum += 90;
    i++; // Skip 'C'
} else {
    sum += 10;
}

    }
    else if (c == 'L'){
        sum+=50;
    }
    else if (c == 'C'){
// Logic for handling 'C'
if (i + 1 < s.length() && s.charAt(i + 1) == 'D') {
    sum += 400;
    i++; // Skip 'D'
} else if (i + 1 < s.length() && s.charAt(i + 1) == 'M') {
    sum +=900 ;
    i++; // Skip 'M'
} else {
    sum += 100;
}

        
    }
    else if (c == 'D'){
        sum+=500;
    }
    else if (c == 'M'){
        sum+=1000;
    }   
    }

    return sum;}
}