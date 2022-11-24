// 
// Decompiled by Procyon v0.6.0
// 

public final class h8d
{
    public long a;
    public long b;
    public int c;
    public long d;
    public long e;
    public String f;
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("operation=");
        f.append(this.f);
        f.append(",status=");
        f.append(this.c);
        if (this.a != 0L) {
            f.append(",size=");
            f.append(this.a);
            f.append(",timeMs=");
            f.append(this.e);
            f.append(",rateBps=");
            f.append(this.b);
        }
        return f.toString();
    }
}
