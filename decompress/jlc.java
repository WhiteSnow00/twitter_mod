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
        final StringBuilder f = ehk.f("HistoricalChange(uptimeMillis=");
        f.append(this.a);
        f.append(", position=");
        f.append((Object)kgj.j(this.b));
        f.append(')');
        return f.toString();
    }
}
