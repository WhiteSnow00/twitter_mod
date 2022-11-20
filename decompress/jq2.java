import java.util.LinkedList;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jq2<T>
{
    public final SparseArray<a<T>> a;
    public a<T> b;
    public a<T> c;
    
    public jq2() {
        this.a = (SparseArray<a<T>>)new SparseArray();
    }
    
    public final void a(final a<T> a) {
        if (this.b == a) {
            return;
        }
        this.b(a);
        final a<T> b = this.b;
        if (b == null) {
            this.b = a;
            this.c = a;
            return;
        }
        a.d = b;
        b.a = a;
        this.b = a;
    }
    
    public final void b(final a<T> a) {
        synchronized (this) {
            final a<T> a2 = a.a;
            final a<T> d = a.d;
            if (a2 != null) {
                a2.d = d;
            }
            if (d != null) {
                d.a = a2;
            }
            a.a = null;
            a.d = null;
            if (a == this.b) {
                this.b = d;
            }
            if (a == this.c) {
                this.c = a2;
            }
        }
    }
    
    public static final class a<I>
    {
        public a<I> a;
        public int b;
        public LinkedList<I> c;
        public a<I> d;
        
        public a(final int b, final LinkedList c) {
            this.a = null;
            this.b = b;
            this.c = c;
            this.d = null;
        }
        
        @Override
        public final String toString() {
            return wc0.A(fu8.j("LinkedEntry(key: "), this.b, ")");
        }
    }
}
