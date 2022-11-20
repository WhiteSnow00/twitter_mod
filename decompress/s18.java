// 
// Decompiled by Procyon v0.6.0
// 

public final class s18 implements jbx
{
    public final CharSequence a;
    
    public s18(final CharSequence a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof s18 && czd.a((Object)this.a, (Object)((s18)o).a));
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
