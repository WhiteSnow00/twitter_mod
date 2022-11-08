// 
// Decompiled by Procyon v0.6.0
// 

public final class jy5
{
    public final iy5 a;
    
    public jy5(final iy5 a) {
        zzd.f((Object)a, "result");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof jy5 && zzd.a((Object)this.a, (Object)((jy5)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final iy5 a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("CommunityUserResults(result=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
