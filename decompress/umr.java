// 
// Decompiled by Procyon v0.6.0
// 

public final class umr extends ifk
{
    public final tmr[] e;
    
    public umr(final a a) {
        super((ifk$a)a);
        this.e = a.c;
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("Error total: ");
        g.append(this.e.length);
        final StringBuilder sb = new StringBuilder(g.toString());
        for (final tmr tmr : this.e) {
            sb.append("\n");
            sb.append(tmr);
        }
        return sb.toString();
    }
    
    public static final class a extends ifk$a<umr, a>
    {
        public tmr[] c;
        
        public final Object i() {
            return new umr(this);
        }
    }
}
