class sam
{
class Node {
    int data;
    Node left, right;
    int height;

    public Node(int val) {
        data = val ;
        height = 0;
        left = null;
        right = null;
    }
}

    public Node create(int data) {
        return new Node(data);
    }

    public Node insert(Node root, int data) {
        if (root == null) {
            return create(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        } else {
            return root;
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int balance = Balance(root);

        if (balance > 1 && data < root.left.data) {
            return rightRotate(root);
        }

        if (balance < -1 && data > root.right.data) {
            return leftRotate(root);
        }

        if (balance > 1 && data > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && data < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public Node leftRotate(Node z) {
        Node y = z.right;
        Node T2 = y.left;

        y.left = z;
        z.right = T2;

        z.height = 1 + Math.max(height(z.left), height(z.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        return y;
    }

    public Node rightRotate(Node z) {
        Node y = z.left;
        Node T3 = y.right;

        y.right = z;
        z.left = T3;

        z.height = 1 + Math.max(height(z.left), height(z.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        return y;
    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    public int Balance(Node root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    public void display(Node root) {
        if (root != null) {
            display(root.left);
            if(root.left.left==null&&root.left!=null){
            System.out.print(root.left.data + " ");
            System.out.print(root.data + " ");}
            display(root.right);
            if(root.right.right==null&&root.right!=null){
            System.out.print(root.root.data + " ");
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        sam t1 = new sam();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Node root = t1.create(k);
        
        while(true){
            int m = sc.nextInt();
            if(m == -1){
                break;
            }
            root = t1.insert(root,m);
        }
        t1.display(root);
    }
}
