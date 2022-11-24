import java.util.Objects;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public class ne4<I, C extends je4<I>> extends v4e<I, C>
{
    public final de6 e;
    public final znl<I> f;
    
    public ne4(final kcm kcm, final Class<I> clazz, final gra<ViewGroup, C> gra) {
        super((Class)clazz, (gra)gra);
        final de6 e = new de6();
        this.e = e;
        this.f = (znl<I>)new znl();
        kcm.i((sj)new tdv(e, 2));
    }
    
    public final /* bridge */ n8x l(final ViewGroup viewGroup) {
        return (n8x)this.o(viewGroup);
    }
    
    public final w4e<I, C> o(final ViewGroup viewGroup) {
        final w4e w4e = new w4e((u4e)super.d.a((Object)viewGroup));
        final u4e g0 = w4e.G0;
        final int a = o5j.a;
        final t5j compose = ((je4)g0).O0().compose((bcj)loj.F0);
        final znl<I> f = this.f;
        Objects.requireNonNull((znl)f);
        this.e.a(compose.subscribe((rk6)new me4((znl)f, 0)));
        return (w4e<I, C>)w4e;
    }
    
    public final t5j<I> p() {
        return (t5j<I>)((t5j)this.f).filter((ouk)new pn1((Object)this, 21));
    }
}
