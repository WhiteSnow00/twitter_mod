import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ja4 implements ebp
{
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;
    
    public ja4(final int[] b, final long[] c, final long[] d, final long[] e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        final int length = b.length;
        this.a = length;
        if (length > 0) {
            this.f = d[length - 1] + e[length - 1];
        }
        else {
            this.f = 0L;
        }
    }
    
    public final ebp$a d(final long n) {
        int f = imw.f(this.e, n, true);
        final long[] e = this.e;
        final long n2 = e[f];
        final long[] c = this.c;
        final gbp gbp = new gbp(n2, c[f]);
        if (n2 < n && f != this.a - 1) {
            ++f;
            return new ebp$a(gbp, new gbp(e[f], c[f]));
        }
        return new ebp$a(gbp, gbp);
    }
    
    public final boolean f() {
        return true;
    }
    
    public final long h() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String string = Arrays.toString(this.b);
        final String string2 = Arrays.toString(this.c);
        final String string3 = Arrays.toString(this.e);
        final String string4 = Arrays.toString(this.d);
        final StringBuilder sb = new StringBuilder(dia.o(string4, dia.o(string3, dia.o(string2, dia.o(string, 71)))));
        sb.append("ChunkIndex(length=");
        sb.append(a);
        sb.append(", sizes=");
        sb.append(string);
        mag.m(sb, ", offsets=", string2, ", timeUs=", string3);
        return xa0.B(sb, ", durationsUs=", string4, ")");
    }
}
