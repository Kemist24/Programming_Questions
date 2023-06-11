<h2><a href="https://practice.geeksforgeeks.org/problems/magic-numbers3143/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article">Magic numbers</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two function, one is<strong> h(x)</strong> which is the <strong>product</strong> of all the number in an&nbsp;array A[ ] having size N and another<br>
function <strong>f(x)</strong> which denotes&nbsp;the <strong>GCD&nbsp;</strong>of all the numbers in an array. Your task is to find the value of &nbsp;<strong>h(x)<sup>f(x)</sup></strong>.</span><br>
<span style="font-size:18px"><strong>Note:&nbsp;</strong>Since the answer can be very large, use modulo 10<sup>9</sup>+7.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>N = </strong>2, <strong>A[] = </strong>{2, 4}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">64</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">h(x) = 8, f(x) = 2, Therefore, the
answer is 8<sup>2</sup> = 64.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>N = </strong>3, <strong>A[] = </strong>{1, 3, 7}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">21</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">h(x) = 21, f(x) = 1, Therefore, the
answer is 21<sup>1</sup> = 21.</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>getVal()</strong> which takes an Integer N and an array of integers A[] as input and returns the answer.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 &lt;= N &lt;= 10<sup>5</sup><br>
1 &lt;= A[i] &lt;= 10<sup>5</sup></span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;<code>Algorithms</code>&nbsp;