<h2><a href="https://www.geeksforgeeks.org/problems/paths-from-root-with-a-specified-sum/1">Paths from Root with Sum</a></h2><h3>Medium</h3><hr><p><span style="font-size: 18px;">Given a binary tree and an integer <strong>s</strong>, print all paths starting from the root such that the sum of the node values along each path equals s.</span></p>
<p><span style="font-size: 18px;">A path does not necessarily have to end at a leaf node.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input : </strong>s = 8, root[] = [1, 20, 3, N, N, 4, 15, 6, N, N, N, N, N]<br>      <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/927543/Web/Other/blobid0_1777523064.png" width="179" height="159"> &nbsp; &nbsp; &nbsp; <br><strong>Output : </strong>[[1, 3, 4]]
<strong>Explanation : </strong>Sum of path 1, 3, 4 = 8. <br>      <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/927543/Web/Other/blobid1_1777523329.png" width="178" height="158"></span></pre>
<pre><span style="font-size: 18px;"><strong>Input : </strong>s = 38, root[] = [10, 28, 13, N, N, 14, 15, 21, 22, 23, 24, N, N, N, N, N, N, N, N]<br>        <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/927543/Web/Other/blobid2_1777523563.png" width="176" height="156"><br>
<strong>Output : </strong>[[10, 28], [10, 13, 15]] 
<strong>Explanation : </strong>Sum of path 10, 28 = 38 and Sum of path 10, 13, 15 = 38.<br>        <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/927543/Web/Other/blobid3_1777523775.png" width="177" height="157"></span></pre>
<div><strong><span style="font-size: 18px;">Constraints :</span></strong></div>
<div><span style="font-size: 18px;">1 ≤ n ≤ 2*10<sup>3</sup>, where n is the number of nodes in the binary tree</span></div>
<div><span style="font-size: 18px;">-10<sup>3</sup> ≤ s ≤ 10<sup>3</sup></span></div>
<div><span style="font-size: 18px;">-10<sup>3</sup>&nbsp;≤ Node.value ≤ 10<sup>3</sup></span></div>