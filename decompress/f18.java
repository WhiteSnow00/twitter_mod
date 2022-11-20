// 
// Decompiled by Procyon v0.6.0
// 

public final class f18 extends ste implements qsb<g18, fzv>
{
    public final x08 D0;
    
    public f18(final x08 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final g18 g18 = (g18)o;
        czd.f((Object)g18, "$this$distinct");
        x08.a(this.D0, g18);
        if (!g18.c && (g18.d.isEmpty() ^ true)) {
            final x08 d0 = this.D0;
            if (!d0.O0) {
                d0.O0 = true;
                final o08 a = o08.a;
                cbw.b((elm)new af4(o08.o));
            }
        }
        return fzv.a;
    }
}
