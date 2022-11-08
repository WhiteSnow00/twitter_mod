import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mdy implements aey
{
    public final aey e() {
        return (aey)aey.v0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || o instanceof mdy;
    }
    
    public final Double h() {
        return 0.0;
    }
    
    @Override
    public final int hashCode() {
        return 1;
    }
    
    public final Boolean i() {
        return Boolean.FALSE;
    }
    
    public final String j() {
        return "null";
    }
    
    public final Iterator l() {
        return null;
    }
    
    public final aey o(final String s, final k6z k6z, final List list) {
        throw new IllegalStateException(String.format("null has no function %s", s));
    }
}
