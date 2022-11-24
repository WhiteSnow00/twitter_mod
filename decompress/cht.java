import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cht implements xlx<qht, vgt, ugt>
{
    public final View F0;
    public final qej G0;
    public final tgt H0;
    public TextView I0;
    public TextView J0;
    public RecyclerView K0;
    public final znl<vgt> L0;
    public final de6 M0;
    public final fih<qht> N0;
    
    public cht(final View f0, final qej g0, final kcm kcm, final tgt h0) {
        e0e.f((Object)f0, "rootView");
        e0e.f((Object)g0, "ocfRichTextProcessorHelper");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)h0, "actionClickListener");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = (TextView)f0.findViewById(2131432092);
        this.J0 = (TextView)f0.findViewById(2131427503);
        this.K0 = (RecyclerView)f0.findViewById(2131428448);
        this.L0 = (znl<vgt>)new znl();
        this.M0 = new de6();
        kcm.i((sj)new yt1((Object)this, 23));
        this.N0 = (fih<qht>)ma7.S((stb)new cht$b(this));
    }
    
    public static final void a(final cht cht, final pej pej, final ptb ptb) {
        final TextView j0 = (TextView)cht.F0.findViewById(2131427503);
        cht.J0 = j0;
        if (j0 != null) {
            cht.G0.a(j0, (fym)pej);
        }
        final TextView j2 = cht.J0;
        if (j2 != null) {
            final t5j map = vq9.a((View)j2).map((rtb)new x2i((stb)new dht(cht, ptb), 11));
            if (map != null) {
                final b39 subscribe = map.subscribe();
                if (subscribe != null) {
                    cht.M0.a(subscribe);
                }
            }
        }
    }
    
    public final void T(final ccx ccx) {
        final qht qht = (qht)ccx;
        e0e.f((Object)qht, "state");
        this.N0.b((Object)qht);
    }
    
    public final void r(final Object o) {
        final ugt ugt = (ugt)o;
        e0e.f((Object)ugt, "effect");
        if (ugt instanceof ugt$a) {
            this.H0.a(((ugt$a)ugt).a);
        }
    }
    
    public final t5j<vgt> w() {
        return (t5j<vgt>)this.L0;
    }
}
