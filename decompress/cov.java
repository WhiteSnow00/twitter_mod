// 
// Decompiled by Procyon v0.6.0
// 

public final class cov implements dkf
{
    public final int a;
    public final spv b;
    
    public cov(final spv b) {
        this.a = 6;
        this.b = b;
    }
    
    @Override
    public final int a() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof cov)) {
            return false;
        }
        final cov cov = (cov)o;
        return this.a == cov.a && zzd.a((Object)this.b, (Object)cov.b);
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final spv b = this.b;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        return a * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final spv b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("URTCursoredFetchDescriptor(fetchType=");
        sb.append(a);
        sb.append(", urtCursor=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
