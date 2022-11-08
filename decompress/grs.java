import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grs
{
    @y5d
    public final String a;
    public final List<ews> b;
    public final frm c;
    public final gzs d;
    
    public grs(final a a) {
        String a2;
        if ((a2 = a.a) == null) {
            a2 = "no-timeline-id";
        }
        this.a = a2;
        this.b = ijf.x((List)a.b);
        final frm c = a.c;
        final frm c2 = frm.c;
        frm c3;
        if ((c3 = c) == null) {
            c3 = c2;
        }
        this.c = c3;
        this.d = a.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && grs.class == o.getClass()) {
            final grs grs = (grs)o;
            if (!w4j.a((Object)this.b, (Object)grs.b) || !w4j.a((Object)this.c, (Object)grs.c) || !w4j.a((Object)this.d, (Object)grs.d)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.h((Object)this.b, (Object)this.c, (Object)this.d);
    }
    
    public static final class a extends h4j<grs>
    {
        public String a;
        public List<ews> b;
        public frm c;
        public gzs d;
        
        public final Object i() {
            return new grs(this);
        }
        
        public final boolean l() {
            return this.b != null;
        }
    }
}
