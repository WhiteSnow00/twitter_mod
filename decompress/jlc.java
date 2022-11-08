// 
// Decompiled by Procyon v0.6.0
// 

public final class jlc
{
    public final long a;
    public final long b;
    
    public jlc(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("HistoricalChange(uptimeMillis=");
        g.append(this.a);
        g.append(", position=");
        g.append((Object)qfj.j(this.b));
        g.append(')');
        return g.toString();
    }
}
