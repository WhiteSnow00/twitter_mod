// 
// Decompiled by Procyon v0.6.0
// 

public final class kuh<T> implements gzd<T>
{
    public final ivh<gzd$a<T>> a;
    public int b;
    public gzd$a<? extends T> c;
    
    public kuh() {
        this.a = (ivh<gzd$a<T>>)new ivh((Object[])new gzd$a[16]);
    }
    
    public final void a(int h, final int n, final stb<? super gzd$a<? extends T>, vzv> stb) {
        this.c(h);
        this.c(n);
        if (n >= h) {
            h = p4j.h((ivh)this.a, h);
            gzd$a gzd$a;
            for (int i = ((gzd$a)this.a.F0[h]).a; i <= n; i += gzd$a.b, ++h) {
                gzd$a = (gzd$a)this.a.F0[h];
                ((jj8)stb).invoke((Object)gzd$a);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("toIndex (");
        sb.append(n);
        sb.append(") should be not smaller than fromIndex (");
        sb.append(h);
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public final void b(final int n, final T t) {
        if (n < 0) {
            throw new IllegalArgumentException(rk0.B("size should be >=0, but was ", n).toString());
        }
        if (n == 0) {
            return;
        }
        final gzd$a gzd$a = new gzd$a(this.b, n, (Object)t);
        this.b += n;
        this.a.b((Object)gzd$a);
    }
    
    public final void c(final int n) {
        int n2 = 0;
        if (n >= 0) {
            n2 = n2;
            if (n < this.b) {
                n2 = 1;
            }
        }
        if (n2 != 0) {
            return;
        }
        final StringBuilder a = snp.a("Index ", n, ", size ");
        a.append(this.b);
        throw new IndexOutOfBoundsException(a.toString());
    }
    
    public final gzd$a<T> get(int h) {
        this.c(h);
        gzd$a c = this.c;
        if (c != null) {
            final int a = c.a;
            final int b = c.b;
            int n = 0;
            if (h < b + a) {
                n = n;
                if (a <= h) {
                    n = 1;
                }
            }
            if (n != 0) {
                return (gzd$a<T>)c;
            }
        }
        final ivh<gzd$a<T>> a2 = this.a;
        h = p4j.h((ivh)a2, h);
        c = (gzd$a)a2.F0[h];
        this.c = (gzd$a<? extends T>)c;
        return (gzd$a<T>)c;
    }
    
    public final int getSize() {
        return this.b;
    }
}
