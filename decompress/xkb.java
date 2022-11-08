import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xkb
{
    public static final a Companion;
    public static final xkb$b c;
    public final uw0 a;
    public mo6 b;
    
    static {
        Companion = new a();
        c = new xkb$b();
    }
    
    public xkb(final uw0 a) {
        final k2a c0 = k2a.C0;
        zzd.f((Object)a, "asyncTypefaceCache");
        this.a = a;
        final xkb$b c2 = xkb.c;
        Objects.requireNonNull(c2);
        this.b = (mo6)oyz.b(oy6$a$a.c((oy6$a)c2, (oy6)c0).w0((oy6)new gyr((fae)null)));
    }
    
    public static final class a
    {
    }
}
