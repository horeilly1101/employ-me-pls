"""Letter  Combinations of Phone Number

https://leetcode.com/problems/letter-combinations-of-a-phone-number
"""


class Solution:
    MAPPING = {
        "2": ["a", "b" ,"c"],
        "3": ["d", "e", "f"],
        "4": ["g", "h", "i"],
        "5": ["j", "k", "l"],
        "6": ["m", "n", "o"],
        "7": ["p", "q", "r", "s"],
        "8": ["t", "u", "v"],
        "9": ["w", "x", "y", "z"]
    }

    def letterCombinationsHelper(self, digits, i, j):
        # handle the empty string
        if i > j:
            return []

        # base case
        if i == j:
            return self.MAPPING[digits[i]]

        return [
            f"{num}{combo}"
            for num in self.MAPPING[digits[i]]
            for combo in self.letterCombinationsHelper(digits, i + 1, j)
        ]

    def letterCombinations(self, digits: str) -> List[str]:
        return self.letterCombinationsHelper(digits, 0, len(digits) - 1)
