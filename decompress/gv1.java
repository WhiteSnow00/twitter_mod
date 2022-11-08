// 
// Decompiled by Procyon v0.6.0
// 

public final class gv1
{
    public final dda<m6x> a;
    
    public gv1() {
        this(null, 1, null);
    }
    
    public gv1(final dda<m6x> a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof gv1 && zzd.a((Object)this.a, (Object)((gv1)o).a));
    }
    
    @Override
    public final int hashCode() {
        final dda<m6x> a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public final String toString() {
        final dda<m6x> a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("BceParentContext(parentEventSource=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
