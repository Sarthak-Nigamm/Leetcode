#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

class Solution {
public:
    int maximumLengthSubstring(string s) {
        int n = s.length();
        int max_len = 0;

        for (int i = 0; i < n; i++) {
            // Har naye start index 'i' ke liye 26 size ka clean array banao
            int freq[26] = {0};

            for (int j = i; j < n; j++) {
                int idx = s[j] - 'a'; // Character index (0 to 25)
                freq[idx]++;

                // Agar kisi character ka count 2 se bada hua toh break kar do
                if (freq[idx] > 2) {
                    break;
                }

                // Maximum length update karo
                max_len = max(max_len, j - i + 1);
            }
        }

        return max_len;
    }
};