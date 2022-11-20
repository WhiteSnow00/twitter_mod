import android.content.Intent;
import android.view.View$OnClickListener;
import com.twitter.common.ui.settings.TabCardSettingsView;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.twitter.common.ui.isTalkingView.IsTalkingView;
import android.widget.ImageView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import com.twitter.media.ui.image.UserImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.content.res.Resources;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zpq implements ilx<vrq, arq, ypq>
{
    public final View D0;
    public final Fragment E0;
    public final w1o F0;
    public final Context G0;
    public final Resources H0;
    public final ProgressBar I0;
    public final TextView J0;
    public final ConstraintLayout K0;
    public final UserImageView L0;
    public final TypefacesTextView M0;
    public final TypefacesTextView N0;
    public final ImageView O0;
    public final TypefacesTextView P0;
    public final TypefacesTextView Q0;
    public final IsTalkingView R0;
    public final ImageView S0;
    public final LinearLayout T0;
    public final ViewStub U0;
    public View V0;
    public final mnl<fzv> W0;
    public final qun<TabCardSettingsView> X0;
    public final int Y0;
    public final ConstraintLayout Z0;
    public final rhh<vrq> a1;
    
    public zpq(View viewById, final Fragment e0, final w1o f0) {
        czd.f((Object)viewById, "view");
        czd.f((Object)f0, "roomReportSpaceHelper");
        this.D0 = viewById;
        this.E0 = e0;
        this.F0 = f0;
        final Context context = viewById.getContext();
        this.G0 = context;
        this.H0 = viewById.getResources();
        this.I0 = (ProgressBar)viewById.findViewById(2131430777);
        this.J0 = (TextView)viewById.findViewById(2131428969);
        this.K0 = (ConstraintLayout)viewById.findViewById(2131428258);
        this.L0 = (UserImageView)viewById.findViewById(2131431653);
        this.M0 = (TypefacesTextView)viewById.findViewById(2131432513);
        this.N0 = (TypefacesTextView)viewById.findViewById(2131432038);
        this.O0 = (ImageView)viewById.findViewById(2131432632);
        this.P0 = (TypefacesTextView)viewById.findViewById(2131427975);
        this.Q0 = (TypefacesTextView)viewById.findViewById(2131431555);
        final View viewById2 = viewById.findViewById(2131431904);
        czd.e((Object)viewById2, "view.findViewById(ClipsR.id.talking)");
        this.R0 = (IsTalkingView)viewById2;
        final View viewById3 = viewById.findViewById(2131430490);
        czd.e((Object)viewById3, "view.findViewById(ClipsR.id.overflow)");
        this.S0 = (ImageView)viewById3;
        final View viewById4 = viewById.findViewById(2131432211);
        czd.e((Object)viewById4, "view.findViewById(ClipsR.id.transcriptions)");
        this.T0 = (LinearLayout)viewById4;
        final View viewById5 = viewById.findViewById(2131432215);
        czd.e((Object)viewById5, "view.findViewById(ClipsR.id.transcriptions_view)");
        this.U0 = (ViewStub)viewById5;
        final mnl w0 = new mnl();
        this.W0 = (mnl<fzv>)w0;
        final qun$a companion = qun.Companion;
        final Context context2 = viewById.getContext();
        czd.e((Object)context2, "view.context");
        this.X0 = (qun<TabCardSettingsView>)companion.c(context2, w0);
        this.Y0 = kn6.b(context, 2131099763);
        viewById = viewById.findViewById(2131428089);
        czd.e((Object)viewById, "view.findViewById(ClipsR.id.card)");
        this.Z0 = (ConstraintLayout)viewById;
        this.a1 = (rhh<vrq>)q3j.g0((qsb)new zpq$j(this));
    }
    
    public final void T(final jbx jbx) {
        final vrq vrq = (vrq)jbx;
        czd.f((Object)vrq, "state");
        this.a1.b((Object)vrq);
    }
    
    public final void q(final Object o) {
        final ypq ypq = (ypq)o;
        czd.f((Object)ypq, "effect");
        if (ypq instanceof ypq.d) {
            final Fragment e0 = this.E0;
            if (e0 == null) {
                throw new IllegalStateException("fragment context should not null".toString());
            }
            e0.J1();
            final k7l$a k7l$a = new k7l$a();
            final ypq.d d = (ypq.d)ypq;
            k7l$a.h = d.a;
            k7l$a.c = d.b;
            final Intent o2 = k7l$a.o(this.G0);
            czd.e((Object)o2, "Builder()\n              \u2026    .buildIntent(context)");
            o2.addFlags(268435456);
            this.G0.startActivity(o2);
        }
        else if (czd.a((Object)ypq, (Object)ypq.c.a)) {
            this.X0.b((View)this.S0, this.D0, (ftb)new aqq(this));
        }
        else if (czd.a((Object)ypq, (Object)ypq.b.a)) {
            this.X0.a();
        }
        else if (czd.a((Object)ypq, (Object)ypq.a.a)) {
            ifd.Companion.b((dfd)new w5s(2131958227, (red$c)red$c$a.b, "", Integer.valueOf(52), (Integer)null, (View$OnClickListener)null, 112));
        }
        else if (ypq instanceof ypq.e) {
            final w1o f0 = this.F0;
            final ypq.e e2 = (ypq.e)ypq;
            w1o.a(f0, e2.b, e2.a, Long.valueOf(e2.c), (String)null, false, false, false, e2.d, e2.e, (String)null, vba.Companion.e("audiospace", "", "", "audiospace_card", ""), 600);
            this.X0.a();
        }
    }
    
    public final h5j<arq> w() {
        final ConstraintLayout k0 = this.K0;
        czd.e((Object)k0, "clipInfo");
        final h5j map = max.h((View)k0).map((psb)new k1i((qsb)zpq$b.D0, 14));
        final UserImageView l0 = this.L0;
        czd.e((Object)l0, "speakerAvatar");
        final h5j map2 = max.h((View)l0).map((psb)new s4i((qsb)zpq$c.D0, 15));
        final TypefacesTextView m0 = this.M0;
        czd.e((Object)m0, "speakerUsername");
        final h5j map3 = max.h((View)m0).map((psb)new hdm((qsb)zpq$d.D0, 22));
        final ImageView o0 = this.O0;
        czd.e((Object)o0, "volumeButton");
        final h5j mergeArray = h5j.mergeArray(new taj[] { (taj)map, (taj)map2, (taj)map3, (taj)max.h((View)o0).map((psb)new ap((qsb)zpq$e.D0, 14)), (taj)max.h((View)this.Z0).map((psb)new g0i((qsb)zpq$f.D0, 13)), (taj)max.h((View)this.S0).map((psb)new vt1((qsb)zpq$g.D0, 7)), (taj)((h5j)((k6o)this.X0.b).F0).map((psb)new oyf((qsb)zpq$h.D0, 3)), (taj)((h5j)this.W0).map((psb)new lql((qsb)zpq$i.D0, 12)) });
        czd.e((Object)mergeArray, "mergeArray(\n        clip\u2026pupViewDismissed },\n    )");
        return (h5j<arq>)mergeArray;
    }
    
    public interface a
    {
        zpq a(final View p0);
    }
}
