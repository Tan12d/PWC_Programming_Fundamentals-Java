# Practice program: Find the winner

## Description

The Sprinter sports club conducted a zone level relay running race. Due to the difficult scenario of covid, the Sprinter Sports Club held a zone level relay running competition in a nontraditional way, requiring the teams to compete individually and measuring the time it took each team to complete the course. The team that finishes the race in the shortest amount of time will be declared the winner. Create a Java application to assist the sports club in identifying its winners.

Assumptions:

Assume each team has 4 members
Take input from the user as a single String with fields separated by colon.The format of the input string is shown below.
TeamName:TimeTakenByMember1:TimeTakenByMember2:TimeTakenByMember3:TimeTakenByMember4.
Time taken by each member must be in float
Requirements:

If the number of teams is less than 2 , print "<numberOfTeams> is an invalid input" and terminate the program
If the time taken by each member is less than 1, print "Invalid number" and terminate the program
The output should be like "<winning team name> team wins the race in <total time taken> minutes"
 If two teams finish in the same amount of time, the team that started the race first will win.
Assume that the user inputs will be in the order of the teams that started the race first, second, and so on.
The output print statement should display the time with a precision of up to two decimal places. Use System.out.print(""%.2f"", ""time""); for this purpose.

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Do not use System.exit(0) to terminate the program

Sample Input/Output 1:

Enter the number of teams

4

Enter the details

Green:1.10:1.05:1.00:1.02

Red:1.05:1.04:1.10:1.00

Blue:1.11:1.10:1.10:1.05

Yellow:1.09:1.15:1.08:1.10

Green team wins the race in 4.17 minutes



Sample Input/Output 2:

Enter the number of teams

-2

-2 is an invalid input



Sample Input/Output 3:

Enter the number of teams

2

Enter the details

White:1.02:1.03:0:1.03

Invalid number



Sample Input/Output 4:

Enter the number of teams

2

Enter the details

Red:1.00:1.00:1.00:1.00

White:1.00:1.00:1.00:1.00

Red team wins the race in 4.00 minutes

Explanation:

Here Red team started the race first, that's why provided as 1st input.
Since both teams completed the race in same time,  i .e in 4.00 minutes, the team which started the race first will be considered as a winner.
So, Red team wins the race.

## Output

![image](https://github.com/Tan12d/PWC_Programming_Fundamentals-Java/assets/100254217/634dea1f-c7f8-44a5-b99b-088310a3deee)
