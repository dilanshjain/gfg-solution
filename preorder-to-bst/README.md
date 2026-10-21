<h2><a href="https://www.geeksforgeeks.org/problems/preorder-to-postorder4423/1">Preorder to BST</a></h2><h3>Medium</h3><hr><p><span style="font-size: 18px;">Given an array <strong>pre[]</strong> representing the preorder traversal of a <a href="https://www.geeksforgeeks.org/dsa/binary-search-tree-data-structure/">Binary Search Tree</a>.&nbsp;</span><span style="font-size: 14pt;">Construct the corresponding BST and return its <strong>root</strong>.<br></span></p>
<p><span style="font-size: 14pt;"><strong>Note: </strong>All node values are distinct.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">pre[] = [40, 30, 35, 80, 100]
<strong>Output: </strong>[40, 30, 80, N, 35, N, 100]<strong>
Explanation:</strong> The corresponding BST is:<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/926843/Web/Other/blobid0_1777091399.png" width="228" height="175"> <br></span></pre>
<pre><strong><span style="font-size: 18px;">Input:</span></strong><span style="font-size: 18px;"> pre[] = [10, 5, 1, 7, 40, 50]
<strong>Output: </strong>[10, 5, 40, 1, 7, N, 50]<br><strong>Explanation: </strong>The corresponding BST is:<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/930729/Web/Other/blobid1_1783924086.webp" width="231" height="176"><br></span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>3</sup>, n is the size of pre<br>1 ≤ pre[i] ≤ 10<sup>4</sup></span></p>