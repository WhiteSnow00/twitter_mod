import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class rel<Item, Args> implements qel<Item, Args>
{
    public final nel<Args, Item> F0;
    public final bxo G0;
    public final znl<btm<List<Item>, zbv>> H0;
    public final List<Item> I0;
    public final de6 J0;
    
    public rel(final nel<Args, Item> f0, final bxo g0, final kcm kcm) {
        e0e.f((Object)g0, "ioScheduler");
        e0e.f((Object)kcm, "releaseCompletable");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = (znl<btm<List<Item>, zbv>>)new znl();
        this.I0 = new ArrayList();
        final de6 j0 = new de6();
        this.J0 = j0;
        kcm.i((sj)new gsw(j0, 7));
    }
    
    public final void f(final Args args, final boolean b, final boolean b2) {
        this.J0.a(this.F0.a((Object)args, b).I(this.G0).G((rk6)new xql((stb)new rel$a(this, b2), 12), (rk6)lvb.e));
    }
}
