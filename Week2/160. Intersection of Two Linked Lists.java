// nice approach using difference of length
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0;
        int len2 = 0;
        
        ListNode tempA = headA;
        ListNode tempB = headB;
        
        while(tempA != null)
        {
            len1++;
            tempA = tempA.next;
        }

        while(tempB != null)
        {
            len2++;
            tempB = tempB.next;
        }
        
        // to make both pointers at same pos of their LL
        while(len2 > len1)
        {
            headB = headB.next;
            len2--;
        }
        
        while(len1 > len2)
        {
            headA = headA.next;
            len1--;
        }
        
        ListNode startA = headA;
        ListNode startB = headB;
        
        while(startA != null)
        {
            if(startA == startB)
                return startA;
            startA = startA.next;
            startB = startB.next;
        }
        
        return null;
    }
}

// Using hashmap

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        Map<ListNode,Integer> mp = new HashMap<>();
        while(tempA != null)
        {
            mp.put(tempA,tempA.val);
            tempA = tempA.next;
        }
        
        ListNode tempB = headB;
        while(tempB != null)
        {
            if(mp.containsKey(tempB))
                return tempB;
            tempB = tempB.next;
        }
        return null;
    }
}