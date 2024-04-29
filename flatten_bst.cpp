class Solution
{
public:
    Node *flattenBST(Node *root)
    {
        if(root == NULL){
            return NULL;
        }
       Node *head = flattenBST(root->left);
       root->left = NULL;
       root->right = flattenBST(root->right);
       if(head != NULL)
       {
       Node *temp = head;
       while(temp && temp->right){
           temp = temp->right;
       }
       
       temp->right = root;
       
       }
       else
       {
           head = root;
       }
       return head;
    }
};