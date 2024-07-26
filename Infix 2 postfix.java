
    public static String infixtopost(String n){
        
        StringBuilder postfix = new StringBuilder();
        Stack <Character> stack = new Stack<>();
        
        for(int i =0;i<n.length();i++){
            char a = n.charAt(i);
            
            if (Character.isLetterOrDigit(a)){
                postfix.append(a);
            }
            else if(a == '('){
                stack.push(a);
            }
            else if(a==')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    postfix.append(stack.pop());
                }
                stack.pop();
            }else{
                while(!stack.isEmpty() && stack.peek() != '(' && check(stack.peek(),a)){
                    postfix.append(stack.pop());
                }
                stack.push(a);
            }
        }
        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }
        return postfix.toString();
            
    }
    
