import com.twitter.business.api.BusinessListSelectionContentViewResult;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView;
import com.twitter.ui.widget.TwitterEditText;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q13 implements ilx<t13, Object, a13>
{
    public final View D0;
    public final z03 E0;
    public final jn F0;
    public final Toolbar G0;
    public final TwitterEditText H0;
    public final rhh<t13> I0;
    
    public q13(final View d0, final h3e<d13> adapter, final z03 e0, final jn f0) {
        czd.f((Object)d0, "rootView");
        czd.f((Object)adapter, "itemAdapter");
        czd.f((Object)e0, "itemProvider");
        czd.f((Object)f0, "activityFinisher");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = (Toolbar)d0.findViewById(2131432114);
        final RecyclerView recyclerView = (RecyclerView)d0.findViewById(2131429780);
        this.H0 = (TwitterEditText)d0.findViewById(2131431261);
        recyclerView.setAdapter((RecyclerView$e)adapter);
        this.I0 = (rhh<t13>)q3j.g0((qsb)new qsb<rhh$a<t13>, fzv>(this) {
            public final q13 D0;
            
            public final Object invoke(final Object o) {
                final rhh$a rhh$a = (rhh$a)o;
                czd.f((Object)rhh$a, "$this$watch");
                rhh$a.c(new foe[] { (foe)i13.D0 }, (qsb)new j13(this.D0));
                rhh$a.c(new foe[] { (foe)k13.D0 }, (qsb)new l13(this.D0));
                rhh$a.c(new foe[] { (foe)m13.D0 }, (qsb)new n13(this.D0));
                rhh$a.c(new foe[] { (foe)o13.D0 }, (qsb)new p13(this.D0));
                return fzv.a;
            }
        });
    }
    
    public final void T(final jbx jbx) {
        final t13 t13 = (t13)jbx;
        czd.f((Object)t13, "state");
        this.I0.b((Object)t13);
    }
    
    public final void q(final Object o) {
        final a13 a13 = (a13)o;
        czd.f((Object)a13, "effect");
        if (a13 instanceof a13$a) {
            this.F0.c((bn6)new BusinessListSelectionContentViewResult(((a13$a)a13).a));
        }
    }
    
    public final h5j<Object> w() {
        final h5j empty = h5j.empty();
        czd.e((Object)empty, "empty()");
        return (h5j<Object>)empty;
    }
}
