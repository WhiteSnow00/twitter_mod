// 
// Decompiled by Procyon v0.6.0
// 

public final class z80 extends ste implements qsb<wgk$a, fzv>
{
    public final wgk D0;
    public final jm6 E0;
    
    public z80(final wgk d0, final jm6 e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final wgk$a wgk$a = (wgk$a)o;
        czd.f((Object)wgk$a, "$this$layout");
        wgk$a.c(this.D0, 0, 0, ((Number)this.E0.c.getValue()).floatValue());
        return fzv.a;
    }
}
