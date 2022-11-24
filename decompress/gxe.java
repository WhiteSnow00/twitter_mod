// 
// Decompiled by Procyon v0.6.0
// 

public final class gxe implements umr$a
{
    public final exe a;
    public final Object b;
    
    public gxe(final exe a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a() {
        final swe swe = this.a.h.get(this.b);
        int size;
        if (swe != null) {
            size = swe.s().size();
        }
        else {
            size = 0;
        }
        return size;
    }
    
    public final void b(final int n, final long n2) {
        final swe swe = this.a.h.get(this.b);
        if (swe != null && swe.H()) {
            final int size = swe.s().size();
            if (n < 0 || n >= size) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Index (");
                sb.append(n);
                sb.append(") is out of bound of [0, ");
                sb.append(size);
                sb.append(')');
                throw new IndexOutOfBoundsException(sb.toString());
            }
            if (!(swe.X0 ^ true)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            final swe a = this.a.a;
            a.O0 = true;
            jty.V(swe).q((swe)swe.s().get(n), n2);
            a.O0 = false;
        }
    }
    
    public final void dispose() {
        this.a.c();
        final swe swe = (swe)this.a.h.remove(this.b);
        if (swe != null) {
            final exe a = this.a;
            final int k = a.k;
            final int n = 0;
            if (k <= 0) {
                throw new IllegalStateException("Check failed.".toString());
            }
            final int index = a.a.t().indexOf(swe);
            final int size = this.a.a.t().size();
            final exe a2 = this.a;
            final int i = a2.k;
            int n2 = n;
            if (index >= size - i) {
                n2 = 1;
            }
            if (n2 == 0) {
                throw new IllegalStateException("Check failed.".toString());
            }
            ++a2.j;
            a2.k = i - 1;
            final int size2 = a2.a.t().size();
            final exe a3 = this.a;
            final int n3 = size2 - a3.k - a3.j;
            a3.d(index, n3, 1);
            this.a.a(n3);
        }
    }
}
