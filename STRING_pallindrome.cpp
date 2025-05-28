#include<iostream>
using namespace std;
int main(){
    string str="ama";
    string res=str;
    int start=0;
    int last=str.length()-1;
    while(start<last){
        char temp=str[start];
        str[start]=str[last];
        str[last]=temp;
        start++;
        last--;
    }
    if(res==str){
        cout<<"pallin";
    }
    else{
        cout<<"not";
    }

   
    
}