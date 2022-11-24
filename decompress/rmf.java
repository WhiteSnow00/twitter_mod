import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rmf extends fpp
{
    public final List<String> b;
    
    public rmf(final rmf.rmf$a rmf$a) {
        Object b;
        if ((b = rmf$a.a) == null) {
            b = h3a.F0;
        }
        this.b = (List<String>)b;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o != null && rmf.class == o.getClass() && o5j.a((Object)this.b, (Object)((rmf)o).b));
    }
    
    public final int hashCode() {
        return o5j.q((List)this.b);
    }
}
