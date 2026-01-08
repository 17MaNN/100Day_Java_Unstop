Chessboard Cell Color Detector (Java)
Problem Statement

A standard chessboard can be visualized as a 2D Cartesian plane:

Columns (a to h) represent the x-axis

Rows (1 to 8) represent the y-axis

Given a chessboard coordinate in the form of a string (for example a1, c7, h8), determine whether the corresponding cell is Black or White.

Key Insight

If you:

Convert the column letter to its alphabetical position
(a → 1, b → 2, …, h → 8)

Add it to the row number

Then:

Even sum → Black

Odd sum → White

This works because chessboard colors alternate in both directions.

Example
Input	Calculation	Output
a1	1 + 1 = 2	Black
h1	8 + 1 = 9	White
c7	3 + 7 = 10	Black
