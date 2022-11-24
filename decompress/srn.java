import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class srn implements xlx<zrn, rrn, prn>
{
    public final qdw F0;
    public final fth G0;
    public final orn H0;
    public final TypefacesTextView I0;
    public final ImageView J0;
    public final View K0;
    public final TypefacesTextView L0;
    public final fih<zrn> M0;
    
    public srn(final View view, final qdw f0, final j4e<eth> adapter, final fth g0, final orn h0) {
        e0e.f((Object)view, "rootView");
        e0e.f((Object)f0, "userInfo");
        e0e.f((Object)adapter, "adapter");
        e0e.f((Object)g0, "itemProvider");
        e0e.f((Object)h0, "roomMultiScheduledSpacesDispatcher");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        final View viewById = view.findViewById(2131431222);
        e0e.e((Object)viewById, "rootView.findViewById(R.\u2026cheduled_spaces_recycler)");
        final RecyclerView recyclerView = (RecyclerView)viewById;
        final View viewById2 = view.findViewById(2131429948);
        e0e.e((Object)viewById2, "rootView.findViewById(R.\u2026ax_scheduled_spaces_text)");
        this.I0 = (TypefacesTextView)viewById2;
        final View viewById3 = view.findViewById(2131427753);
        e0e.e((Object)viewById3, "rootView.findViewById(R.id.back_button)");
        this.J0 = (ImageView)viewById3;
        final View viewById4 = view.findViewById(2131429400);
        e0e.e((Object)viewById4, "rootView.findViewById(R.id.header)");
        this.K0 = viewById4;
        final View viewById5 = view.findViewById(2131432514);
        e0e.e((Object)viewById5, "rootView.findViewById(R.id.username)");
        this.L0 = (TypefacesTextView)viewById5;
        view.getContext();
        recyclerView.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        recyclerView.setAdapter((RecyclerView$e)adapter);
        this.M0 = (fih<zrn>)ma7.S((stb)new srn$c(this));
    }
    
    public final void T(final ccx ccx) {
        final zrn zrn = (zrn)ccx;
        e0e.f((Object)zrn, "state");
        this.M0.b((Object)zrn);
    }
    
    public final void r(final Object o) {
        final prn prn = (prn)o;
        e0e.f((Object)prn, "effect");
        if (prn instanceof prn.a) {
            this.H0.c.onNext((Object)kni.a);
        }
    }
    
    public final t5j<rrn> w() {
        final t5j mergeArray = t5j.mergeArray(new fbj[] { (fbj)vq9.a((View)this.J0).map((rtb)new wsn((stb)srn$b.F0, 22)) });
        e0e.e((Object)mergeArray, "mergeArray(\n        back\u2026ackButtonPressed },\n    )");
        return (t5j<rrn>)mergeArray;
    }
}
