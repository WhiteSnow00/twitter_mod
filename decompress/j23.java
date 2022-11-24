import com.twitter.business.api.BusinessListSelectionContentViewResult;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView;
import com.twitter.ui.widget.TwitterEditText;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j23 implements xlx<m23, Object, t13>
{
    public final View F0;
    public final s13 G0;
    public final nn H0;
    public final Toolbar I0;
    public final TwitterEditText J0;
    public final fih<m23> K0;
    
    public j23(final View f0, final j4e<w13> adapter, final s13 g0, final nn h0) {
        e0e.f((Object)f0, "rootView");
        e0e.f((Object)adapter, "itemAdapter");
        e0e.f((Object)g0, "itemProvider");
        e0e.f((Object)h0, "activityFinisher");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = (Toolbar)f0.findViewById(2131432115);
        final RecyclerView recyclerView = (RecyclerView)f0.findViewById(2131429781);
        this.J0 = (TwitterEditText)f0.findViewById(2131431262);
        recyclerView.setAdapter((RecyclerView$e)adapter);
        this.K0 = (fih<m23>)ma7.S((stb)new j23$a(this));
    }
    
    public final void T(final ccx ccx) {
        final m23 m23 = (m23)ccx;
        e0e.f((Object)m23, "state");
        this.K0.b((Object)m23);
    }
    
    public final void r(final Object o) {
        final t13 t13 = (t13)o;
        e0e.f((Object)t13, "effect");
        if (t13 instanceof t13$a) {
            this.H0.c((ho6)new BusinessListSelectionContentViewResult(((t13$a)t13).a));
        }
    }
    
    public final t5j<Object> w() {
        final t5j empty = t5j.empty();
        e0e.e((Object)empty, "empty()");
        return (t5j<Object>)empty;
    }
}
