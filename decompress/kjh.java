// 
// Decompiled by Procyon v0.6.0
// 

public final class kjh
{
    public static final kjh e;
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    
    static {
        e = new kjh(-1L, false, false, false);
    }
    
    public kjh(final long a, final boolean c, final boolean b, final boolean d) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("Tweet ID: ");
        j.append(this.a);
        j.append(", Database Updated: ");
        j.append(this.c);
        j.append(", Success: ");
        j.append(this.b);
        j.append(", Moderated: ");
        j.append(this.d);
        return j.toString();
    }
}
