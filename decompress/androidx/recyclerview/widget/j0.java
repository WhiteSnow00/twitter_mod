// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import java.lang.reflect.Array;
import java.util.Objects;

public class j0<T>
{
    public T[] a;
    public j0.j0$a b;
    public int c;
    public final Class<T> d;
    
    public j0(final Class<T> p0, final j0.j0$a<T> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: ldc             Lrix;.class
        //     7: putfield        androidx/recyclerview/widget/j0.d:Ljava/lang/Class;
        //    10: aload_0        
        //    11: ldc             Lrix;.class
        //    13: bipush          10
        //    15: invokestatic    java/lang/reflect/Array.newInstance:(Ljava/lang/Class;I)Ljava/lang/Object;
        //    18: checkcast       [Ljava/lang/Object;
        //    21: putfield        androidx/recyclerview/widget/j0.a:[Ljava/lang/Object;
        //    24: aload_0        
        //    25: aload_1        
        //    26: putfield        androidx/recyclerview/widget/j0.b:Landroidx/recyclerview/widget/j0$a;
        //    29: aload_0        
        //    30: iconst_0       
        //    31: putfield        androidx/recyclerview/widget/j0.c:I
        //    34: return         
        //    Signature:
        //  (Ljava/lang/Class<TT;>;Landroidx/recyclerview/widget/j0$a<TT;>;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 2
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    public final int a(final T t) {
        return this.b(t, true);
    }
    
    public final int b(final T t, final boolean b) {
        final int c = this.c((Object)t, (Object[])this.a, this.c, 1);
        int n;
        if (c == -1) {
            n = 0;
        }
        else if ((n = c) < this.c) {
            final T t2 = this.a[c];
            n = c;
            if (this.b.f((Object)t2, (Object)t)) {
                if (this.b.e((Object)t2, (Object)t)) {
                    this.a[c] = t;
                    return c;
                }
                this.a[c] = t;
                final j0.j0$a b2 = this.b;
                Objects.requireNonNull(b2);
                b2.c(c, 1, (Object)null);
                return c;
            }
        }
        final int c2 = this.c;
        if (n <= c2) {
            final T[] a = this.a;
            if (c2 == a.length) {
                final Object[] a2 = (Object[])Array.newInstance(this.d, a.length + 10);
                System.arraycopy(this.a, 0, a2, 0, n);
                a2[n] = t;
                System.arraycopy(this.a, n, a2, n + 1, this.c - n);
                this.a = (T[])a2;
            }
            else {
                System.arraycopy(a, n, a, n + 1, c2 - n);
                this.a[n] = t;
            }
            ++this.c;
            if (b) {
                ((k0)this.b).a(n, 1);
            }
            return n;
        }
        final StringBuilder l = da8.l("cannot add item to ", n, " because size is ");
        l.append(this.c);
        throw new IndexOutOfBoundsException(l.toString());
    }
    
    public final int c(final T t, final T[] array, int i, final int n, int n2) {
        n2 = 0;
        int n3 = i;
        i = n2;
    Label_0195_Outer:
        while (i < n3) {
            n2 = (i + n3) / 2;
            final T t2 = array[n2];
            final int compare = this.b.compare((Object)t2, (Object)t);
            if (compare < 0) {
                i = n2 + 1;
            }
            else if (compare == 0) {
                if (this.b.f((Object)t2, (Object)t)) {
                    return n2;
                }
                int j = n2 - 1;
            Label_0195:
                while (true) {
                    while (j >= i) {
                        final T t3 = this.a[j];
                        if (this.b.compare((Object)t3, (Object)t) != 0) {
                            break;
                        }
                        if (this.b.f((Object)t3, (Object)t)) {
                            i = j;
                            if (n == 1) {
                                if (i != -1) {
                                    n2 = i;
                                }
                                return n2;
                            }
                            return i;
                        }
                        else {
                            --j;
                        }
                    }
                    i = n2;
                    T t4;
                    int n4;
                    do {
                        n4 = i + 1;
                        if (n4 < n3) {
                            t4 = this.a[n4];
                            if (this.b.compare((Object)t4, (Object)t) == 0) {
                                i = n4;
                                continue Label_0195_Outer;
                            }
                        }
                        i = -1;
                        continue Label_0195;
                    } while (!this.b.f((Object)t4, (Object)t));
                    i = n4;
                    continue Label_0195;
                }
            }
            else {
                n3 = n2;
            }
        }
        if (n != 1) {
            i = -1;
        }
        return i;
    }
    
    public final T d(final int n) throws IndexOutOfBoundsException {
        if (n < this.c && n >= 0) {
            return this.a[n];
        }
        final StringBuilder l = da8.l("Asked to get item at ", n, " but size is ");
        l.append(this.c);
        throw new IndexOutOfBoundsException(l.toString());
    }
    
    public final boolean e(final T t) {
        final int c = this.c((Object)t, (Object[])this.a, this.c, 2);
        boolean b = true;
        if (c == -1) {
            b = false;
        }
        else {
            this.f(c, true);
        }
        return b;
    }
    
    public final void f(final int n, final boolean b) {
        final T[] a = this.a;
        System.arraycopy(a, n + 1, a, n, this.c - n - 1);
        final int c = this.c - 1;
        this.c = c;
        this.a[c] = null;
        if (b) {
            ((k0)this.b).b(n, 1);
        }
    }
    
    public final void g(final int n, final T t) {
        final T d = this.d(n);
        final boolean b = d == t || !this.b.e((Object)d, (Object)t);
        if (d != t && this.b.compare((Object)d, (Object)t) == 0) {
            this.a[n] = t;
            if (b) {
                final j0.j0$a b2 = this.b;
                Objects.requireNonNull(b2);
                b2.c(n, 1, (Object)null);
            }
            return;
        }
        if (b) {
            final j0.j0$a b3 = this.b;
            Objects.requireNonNull(b3);
            b3.c(n, 1, (Object)null);
        }
        this.f(n, false);
        final int b4 = this.b(t, false);
        if (n != b4) {
            ((k0)this.b).D0.j(n, b4);
        }
    }
}
