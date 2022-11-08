import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bwf
{
    public final qof a;
    public final int b;
    public final String c;
    public final List<dm3> d;
    public final List<hfv> e;
    public final o1g f;
    
    static {
        hx6.b(new pkp[] { new pkp((Class)bwf.class, (alp)new bwf.bwf$b()) });
    }
    
    public bwf(final bwf.bwf$a bwf$a) {
        this.a = bwf$a.a;
        this.b = bwf$a.b;
        this.c = bwf$a.c;
        this.d = bwf$a.d;
        this.e = bwf$a.e;
        this.f = bwf$a.f;
    }
    
    public final boolean a() {
        final Iterator<dm3> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().f != null) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && bwf.class == o.getClass()) {
            final bwf bwf = (bwf)o;
            if (!w4j.a((Object)this.a, (Object)bwf.a) || !w4j.a((Object)this.b, (Object)bwf.b) || !w4j.a((Object)this.c, (Object)bwf.c) || !w4j.a((Object)this.d, (Object)bwf.d) || !w4j.a((Object)this.e, (Object)bwf.e) || !w4j.a((Object)this.f, (Object)bwf.f)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.k((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d, (Object)this.e, (Object)this.f);
    }
}
