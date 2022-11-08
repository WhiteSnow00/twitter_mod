import com.twitter.business.api.BusinessListSelectionContentViewResult;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView;
import com.twitter.ui.widget.TwitterEditText;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z13 implements okx<c23, Object, j13>
{
    public final View C0;
    public final i13 D0;
    public final kn E0;
    public final Toolbar F0;
    public final TwitterEditText G0;
    public final mhh<c23> H0;
    
    public z13(final View c0, final c4e<m13> adapter, final i13 d0, final kn e0) {
        zzd.f((Object)c0, "rootView");
        zzd.f((Object)adapter, "itemAdapter");
        zzd.f((Object)d0, "itemProvider");
        zzd.f((Object)e0, "activityFinisher");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = (Toolbar)c0.findViewById(2131432111);
        final RecyclerView recyclerView = (RecyclerView)c0.findViewById(2131429780);
        this.G0 = (TwitterEditText)c0.findViewById(2131431259);
        recyclerView.setAdapter((RecyclerView$e)adapter);
        this.H0 = (mhh<c23>)ajy.a0((rtb)new rtb<mhh$a<c23>, oyv>() {
            public final /* synthetic */ z13 C0;
            
            public final Object invoke(final Object o) {
                final mhh$a mhh$a = (mhh$a)o;
                zzd.f((Object)mhh$a, "$this$watch");
                mhh$a.c(new voe[] { (voe)r13.C0 }, (rtb)new s13(this.C0));
                mhh$a.c(new voe[] { (voe)t13.C0 }, (rtb)new u13(this.C0));
                mhh$a.c(new voe[] { (voe)v13.C0 }, (rtb)new w13(this.C0));
                mhh$a.c(new voe[] { (voe)x13.C0 }, (rtb)new y13(this.C0));
                return oyv.a;
            }
        });
    }
    
    public final void T(final oax oax) {
        final c23 c23 = (c23)oax;
        zzd.f((Object)c23, "state");
        this.H0.b((Object)c23);
    }
    
    public final void s(final Object o) {
        final j13 j13 = (j13)o;
        zzd.f((Object)j13, "effect");
        if (j13 instanceof j13$a) {
            this.E0.c((vn6)new BusinessListSelectionContentViewResult(((j13$a)j13).a));
        }
    }
    
    public final b5j<Object> x() {
        final b5j empty = b5j.empty();
        zzd.e((Object)empty, "empty()");
        return (b5j<Object>)empty;
    }
}
