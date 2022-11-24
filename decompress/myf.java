import com.twitter.ui.view.GroupedRowView;
import android.view.ViewStub$OnInflateListener;
import android.view.ViewStub;
import java.util.WeakHashMap;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import com.twitter.ui.widget.NewItemBannerView;
import com.twitter.android.liveevent.landing.scribe.a;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class myf extends xus implements a9t$a, ufi$a
{
    public final a9t v1;
    public final oyf w1;
    public final nyf x1;
    
    public myf(final hdv hdv, final fxs fxs, final bts bts, final ii7<hp6> ii7, final def<vxs> def, final dsb dsb, final vpd vpd, final vpi<vxs> vpi, final Context context, final tc tc, final oys oys, final p1t p1t, final d4e<vxs> d4e, final fda<fo> fda, final mex mex, final sfv sfv, final a a, final a9t v1, final pyf pyf, final byf w1, final oyf x1, final nyf nyf) {
        super(hdv, fxs, bts, (ii7)ii7, (def)def, dsb, vpd, (vpi)vpi, tc, oys, p1t, (d4e)d4e, (fda)fda, mex, sfv);
        this.v1 = v1;
        this.w1 = (oyf)w1;
        this.x1 = (nyf)x1;
        final NewItemBannerView newItemBannerView = (NewItemBannerView)((idv)this).c().getView().findViewById(2131427779);
        final int a2 = o5j.a;
        ((idv)this).h0((onf$b)new ufi((ufi$a)this, newItemBannerView, ((jyf)bts).r(), a, pyf, ((idv)this).V0, hdv.o));
        v1.f = (a9t.a9t$a)this;
        v1.e.c(((t5j)v1.b.a).doOnNext((rk6)new bes((Object)v1, 11)).subscribe());
        final RecyclerView b = ((idv)this).a1.K0.b;
        final WeakHashMap a3 = b7x.a;
        b7x$i.t((View)b, true);
    }
    
    public final void L0() {
        final a9t v1 = this.v1;
        final vzf b = v1.b;
        b.a.onComplete();
        b.c.a();
        v1.e.a();
        v1.f = (a9t.a9t$a)a9t$a.j0;
        super.L0();
    }
    
    public final void M0() {
        super.M0();
        final View view = ((idv)this).c().getView();
        final View viewById = view.findViewById(2131428919);
        if (viewById != null) {
            final oyf w1 = this.w1;
            vmw.g((Object)w1);
            w1.b = viewById;
        }
        else {
            ((ViewStub)view.findViewById(2131428939)).setOnInflateListener((ViewStub$OnInflateListener)new lyf(this, view));
        }
    }
    
    public final void O() {
        if (((xl1)((idv)this).G0).T1) {
            this.d1(4);
        }
    }
    
    public final udv$b l0(final udv$b udv$b) {
        udv$b.a = "live_event";
        udv$b.d = 2131625753;
        return udv$b;
    }
    
    public final void z1(final vxs vxs, final View view) {
        if (!(view instanceof GroupedRowView)) {
            return;
        }
        final nyf x1 = this.x1;
        if ((x1 == null || x1.a != 1 || ((idv)this).a1.I1(vxs.a) != 0) && vxs.c().d != 10) {
            super.z1(vxs, view);
        }
        else {
            final int a = o5j.a;
            final GroupedRowView groupedRowView = (GroupedRowView)view;
            final int n = vxs.c().n;
            final int g = vxs.c().g;
            tqb.Y(groupedRowView, true, n);
        }
    }
}
