import java.util.*;

public class Tree {
    public static class Index {
        int idx = -1;
    }

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        // public static int idx = -1;
        public static Node Buildtree(int nodes[], Index index) {
            index.idx++;
            if (nodes[index.idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index.idx]);
            newNode.left = Buildtree(nodes, index);
            newNode.right = Buildtree(nodes, index);
            return newNode;
        }

        public static void Preorder(Node root) {
            if (root == null) {
                // System.out.print("-1 ");
                return;
            }
            System.out.print(root.data + " ");
            Preorder(root.left);
            Preorder(root.right);
        }

        public static void Inorder(Node root) {
            if (root == null) {
                return;
            }
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);
        }

        public static void Postorder(Node root) {
            if (root == null) {
                return;
            }
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void Levelorder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }

                }
            }
        }

        public static int treeHeight(Node root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = treeHeight(root.left);
            int rightHeight = treeHeight(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }

        public static int CountNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftCount = CountNodes(root.left);
            int rightCount = CountNodes(root.right);
            return leftCount + rightCount + 1;
        }

        public static int SumNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSum = SumNodes(root.left);
            int rightSum = SumNodes(root.right);
            return leftSum + rightSum + root.data;
        }

        public static int Diameter(Node root) {
            if (root == null) {
                return 0;
            }
            int leftDiameter = Diameter(root.left);
            int leftHeight = treeHeight(root.left);
            int rightDiameter = Diameter(root.right);
            int rightHeight = treeHeight(root.right);
            int selfDiameter = leftHeight + rightHeight + 1;

            return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
        }

        public static boolean isIdentical(Node root, Node subroot) {
            if (root == null && subroot == null) {
                return true;
            } else if (root == null || subroot == null || root.data != subroot.data) {
                return false;
            }
            if (!isIdentical(root.left, subroot.left)) {
                return false;
            }
            if (!isIdentical(root.right, subroot.right)) {
                return false;
            }
            return true;
        }

        public static boolean isSubTree(Node root, Node subroot) {
            if (root == null) {
                return false;
            }
            if (root.data == subroot.data) {
                if (isIdentical(root, subroot)) {
                    return true;
                }
            }
            return isSubTree(root.left, subroot) || isSubTree(root.right, subroot);
        }

        public static class Info {
            Node node;
            int hd;

            public Info(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public static void TopView(Node root) {
            Queue<Info> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();

            int min = 0, max = 0;
            q.add(new Info(root, 0));
            q.add(null);

            while (!q.isEmpty()) {
                Info curr = q.remove();
                if (curr == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    if (!map.containsKey(curr.hd)) {
                        map.put(curr.hd, curr.node);
                    }
                    if (curr.node.left != null) {
                        q.add(new Info(curr.node.left, curr.hd - 1));
                        min = Math.min(min, curr.hd - 1);
                    }
                    if (curr.node.right != null) {
                        q.add(new Info(curr.node.right, curr.hd + 1));
                        max = Math.max(max, curr.hd + 1);
                    }
                }
            }
            for (int i = min; i <= max; i++) {
                System.out.println(map.get(i).data + " ");
            }
        }

        public static void Klevel(Node root, int level, int k) {
            if (root == null) {
                return;
            }
            if (level == k) {
                System.out.print(root.data + " ");
                return;
            }
            Klevel(root.left, level + 1, k);
            Klevel(root.right, level + 1, k);
        }

        public static boolean getPath(Node root, int n, ArrayList<Node> path) {
            if (root == null) {
                return false;
            }
            path.add(root);
            if (root.data == n) {
                return true;
            }
            boolean foundLeft = getPath(root.left, n, path);
            boolean foundRight = getPath(root.right, n, path);

            if (foundLeft || foundRight) {
                return true;
            }
            path.remove(path.size() - 1);
            return false;
        }

        public static Node lca(Node root, int n1, int n2) {
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            int i = 0;
            for (; i < path1.size() && i < path2.size(); i++) {
                if (path1.get(i) != path2.get(i)) {
                    break;
                }
            }
            Node lca = path1.get(i - 1);
            return lca;
        }

        public static Node lca2(Node root, int n1, int n2) {
            if (root == null || root.data == n1 || root.data == n2) {
                return root;
            }
            Node leftLca = lca2(root.left, n1, n2);
            Node rightLca = lca2(root.right, n1, n2);

            if (leftLca == null) {
                return rightLca;
            }
            if (rightLca == null) {
                return leftLca;
            }
            return root;
        }

        public static int lcaDist(Node root, int n) {
            if (root == null) {
                return -1;
            }
            if (root.data == n) {
                return 0;
            }

            int leftDist = lcaDist(root.left, n);
            int rightDist = lcaDist(root.right, n);

            if (leftDist == -1 && rightDist == -1) {
                return -1;
            } else if (leftDist == -1) {
                return rightDist + 1;
            } else {
                return leftDist + 1;
            }
        }

        public static int minDist(Node root, int n1, int n2) {
            Node lca = lca2(root, n1, n2);
            int dist1 = lcaDist(lca, n1);
            int dist2 = lcaDist(lca, n2);

            return dist1 + dist2;
        }

        public static int KAncestor(Node root, int n, int k) {
            if (root == null) {
                return -1;
            }
            if (root.data == n) {
                return 0;
            }
            int leftdist = KAncestor(root.left, n, k);
            int rightdist = KAncestor(root.right, n, k);

            if (leftdist == -1 && rightdist == -1) {
                return -1;
            }
            int max = Math.max(leftdist, rightdist);
            if (max + 1 == k) {
                System.out.println(root.data);
            }
            return max + 1;
        }

        public static int transform(Node root) {
            if (root == null) {
                return 0;
            }

            int leftChild = transform(root.left);
            int rightChild = transform(root.right);

            int data = root.data;

            int newleft = root.left == null ? 0 : root.left.data;
            int newright = root.right == null ? 0 : root.right.data;

            root.data = newleft + leftChild + newright + rightChild;

            return data;
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, 7, -1, -1, 8, -1, -1 };
        // int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        int subNodes[] = { 6, 7, -1, -1, 8, -1, -1 };
        Index mainIdx = new Index();
        Index subIdx = new Index();
        BinaryTree tree = new BinaryTree();
        Node root = tree.Buildtree(nodes, mainIdx);
        BinaryTree subtree = new BinaryTree();
        Node subroot = subtree.Buildtree(subNodes, subIdx);
        // System.out.print("Preorder of Tree is: ");
        // tree.Preorder(root);
        // System.out.print("\nInorder of Tree is: ");
        // tree.Inorder(root);
        // System.out.print("\nPostorder of tree is: ");
        // tree.Postorder(root);
        // System.out.print("\nHeight of Tree is : "+ tree.treeHeight(root));
        // System.out.print("\nNo of Nodes in a Tree is: "+ tree.CountNodes(root));
        // System.out.print("\nSum of the Nodes data of Tree: "+tree.SumNodes(root));
        // System.out.print("\nDiameter of the Tree is: "+ tree.Diameter(root));
        // System.out.println("\nLevel Order is: ");
        // tree.Levelorder(root);
        // System.out.println(subtree.isSubTree(root,subroot));
        // tree.TopView(root);
        // tree.Klevel(root, 1, 3);
        // System.out.println(tree.lca(root, 4, 5).data);
        // System.out.println(tree.lca2(root, 4, 5).data);
        // System.out.println(tree.minDist(root, 4, 6));
        // tree.KAncestor(root, 7, 2);
        // tree.transform(root);
        // tree.Preorder(root);
    }
}