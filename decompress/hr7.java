// 
// Decompiled by Procyon v0.6.0
// 

public final class hr7
{
    public final Boolean a;
    
    public hr7(final Boolean a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof hr7 && e0e.a((Object)this.a, (Object)((hr7)o).a));
    }
    
    @Override
    public final int hashCode() {
        final Boolean a = this.a;
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
        final Boolean a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("DMInitialLowQualityState(is_low_quality=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
