
package binarysearchtree;

import java.util.Random;


public class BinarySearchTree {
  
    public BinarySearchTree( ) {
        root = null;
    }
    
 
    public void insert( Comparable x ) {
        root = insert( x, root );
    }
    
  
    public void remove( Comparable x ) {
        root = remove( x, root );
    }
    
    
    public void removeMin( ) {
        root = removeMin( root );
    }
    
   
    public Comparable findMin( ) {
        return elementAt( findMin( root ) );
    }
    
   
    public Comparable findMax( ) {
        return elementAt( findMax( root ) );
    }
    
  
    public Comparable find( Comparable x ) {
        return elementAt( find( x, root ) );
    }
  
    public void makeEmpty( ) {
        root = null;
    }
    
   
    public boolean isEmpty( ) {
        return root == null;
    }
    
  
    private Comparable elementAt( BinaryNode t ) {
        return t == null ? null : t.element;
    }
  
    protected BinaryNode insert( Comparable x, BinaryNode t ) {
        if( t == null )
            t = new BinaryNode( x );
        else if( x.compareTo( t.element ) < 0 )
            t.left = insert( x, t.left );
        else if( x.compareTo( t.element ) > 0 )
            t.right = insert( x, t.right );
        else
            t=null;
        return t;
    }
    
 
    protected BinaryNode remove( Comparable x, BinaryNode t ) {
        if( t == null )
            System.out.println("Çıkarmak istediğiniz eleman ağaçta mevcut değil!");
        if( x.compareTo( t.element ) < 0 )
            t.left = remove( x, t.left );
        else if( x.compareTo( t.element ) > 0 )
            t.right = remove( x, t.right );
        else if( t.left != null && t.right != null ) // Two children
        {
            t.element = findMin( t.right ).element;
            t.right = removeMin( t.right );
        } else
            t = ( t.left != null ) ? t.left : t.right;
        return t;
    }
    
  
    protected BinaryNode removeMin( BinaryNode t ) {
        if( t == null )
            throw new ExceptionInInitializerError("ağaç null!");
        else if( t.left != null ) {
            t.left = removeMin( t.left );
            return t;
        } else
            return t.right;
    }
    
  
    protected BinaryNode findMin( BinaryNode t ) {
        if( t != null )
            while( t.left != null )
                t = t.left;
                System.out.println(t.element);
        return t;
    }
    
  
    private BinaryNode findMax( BinaryNode t ) {
        if( t != null )
            while( t.right != null )
                t = t.right;
                System.out.println(t.element);
        return t;
    }
    
   
    private BinaryNode find( Comparable x, BinaryNode t ) {
        int path=0;
        while( t != null ) {
            if( x.compareTo( t.element ) < 0 ){
                t = t.left;
                path++;
            }
            else if( x.compareTo( t.element ) > 0 ){
                t = t.right;
                path++;
            } else {
                System.out.println("bulundu :"+t.element);
                System.out.println(path+" adımda bulundu.");
                return t;    // Match
            }
        }
        System.out.println("aranılan eleman ağaçta yok!");
        return null;         // Not found
    }
    
    /** The tree root. */
    protected BinaryNode root;
    
    
    // Test program
    public static void main( String [ ] args ) {
        BinarySearchTree t = new BinarySearchTree( );
//        final int NUMS = 4000;
//        final int GAP  =   37;
        int elemanSayisi=1000000;
        
        Random rnd = new Random();
        for (int i=0;i<5000;i++){
            t.insert(rnd.nextInt(elemanSayisi));
            if (t==null){
                i--;
            }
            
        }
        
//        t.findMax();
//        t.findMin();
       
        System.out.println("aranılan eleman :"+t.findMax());
        t.find(t.findMax()); 
        System.out.println("aranılan eleman :"+t.findMin());
        t.find(t.findMin()); 

    }
}



class BinaryNode {
    // Constructors
    BinaryNode( Comparable theElement ) {
        element = theElement;
        left = right = null;
    }
    
    // Friendly data; accessible by other package routines
    Comparable element;      // The data in the node
    BinaryNode left;         // Left child
    BinaryNode right;        // Right child
}


