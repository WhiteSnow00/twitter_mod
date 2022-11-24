import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zj9
{
    public long a;
    public final Object b;
    
    public zj9(final UserIdentifier b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    public zj9(final ob0 b) {
        this.a = -1L;
        this.b = b;
    }
    
    public final int a(final long n) {
        int n2 = 0;
        long n3 = 0L;
        long n4;
        int n5;
        do {
            n4 = n3 + ((ob0)this.b).r(n2);
            n5 = ++n2;
            n3 = n4;
        } while (n >= n4);
        return n5 - 1;
    }
    
    public final long b() {
        final long a = this.a;
        if (a != -1L) {
            return a;
        }
        this.a = 0L;
        for (int c = ((ob0)this.b).c(), i = 0; i < c; ++i) {
            this.a += ((ob0)this.b).r(i);
        }
        return this.a;
    }
    
    public final void c(final String k, final String s, final String s2) {
        final fg4 fg4 = new fg4((UserIdentifier)this.b);
        ((o1p)fg4).q(new String[] { "messages:thread", k, s, s2 });
        final long a = this.a;
        final ufv ufv = new ufv();
        ufv.c = 27;
        ufv.a = a;
        ufv.k = k;
        ((o1p)fg4).i((d1p)ufv);
        sbw.b((tlm)fg4);
    }
}
