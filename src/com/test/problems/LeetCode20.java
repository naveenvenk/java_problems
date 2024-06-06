package com.test.problems;

import java.util.Stack;

public class LeetCode20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LeetCode20 leetCode20Class = new LeetCode20();
		leetCode20Class.isValid(null);
	}

	public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else {
                if (st.size() == 0) {
                    return false;
                }
                else {
                    char och = st.peek();
                    if ((och == '(' && ch == ')') || (och == '{' && ch == '}') || (och == '[' && ch == ']')) {
                        st.pop();
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        if (st.size() == 0) {
            return true;
        }
        return false;
    }

}
