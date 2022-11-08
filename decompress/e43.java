// 
// Decompiled by Procyon v0.6.0
// 

public final class e43 implements oax
{
    public final ecj a;
    
    public e43(final ecj a) {
        zzd.f((Object)a, "button");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof e43 && zzd.a((Object)this.a, (Object)((e43)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final ecj a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("ButtonComponentViewState(button=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
