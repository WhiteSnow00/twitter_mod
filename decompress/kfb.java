import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfb implements jfb
{
    public boolean a;
    public qfb b;
    public qfb c;
    public qfb d;
    public qfb e;
    public qfb f;
    public qfb g;
    public qfb h;
    public qfb i;
    public stb<? super seb, qfb> j;
    public stb<? super seb, qfb> k;
    
    public kfb() {
        this.a = true;
        final qfb$a companion = qfb.Companion;
        Objects.requireNonNull(companion);
        final qfb b = qfb.b;
        this.b = b;
        Objects.requireNonNull(companion);
        this.c = b;
        Objects.requireNonNull(companion);
        this.d = b;
        Objects.requireNonNull(companion);
        this.e = b;
        Objects.requireNonNull(companion);
        this.f = b;
        Objects.requireNonNull(companion);
        this.g = b;
        Objects.requireNonNull(companion);
        this.h = b;
        Objects.requireNonNull(companion);
        this.i = b;
        this.j = (stb<? super seb, qfb>)kfb$a.F0;
        this.k = (stb<? super seb, qfb>)kfb$b.F0;
    }
    
    @Override
    public final void a(final boolean a) {
        this.a = a;
    }
    
    public final void b(final stb<? super seb, qfb> j) {
        e0e.f((Object)j, "<set-?>");
        this.j = j;
    }
    
    public final void c(final stb<? super seb, qfb> k) {
        e0e.f((Object)k, "<set-?>");
        this.k = k;
    }
    
    public final void d(final qfb b) {
        e0e.f((Object)b, "<set-?>");
        this.b = b;
    }
}
