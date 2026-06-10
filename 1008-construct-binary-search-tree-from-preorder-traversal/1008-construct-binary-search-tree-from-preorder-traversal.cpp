/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left),
 * right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* bstFromPreorder(vector<int>& preorder) {
        if (!preorder.size())
            return nullptr;
        TreeNode* root = new TreeNode(preorder[0]);
        TreeNode* curr = root;
        int i = 0;
        return dfs(i, preorder, INT_MIN, INT_MAX);
    }

    TreeNode* dfs(int& i, vector<int>& preorder, int l, int r) {
        int n = preorder.size();
        if (i >= n)
            return nullptr;

        if(preorder[i]<=l || preorder[i]>=r) return nullptr;    

        TreeNode* root = new TreeNode(preorder[i++]);

        root->left = dfs(i, preorder, l, root->val);

        root->right = dfs(i, preorder, root->val, r);

        return root;
    }
};