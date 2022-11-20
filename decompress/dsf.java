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

public final class dsf implements ViewStub$OnInflateListener
{
    public final d$a D0;
    public final LiveEventAppBarLayoutBehavior E0;
    public final pwe F0;
    public final pwe G0;
    
    public dsf(final d$a d0, final LiveEventAppBarLayoutBehavior e0, final pwe f0, final pwe g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onInflate(final ViewStub viewStub, final View view) {
        final d$a d0 = this.D0;
        final LiveEventAppBarLayoutBehavior e0 = this.E0;
        final pwe f0 = this.F0;
        final pwe g0 = this.G0;
        Objects.requireNonNull(d0);
        view.getContext();
        final int a = c5j.a;
        final RecyclerView recyclerView = (RecyclerView)view;
        d0.F0 = recyclerView;
        e0.t = (View)recyclerView;
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        d0.G0 = linearLayoutManager;
        d0.F0.setLayoutManager((RecyclerView$m)linearLayoutManager);
        final h3e adapter = (h3e)f0.get();
        d0.F0.setAdapter((RecyclerView$e)adapter);
        final a a2 = (a)g0.get();
        f.i(rp9.v0((xba)adapter.H0.b), (n93)new doa((Object)a2, 1));
        f.i(rp9.x0((xba)adapter.H0.b), (n93)new csf((Object)a2, 0));
        d0.F0.setNestedScrollingEnabled(false);
    }
}
