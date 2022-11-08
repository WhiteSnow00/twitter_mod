import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sfy implements aey
{
    public final aey e() {
        return (aey)aey.u0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || o instanceof sfy;
    }
    
    public final Double h() {
        return Double.NaN;
    }
    
    public final Boolean i() {
        return Boolean.FALSE;
    }
    
    public final String j() {
        return "undefined";
    }
    
    public final Iterator l() {
        return null;
    }
    
    public final aey o(final String s, final k6z k6z, final List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", s));
    }
}
