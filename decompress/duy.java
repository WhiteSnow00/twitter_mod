import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public class duy
{
    public final int a;
    public int b;
    public Object c;
    
    public duy() {
        this.a = 2;
        synchronized (ws3.a) {
            final ks0 b = ws3.b;
            final boolean empty = b.isEmpty();
            final char[] array = null;
            Object removeLast;
            if (empty) {
                removeLast = null;
            }
            else {
                removeLast = b.removeLast();
            }
            final char[] array2 = (char[])removeLast;
            char[] array3 = array;
            if (array2 != null) {
                ws3.c -= array2.length;
                array3 = array2;
            }
            monitorexit(ws3.a);
            char[] array4;
            if ((array4 = array3) == null) {
                array4 = new char[128];
            }
            this(array4);
        }
    }
    
    public duy(final int b, final String c) {
        this.a = 0;
        this.b = b;
        this.c = c;
    }
    
    public duy(final char[] c) {
        this.a = 2;
        this.c = c;
    }
    
    public final void a(final long n) {
        this.b(String.valueOf(n));
    }
    
    public final void b(final String s) {
        czd.f((Object)s, "string");
        final int length = s.length();
        this.c(length);
        s.getChars(0, s.length(), (char[])this.c, this.b);
        this.b += length;
    }
    
    public final void c(final int n) {
        this.d(this.b, n);
    }
    
    public final int d(final int n, int n2) {
        final int n3 = n2 + n;
        final Object c = this.c;
        if (((char[])c).length <= n3) {
            final char[] array = (char[])c;
            final int n4 = n * 2;
            if ((n2 = n3) < n4) {
                n2 = n4;
            }
            final char[] copy = Arrays.copyOf(array, n2);
            czd.e((Object)copy, "copyOf(this, newSize)");
            this.c = copy;
        }
        return n;
    }
    
    public final void e() {
        final ws3 a = ws3.a;
        final char[] array = (char[])this.c;
        czd.f((Object)array, "array");
        synchronized (a) {
            final int c = ws3.c;
            if (array.length + c < ws3.d) {
                ws3.c = c + array.length;
                ws3.b.addLast((Object)array);
            }
        }
    }
    
    @Override
    public final String toString() {
        switch (this.a) {
            default: {
                return super.toString();
            }
            case 2: {
                return new String((char[])this.c, 0, this.b);
            }
        }
    }
}
