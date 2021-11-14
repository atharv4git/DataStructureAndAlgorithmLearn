#include <iostream>
 
using namespace std;
 
//Declare Node
struct Node{
    int num;
    Node *next;
};
 
//Declare starting (Head) node
struct Node *head=NULL;
 
//Insert node at start
void insertNode(int n){
    struct Node *newNode=new Node;
    newNode->num=n;
    newNode->next=head;
    head=newNode;
}
 
//Traverse/ display all nodes (print items)
void display(){
    if(head==NULL){
        cout<<"List is empty!"<<endl;
        return;
    }
    struct Node *temp=head;
    while(temp!=NULL){
        cout<<temp->num<<" ";
        temp=temp->next;
    }
    cout<<endl;
}
 
//delete node from start
void deleteItem(){
    if(head==NULL){
        cout<<"List is empty!"<<endl;
        return;
    }
    cout<<head->num<<" is removed."<<endl;
    head=head->next;
}
int main(){
    cout<<"<---- Singly Linked List ----->" <<endl; 
    display();
    insertNode(121);
    cout<<"<-- Linked List after inserting a first node --->" <<endl;
    display();
    insertNode(122);
    cout<<"<-- Linked List after inserting a second node --->" <<endl;
    display();
    insertNode(123);
    cout<<"<-- Linked List after inserting a third node --->" <<endl;
    display();
    cout<<"<-- Deleting the node one by one from third node to first --->" <<endl;
    deleteItem(); 
    deleteItem(); 
    deleteItem(); 
    display();
    return 0;
}