// 
// Decompiled by Procyon v0.6.0
// 

public final class a8w extends b
{
    public final ji a;
    
    public a8w(final ji a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof a8w && zzd.a((Object)this.a, (Object)((a8w)o).a));
    }
    
    @Override
    public final int hashCode() {
        final ji a = this.a;
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
        final ji a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("UserAccountLabelSettingsResponse(accountLabel=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
