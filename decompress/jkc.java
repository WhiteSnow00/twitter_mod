// 
// Decompiled by Procyon v0.6.0
// 

public final class jkc
{
    public final long a;
    public final long b;
    
    public jkc(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("HistoricalChange(uptimeMillis=");
        j.append(this.a);
        j.append(", position=");
        j.append((Object)wfj.j(this.b));
        j.append(')');
        return j.toString();
    }
}
