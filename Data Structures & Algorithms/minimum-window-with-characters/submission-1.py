class Solution:
    def minWindow(self, s: str, t: str) -> str:
        n=len(s)
        m=len(t)
        hash1=Counter(t)  
        while m<=n:
            for i in range(n-m+1):
                win=s[i:i+m]
                hash2=Counter(win)
                if all(hash2[ch]>=hash1[ch]for ch in hash1):
                    return win       
            m+=1 
        return ""      

        