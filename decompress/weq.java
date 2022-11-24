// 
// Decompiled by Procyon v0.6.0
// 

public final class weq<T>
{
    public final d86 a;
    
    public weq(final d86 a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final d86 a = this.a;
        final boolean b = o instanceof weq;
        boolean b2 = false;
        if (b) {
            if (e0e.a((Object)a, (Object)((weq)o).a)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final d86 a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("SkippableUpdater(composer=");
        sb.append(a);
        sb.append(')');
        return sb.toString();
    }
}
