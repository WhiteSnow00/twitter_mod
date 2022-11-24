import com.twitter.android.liveevent.landing.carousel.a;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import android.view.View;
import android.view.ViewStub;
import com.twitter.android.liveevent.landing.LiveEventAppBarLayoutBehavior;
import com.twitter.android.liveevent.landing.carousel.d$a;
import android.view.ViewStub$OnInflateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ysf implements ViewStub$OnInflateListener
{
    public final d$a F0;
    public final LiveEventAppBarLayoutBehavior G0;
    public final mxe H0;
    public final mxe I0;
    
    public ysf(final d$a f0, final LiveEventAppBarLayoutBehavior g0, final mxe h0, final mxe i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final void onInflate(final ViewStub viewStub, final View view) {
        final d$a f0 = this.F0;
        final LiveEventAppBarLayoutBehavior g0 = this.G0;
        final mxe h0 = this.H0;
        final mxe i0 = this.I0;
        Objects.requireNonNull(f0);
        view.getContext();
        final int a = o5j.a;
        final RecyclerView recyclerView = (RecyclerView)view;
        f0.H0 = recyclerView;
        g0.t = (View)recyclerView;
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        f0.I0 = linearLayoutManager;
        f0.H0.setLayoutManager((RecyclerView$m)linearLayoutManager);
        final j4e adapter = (j4e)h0.get();
        f0.H0.setAdapter((RecyclerView$e)adapter);
        final a a2 = (a)i0.get();
        f.i(tqb.R((fda)adapter.J0.b), (fa3)new lpa(a2, 1));
        f.i(tqb.W((fda)adapter.J0.b), (fa3)new pgc(a2, 1));
        f0.H0.setNestedScrollingEnabled(false);
    }
}
