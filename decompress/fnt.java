import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fnt
{
    public static final rlp<fnt> d;
    public final long a;
    public final String b;
    public final String c;
    
    static {
        fnt.d = new fnt.fnt$b();
    }
    
    public fnt(final fnt.fnt$a fnt$a) {
        this.a = fnt$a.a;
        final String b = fnt$a.b;
        jee.l((Object)b);
        this.b = b;
        final String c = fnt$a.c;
        jee.l((Object)c);
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof fnt;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final int a = c5j.a;
        final fnt fnt = (fnt)o;
        boolean b3 = b2;
        if (c5j.a((Object)this.a, (Object)fnt.a)) {
            final String b4 = this.b;
            final String b5 = fnt.b;
            final Pattern a2 = ikr.a;
            b3 = b2;
            if (czd.a((Object)b4, (Object)b5)) {
                b3 = b2;
                if (czd.a((Object)this.c, (Object)fnt.c)) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return c5j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
}
