public class Solution{
public:

    Node * flattenLL(Node * root){
        if(root == NULL) return NULL;
        Node * head  = flattenLL(root->next);
        return mergeLL(root,head);
    }

    Node *mergeLL(Node * list1,Node * list2){

        Node * result;
        if(list1->val <= list2->val){
            result = list1;
            result->next = mergeLL(list1->next , list2);
        }
        else{
            result = list2;
            result->next = mergeLL(list2->next,list1);
        }
        return result;
    }


}