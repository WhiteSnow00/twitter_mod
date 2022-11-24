// 
// Decompiled by Procyon v0.6.0
// 

public final class yjh
{
    public static final yjh e;
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    
    static {
        e = new yjh(-1L, false, false, false);
    }
    
    public yjh(final long a, final boolean c, final boolean b, final boolean d) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("Tweet ID: ");
        f.append(this.a);
        f.append(", Database Updated: ");
        f.append(this.c);
        f.append(", Success: ");
        f.append(this.b);
        f.append(", Moderated: ");
        f.append(this.d);
        return f.toString();
    }
}
