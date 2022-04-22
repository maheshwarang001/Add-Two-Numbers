class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dumy = new ListNode(0);
        ListNode temp = dumy;
        
        int carry = 0;
        
        while(l1 != null || l2 != null)
        {
            
            int l1_val = (l1 != null) ? l1.val :0;
            int l2_val = (l2 != null) ? l2.val :0;
            
            int sum = l1_val + l2_val + carry;
            carry = sum/10;
            int last_digit = sum % 10;
            
            ListNode newnode = new ListNode(last_digit);
            temp.next = newnode;
            
            if(l1 != null) l1 = l1.next;
            if(l2 !=null) l2 = l2.next;
            temp = temp.next;
        }
        
        if(carry>0){
            ListNode addnode = new ListNode(carry);
            temp.next = addnode;
            temp = temp.next;
            
        }
        return dumy.next;
    }
}
