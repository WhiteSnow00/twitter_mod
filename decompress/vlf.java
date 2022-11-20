import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vlf extends wqp
{
    public final List<v84> f;
    public final List<String> g;
    public final boolean h;
    
    public vlf(final vlf.vlf$a vlf$a) {
        super((wqp$a)vlf$a);
        Object f;
        if ((f = vlf$a.e) == null) {
            f = f2a.D0;
        }
        this.f = (List<v84>)f;
        this.g = vlf$a.f;
        this.h = vlf$a.g;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && vlf.class == o.getClass()) {
            final vlf vlf = (vlf)o;
            if (!c5j.a((Object)this.f, (Object)vlf.f) || !c5j.a((Object)this.g, (Object)vlf.g) || !c5j.a((Object)this.h, (Object)vlf.h)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return c5j.h((Object)this.f, (Object)this.g, (Object)this.h);
    }
}
