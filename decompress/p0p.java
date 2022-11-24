import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p0p implements r00
{
    public final fwk a;
    public long b;
    public vz6 c;
    
    public p0p(final fwk a, final pml<o00> pml, final kcm kcm) {
        this.a = a;
        final b39 subscribe = ita.d().n().subscribe((rk6)new o0p((Object)this, (Object)pml, 0));
        Objects.requireNonNull(subscribe);
        kcm.i((sj)new m0p(subscribe, 0));
    }
    
    public final long a() {
        return this.b;
    }
    
    public final long b() {
        final String j = this.a.b().j("debug_scribe_flushing_frequency", "default");
        if ("default".equalsIgnoreCase(j)) {
            return 0L;
        }
        return Integer.parseInt(j) * 1000L;
    }
}
