SinglyLinkedListNode* reverse(SinglyLinkedListNode* llist) {
    SinglyLinkedListNode *n1 = llist;
    SinglyLinkedListNode *n2 = llist->next;
    SinglyLinkedListNode *prev = NULL;
    
    while (n2 != NULL) {
        SinglyLinkedListNode *n3 = n2->next;
        n1->next = prev;
        prev = n1;
        n2->next = n1;
        n1 = n2;
        n2 = n3;
    }
    llist = n1;
    return llist;
}