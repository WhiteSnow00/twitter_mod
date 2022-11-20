import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xrs
{
    @d5d
    public final String a;
    public final List<tws> b;
    public final wrm c;
    public final wzs d;
    
    public xrs(final xrs.xrs$a xrs$a) {
        String a;
        if ((a = xrs$a.a) == null) {
            a = "no-timeline-id";
        }
        this.a = a;
        this.b = rif.x(xrs$a.b);
        final wrm c = xrs$a.c;
        final wrm c2 = wrm.c;
        wrm c3;
        if ((c3 = c) == null) {
            c3 = c2;
        }
        this.c = c3;
        this.d = xrs$a.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && xrs.class == o.getClass()) {
            final xrs xrs = (xrs)o;
            if (!c5j.a((Object)this.b, (Object)xrs.b) || !c5j.a((Object)this.c, (Object)xrs.c) || !c5j.a((Object)this.d, (Object)xrs.d)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.h((Object)this.b, (Object)this.c, (Object)this.d);
    }
}
