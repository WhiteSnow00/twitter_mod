import java.io.IOException;
import java.util.ArrayDeque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nh8 implements rq9
{
    public final byte[] a;
    public final ArrayDeque<nh8.nh8$a> b;
    public final vpw c;
    public qq9 d;
    public int e;
    public int f;
    public long g;
    
    public nh8() {
        this.a = new byte[8];
        this.b = new ArrayDeque<nh8.nh8$a>();
        this.c = new vpw();
    }
    
    public final long a(final roa roa, final int n) throws IOException {
        final byte[] a = this.a;
        int i = 0;
        roa.readFully(a, 0, n);
        long n2 = 0L;
        while (i < n) {
            n2 = (n2 << 8 | (long)(this.a[i] & 0xFF));
            ++i;
        }
        return n2;
    }
}
