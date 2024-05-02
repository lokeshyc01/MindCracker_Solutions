public class Solution{

public:
    Node* flattenBST(Node *root){
        
        if(root == NULL){
            return NULL;
        }

        if(Head != NULL){
            Node * Head = flattenBST(root->left);
            root->right = flattenBST(root->right);

        Node * temp = Head;

        while(temp && temp->next){
            temp = temp->next;
        } 

        temp->right = root;
        root->left = temp;
        }
        else{
            Head = root;
        }


        return Head;
    }




}