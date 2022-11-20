import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u89
{
    public static final rlp<u89> d;
    public final UserIdentifier a;
    public final String b;
    public final String c;
    
    static {
        u89.d = new u89.u89$b();
    }
    
    public u89(final u89.u89$a u89$a) {
        final UserIdentifier a = u89$a.a;
        jee.l((Object)a);
        this.a = a;
        this.c = u89$a.c;
        final String b = u89$a.b;
        jee.l((Object)b);
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && u89.class == o.getClass()) {
            final u89 u89 = (u89)o;
            if (!c5j.a((Object)this.a, (Object)u89.a) || !c5j.a((Object)this.b, (Object)u89.b) || !c5j.a((Object)this.c, (Object)u89.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
}
