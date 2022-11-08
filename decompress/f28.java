// 
// Decompiled by Procyon v0.6.0
// 

public final class f28 implements oax
{
    public final CharSequence a;
    
    public f28(final CharSequence a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof f28 && zzd.a((Object)this.a, (Object)((f28)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final CharSequence a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("DMSearchToolbarViewState(queryText=");
        sb.append((Object)a);
        sb.append(")");
        return sb.toString();
    }
}
