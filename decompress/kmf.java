import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmf extends fqp
{
    public final List<t94> f;
    public final List<String> g;
    public final boolean h;
    
    public kmf(final kmf.kmf$a kmf$a) {
        super((a)kmf$a);
        Object f;
        if ((f = kmf$a.e) == null) {
            f = v2a.C0;
        }
        this.f = (List<t94>)f;
        this.g = kmf$a.f;
        this.h = kmf$a.g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && kmf.class == o.getClass()) {
            final kmf kmf = (kmf)o;
            if (!w4j.a((Object)this.f, (Object)kmf.f) || !w4j.a((Object)this.g, (Object)kmf.g) || !w4j.a((Object)this.h, (Object)kmf.h)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.h((Object)this.f, (Object)this.g, (Object)this.h);
    }
}
