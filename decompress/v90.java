import java.util.LinkedHashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v90
{
    public final z73 a;
    public final zz6<z73, aj4> b;
    public final zz6.b<z73> c;
    public final LinkedHashSet<z73> d;
    
    public v90(final z73 a, final zz6<z73, aj4> b) {
        this.a = a;
        this.b = b;
        this.d = new LinkedHashSet<z73>();
        this.c = new v90$a(this);
    }
    
    public final v90.v90$b a(final int n) {
        return new v90.v90$b(this.a, n);
    }
}
