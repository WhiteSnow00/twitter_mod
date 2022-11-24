import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ynt
{
    public static final nmp<ynt> d;
    public final long a;
    public final String b;
    public final String c;
    
    static {
        ynt.d = new ynt.ynt$b();
    }
    
    public ynt(final ynt.ynt$a ynt$a) {
        this.a = ynt$a.a;
        final String b = ynt$a.b;
        vmw.g((Object)b);
        this.b = b;
        final String c = ynt$a.c;
        vmw.g((Object)c);
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof ynt;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final int a = o5j.a;
        final ynt ynt = (ynt)o;
        boolean b3 = b2;
        if (o5j.a((Object)this.a, (Object)ynt.a)) {
            final String b4 = this.b;
            final String b5 = ynt.b;
            final Pattern a2 = flr.a;
            b3 = b2;
            if (e0e.a((Object)b4, (Object)b5)) {
                b3 = b2;
                if (e0e.a((Object)this.c, (Object)ynt.c)) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return o5j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
}
