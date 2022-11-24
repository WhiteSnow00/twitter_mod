import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sow
{
    public static final row a;
    
    static {
        Objects.requireNonNull(ngj.Companion);
        a = new row((ngj)ngj$a.b, 0, 0);
    }
    
    public static final vzt a(final bgx bgx, final xc0 xc0) {
        e0e.f((Object)bgx, "<this>");
        e0e.f((Object)xc0, "text");
        final vzt a = bgx.a(xc0);
        return new vzt(a.a, (ngj)new row(a.b, xc0.length(), a.a.length()));
    }
}
