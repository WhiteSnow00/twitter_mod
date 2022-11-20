// 
// Decompiled by Procyon v0.6.0
// 

public abstract class wkh<N extends okh$c> extends asd implements okh$b
{
    public final okh E(final okh okh) {
        return k6e.a((okh)this, okh);
    }
    
    public final boolean H(final qsb qsb) {
        return da8.a((okh$b)this, qsb);
    }
    
    public final Object X(final Object o, final ftb ftb) {
        czd.f((Object)ftb, "operation");
        return ftb.invoke(o, (Object)this);
    }
    
    public abstract N b();
    
    public abstract N c(final N p0);
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof wkh)) {
            return false;
        }
        if (!lp.v((Object)this, o)) {
            return false;
        }
        final wkh wkh = (wkh)o;
        return czd.a((Object)null, (Object)null);
    }
    
    public final int hashCode() {
        return 0;
    }
}
