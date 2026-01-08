🎄 Youngest Member in Royal Family (Gift Exchange Problem)
📌 Problem in One Line

Find the youngest family member who receives gifts from everyone but gives no gifts to anyone.

If no such person exists, print -1.

🧠 Core Idea (remember this, nothing else)

This problem is the same as the “Town Judge” problem.

Golden Rule:

Youngest member = receives (n − 1) gifts and gives 0 gifts

🔍 How We Solve It (simple + reliable)

Instead of tracking two arrays (in-degree, out-degree), we use ONE array called score.

What score[i] means
score[i] = gifts_received - gifts_given

For every gift (a → b):

a gave a gift → score[a]--

b received a gift → score[b]++

✅ How to Identify the Youngest Member

If there are n family members:

The youngest member will have:

score = n - 1


Why?

Receives gifts from everyone else → + (n − 1)

Gives no gifts → − 0

❌ When to Print -1

If no member has score = n - 1

🧪 Example
Input
3 2
1 3
2 3

Score calculation
Member 1: -1
Member 2: -1
Member 3: +2


Since n = 3 → n - 1 = 2

✅ Member 3 is the youngest.
