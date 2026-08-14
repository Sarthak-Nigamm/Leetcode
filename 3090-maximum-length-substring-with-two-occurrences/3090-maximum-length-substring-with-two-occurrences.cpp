#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    int maximumLengthSubstring(string s) {
        int n = s.length();
        int max_len = 0;
        int left = 0;
        
        // Character counts track karne ke liye 26 size ka array
        vector<int> freq(26, 0);

        for (int right = 0; right < n; right++) {
            int char_idx = s[right] - 'a';
            freq[char_idx]++;

            // Agar frequency 2 se badi ho jaye, toh left pointer ko 
            // aage badhao jab tak count <= 2 na ho jaye
            while (freq[char_idx] > 2) {
                freq[s[left] - 'a']--;
                left++;
            }

            // Valid window ki length calculate karo
            max_len = max(max_len, right - left + 1);
        }

        return max_len;
    }
};