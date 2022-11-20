import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmt
{
    public final jwd a;
    public final int b;
    public final String c;
    public final String d;
    
    public fmt(final fmt.fmt$a fmt$a) {
        final jwd a = fmt$a.a;
        jee.l((Object)a);
        this.a = a;
        this.b = fmt$a.b;
        this.c = fmt$a.c;
        this.d = fmt$a.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof fmt;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final int a = c5j.a;
        final fmt fmt = (fmt)o;
        boolean b3 = b2;
        if (c5j.a((Object)this.a, (Object)fmt.a)) {
            b3 = b2;
            if (this.b == fmt.b) {
                final String c = this.c;
                final String c2 = fmt.c;
                final Pattern a2 = ikr.a;
                b3 = b2;
                if (czd.a((Object)c, (Object)c2)) {
                    b3 = b2;
                    if (czd.a((Object)this.d, (Object)fmt.d)) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return c5j.i((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d);
    }
}
