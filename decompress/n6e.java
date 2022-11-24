import java.util.NoSuchElementException;
import java.util.ArrayDeque;
import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Deque;
import java.util.Objects;
import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n6e
{
    public static <T> boolean a(final Collection<T> collection, final Iterator<? extends T> iterator) {
        Objects.requireNonNull(iterator);
        boolean b = false;
        while (iterator.hasNext()) {
            b |= collection.add(iterator.next());
        }
        return b;
    }
    
    public static final class a<T> extends ac<T>
    {
        public static final ac J0;
        public final T[] H0;
        public final int I0;
        
        static {
            a.J0 = new a(new Object[0]);
        }
        
        public a(final T[] p0, final int p1, final int p2, final int p3) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: iconst_0       
            //     2: iconst_0       
            //     3: invokespecial   ac.<init>:(II)V
            //     6: aload_0        
            //     7: aload_1        
            //     8: putfield        n6e$a.H0:[Ljava/lang/Object;
            //    11: aload_0        
            //    12: iconst_0       
            //    13: putfield        n6e$a.I0:I
            //    16: return         
            //    Signature:
            //  ([TT;III)V
            // 
            // The error that occurred was:
            // 
            // java.lang.ArrayIndexOutOfBoundsException: 2
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2016)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public final T a(final int n) {
            return this.H0[this.I0 + n];
        }
    }
    
    public static final class b<T> implements Iterator<T>, j$.util.Iterator
    {
        public Iterator<? extends T> F0;
        public Iterator<? extends T> G0;
        public Iterator<? extends Iterator<? extends T>> H0;
        public Deque<Iterator<? extends Iterator<? extends T>>> I0;
        
        public b(final Iterator<? extends Iterator<? extends T>> h0) {
            this.G0 = (Iterator<? extends T>)a.J0;
            this.H0 = h0;
        }
        
        public final void forEachRemaining(final Consumer consumer) {
            Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
        }
        
        @Override
        public final void forEachRemaining(final java.util.function.Consumer consumer) {
            Iterator$_CC.$default$forEachRemaining((Iterator)this, Consumer$VivifiedWrapper.convert(consumer));
        }
        
        @Override
        public final boolean hasNext() {
            while (true) {
                final Iterator<? extends T> g0 = this.G0;
                Objects.requireNonNull(g0);
                if (g0.hasNext()) {
                    return true;
                }
                Iterator<? extends Iterator<? extends T>> h2;
                while (true) {
                    final Iterator<? extends Iterator<? extends T>> h0 = this.H0;
                    if (h0 != null && h0.hasNext()) {
                        h2 = this.H0;
                        break;
                    }
                    final ArrayDeque i0 = this.I0;
                    if (i0 == null || i0.isEmpty()) {
                        h2 = null;
                        break;
                    }
                    this.H0 = this.I0.removeFirst();
                }
                this.H0 = h2;
                if (h2 == null) {
                    return false;
                }
                final Iterator g2 = (Iterator)h2.next();
                this.G0 = g2;
                if (!(g2 instanceof b)) {
                    continue;
                }
                final b b = (b)g2;
                this.G0 = b.G0;
                if (this.I0 == null) {
                    this.I0 = new ArrayDeque();
                }
                this.I0.addFirst(this.H0);
                if (b.I0 != null) {
                    while (!b.I0.isEmpty()) {
                        this.I0.addFirst(b.I0.removeLast());
                    }
                }
                this.H0 = b.H0;
            }
        }
        
        @Override
        public final T next() {
            if (this.hasNext()) {
                final Iterator<? extends T> g0 = this.G0;
                this.F0 = g0;
                return (T)g0.next();
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public final void remove() {
            final Iterator<? extends T> f0 = this.F0;
            if (f0 != null) {
                f0.remove();
                this.F0 = null;
                return;
            }
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }
    
    public enum c implements Iterator<Object>, j$.util.Iterator
    {
        F0;
        
        public static final c[] G0;
        
        public final void forEachRemaining(final Consumer consumer) {
            Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
        }
        
        @Override
        public final void forEachRemaining(final java.util.function.Consumer consumer) {
            Iterator$_CC.$default$forEachRemaining((Iterator)this, Consumer$VivifiedWrapper.convert(consumer));
        }
        
        @Override
        public final boolean hasNext() {
            return false;
        }
        
        @Override
        public final Object next() {
            throw new NoSuchElementException();
        }
        
        @Override
        public final void remove() {
            v7q.i(false);
        }
    }
}
