import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t51
{
    public static final rlp<t51> f;
    public final long a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    
    static {
        t51.f = new t51.t51$a();
    }
    
    public t51(final long a, final boolean b, final String c, final String d, final String e) {
        UserIdentifier.fromId(this.a = a);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static t51 a(final cgv cgv) {
        return new t51(cgv.D0, cgv.N0 || (cgv.h() != null && cgv.h()), cgv.c(), cgv.K0, cgv.E0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && t51.class == o.getClass()) {
            if (this.a != ((t51)o).a) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.d(this.a);
    }
}
