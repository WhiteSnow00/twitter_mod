import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pta implements nsb
{
    public final rta D0;
    public final ar0 E0;
    public final uew F0;
    public final xbm G0;
    
    public pta(final rta d0, final ar0 e0, final uew f0, final xbm g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Object invoke() {
        final rta d0 = this.D0;
        final ar0 e0 = this.E0;
        final uew f0 = this.F0;
        final xbm g0 = this.G0;
        Objects.requireNonNull(d0);
        final t19 subscribe = e0.b().B().observeOn(gmw.H()).subscribe((lj6)new f92((Object)d0, (Object)f0, 7));
        final t19 subscribe2 = f0.c().observeOn(gmw.H()).subscribe((lj6)new exw((Object)d0, (Object)e0, 4));
        final t19 subscribe3 = f0.o().subscribe((lj6)new ydm((Object)d0, 27));
        final wc6 wc6 = new wc6();
        wc6.a(subscribe);
        wc6.a(subscribe2);
        wc6.a(subscribe3);
        g0.i((oj)new ovt(wc6, 11));
        return null;
    }
}
