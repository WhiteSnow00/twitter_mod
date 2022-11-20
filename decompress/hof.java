import java.util.List;
import android.view.ViewStub;
import android.view.View;
import android.content.Context;
import com.twitter.moments.core.ui.AutoPlayableViewHost;
import android.view.ViewGroup;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hof implements ypa
{
    public final int a;
    public final Object b;
    public final Object c;
    
    public hof(final Object b, final Object c, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(final Object o) {
        switch (this.a) {
            default: {
                final Activity activity = (Activity)this.b;
                final rfm rfm = (rfm)this.c;
                final ViewGroup viewGroup = (ViewGroup)o;
                final uzk uzk = new uzk((Object)j19.k, 1);
                final AutoPlayableViewHost autoPlayableViewHost = new AutoPlayableViewHost((Context)activity);
                return new pk3((ryt)uzk, new pk3$a((View)autoPlayableViewHost, (ViewGroup)autoPlayableViewHost, autoPlayableViewHost), rfm);
            }
            case 0: {
                final mg3 mg3 = (mg3)this.b;
                final mnu mnu = (mnu)this.c;
                final ViewGroup viewGroup2 = (ViewGroup)o;
                czd.f((Object)mg3, "$captionManager");
                czd.f((Object)mnu, "$attributionDelegate");
                czd.f((Object)viewGroup2, "viewGroup");
                final rif h = rif.H();
                h.p((Object)new q2g(viewGroup2));
                h.p((Object)new hsk(viewGroup2));
                h.p((Object)new wdq(viewGroup2));
                h.p((Object)new oi4(viewGroup2, mg3, 1));
                h.p((Object)new wdq(viewGroup2));
                h.p((Object)new r71(viewGroup2, false));
                final View viewById = ((View)viewGroup2).findViewById(2131427662);
                czd.e((Object)viewById, "parent.findViewById(\n   \u2026tub\n                    )");
                h.p((Object)new bqf(new eqf((ViewStub)viewById), (bqf.a)mnu));
                return new d94((List)((n4j)h).e());
            }
        }
    }
}
