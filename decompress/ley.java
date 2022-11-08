import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ley implements aey
{
    public final String C0;
    public final ArrayList D0;
    
    public ley(final String c0, final List list) {
        this.C0 = c0;
        (this.D0 = new ArrayList()).addAll(list);
    }
    
    public final aey e() {
        return (aey)this;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ley)) {
            return false;
        }
        final ley ley = (ley)o;
        final String c0 = this.C0;
        if (c0 != null) {
            if (c0.equals(ley.C0)) {
                return this.D0.equals(ley.D0);
            }
        }
        else if (ley.C0 == null) {
            return this.D0.equals(ley.D0);
        }
        return false;
    }
    
    public final Double h() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }
    
    @Override
    public final int hashCode() {
        final String c0 = this.C0;
        int hashCode;
        if (c0 != null) {
            hashCode = c0.hashCode();
        }
        else {
            hashCode = 0;
        }
        return this.D0.hashCode() + hashCode * 31;
    }
    
    public final Boolean i() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }
    
    public final String j() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }
    
    public final Iterator l() {
        return null;
    }
    
    public final aey o(final String s, final k6z k6z, final List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
