# coding: utf-8

# In[3]:

#Please look at the sample input, output and explanation of the output before attempting to understand this code.

#CREDITS to Gaukhar Dauzhan for solution - questions regarding this problem can be directed to her.

#T - number of test cases
T=int(input());
for j in range (T):
#L - number of different knowledge levels (Ls)
    L = int(input());
    NE = []
# create array of N * Ks: [[N1, K1], [N2, K2], ...]
    for i in range(L):
        splitted = input().split(" ");
        NE.append([int(splitted[0]), int(splitted[1])]);
#leftover indicates whether we have enough mentors of level i to mentor students of level i-1: Ni*Ki - Ni-1
#leftover > 0 -> mentors can have extra mentees (we are not interested in this)
#leftover < 0 -> we do not have enough mentors of level i to mentor students of level i-1 
    leftover = 0;
    NEprod = [x[0]*x[1] for x in NE];
    for i in range(1, L):
        leftover = NEprod[i]-NE[i-1][0]+leftover;
        if leftover > 0:
            leftover = 0;
        #sum number of students with the highest level that need to be mentored + students of lower levels that lack mentors
    leftover = abs(leftover) + NE[-1][0];
    #minimum required level should be greater than the greatest one
    min_level = NE[-1][1]+1;
    #the greatest of these requirements would be minimum required level of Major Mentee
    ans = max(leftover, min_level)
    print("Case #"+str(j+1)+": "+str(ans));
