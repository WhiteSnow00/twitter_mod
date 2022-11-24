// 
// Decompiled by Procyon v0.6.0
// 

public final class dko implements ccx
{
    public final x6q a;
    
    public dko() {
        final x6q.g a = x6q.g.a;
        this.a = (x6q)a;
    }
    
    public dko(final x6q a) {
        this.a = a;
    }
    
    public dko(final x6q x6q, final int n, final wg8 wg8) {
        final x6q.g a = x6q.g.a;
        this.a = (x6q)a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof dko && e0e.a((Object)this.a, (Object)((dko)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final dko l(final x6q x6q) {
        return new dko(x6q);
    }
    
    @Override
    public final String toString() {
        final x6q a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("RoomUtilsFragmentSheetViewState(shownView=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
