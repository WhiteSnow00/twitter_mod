import android.app.Dialog;
import android.content.DialogInterface$OnClickListener;
import android.widget.TextView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import com.twitter.ui.components.button.legacy.TwitterButton;
import com.twitter.ui.widget.TwitterEditText;
import android.widget.ImageView;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p4o implements ilx<g5o, o4o, m4o>
{
    public final View D0;
    public final l4o E0;
    public final mjo F0;
    public final UserIdentifier G0;
    public final Context H0;
    public final ImageView I0;
    public final TwitterEditText J0;
    public final TwitterEditText K0;
    public final TwitterEditText L0;
    public final TwitterButton M0;
    public final TypefacesTextView N0;
    public final SwitchCompat O0;
    public final ImageView P0;
    public final rhh<g5o> Q0;
    
    public p4o(View viewById, final l4o e0, final mjo f0, final UserIdentifier g0) {
        czd.f((Object)viewById, "rootView");
        czd.f((Object)e0, "scheduledSpaceEditDelegate");
        czd.f((Object)f0, "roomUtilsFragmentViewEventDispatcher");
        czd.f((Object)g0, "userIdentifier");
        this.D0 = viewById;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = viewById.getContext();
        this.I0 = (ImageView)viewById.findViewById(2131431199);
        final View viewById2 = viewById.findViewById(2131431203);
        czd.e((Object)viewById2, "rootView.findViewById(R.\u2026cheduled_space_edit_name)");
        this.J0 = (TwitterEditText)viewById2;
        final View viewById3 = viewById.findViewById(2131431202);
        czd.e((Object)viewById3, "rootView.findViewById(R.\u2026cheduled_space_edit_date)");
        this.K0 = (TwitterEditText)viewById3;
        final View viewById4 = viewById.findViewById(2131431205);
        czd.e((Object)viewById4, "rootView.findViewById(R.\u2026cheduled_space_edit_time)");
        this.L0 = (TwitterEditText)viewById4;
        final View viewById5 = viewById.findViewById(2131431201);
        czd.e((Object)viewById5, "rootView.findViewById(R.\u2026space_edit_cancel_button)");
        this.M0 = (TwitterButton)viewById5;
        final View viewById6 = viewById.findViewById(2131431204);
        czd.e((Object)viewById6, "rootView.findViewById(R.\u2026d_space_edit_save_button)");
        this.N0 = (TypefacesTextView)viewById6;
        final View viewById7 = viewById.findViewById(2131430928);
        czd.e((Object)viewById7, "rootView.findViewById(R.id.recording_layout)");
        final RelativeLayout relativeLayout = (RelativeLayout)viewById7;
        final View viewById8 = viewById.findViewById(2131430925);
        czd.e((Object)viewById8, "rootView.findViewById(R.id.record_toggle)");
        this.O0 = (SwitchCompat)viewById8;
        viewById = viewById.findViewById(2131430927);
        czd.e((Object)viewById, "rootView.findViewById(R.id.recording_info)");
        this.P0 = (ImageView)viewById;
        int visibility;
        if (djo.x()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)relativeLayout).setVisibility(visibility);
        this.Q0 = (rhh<g5o>)q3j.g0((qsb)new p4o$n(this));
    }
    
    public final void T(final jbx jbx) {
        final g5o g5o = (g5o)jbx;
        czd.f((Object)g5o, "state");
        this.Q0.b((Object)g5o);
    }
    
    public final void q(final Object o) {
        final m4o m4o = (m4o)o;
        czd.f((Object)m4o, "effect");
        if (m4o instanceof m4o$h) {
            ((TextView)this.J0).setText((CharSequence)((m4o$h)m4o).a);
        }
        else if (m4o instanceof m4o$f) {
            are.c(this.D0);
        }
        else if (m4o instanceof m4o$a) {
            this.E0.a();
        }
        else if (m4o instanceof m4o$b) {
            this.E0.b();
        }
        else if (m4o instanceof m4o$j) {
            are.c(this.D0);
            this.E0.d(((m4o$j)m4o).a, (TextView)this.K0);
        }
        else if (m4o instanceof m4o$m) {
            are.c(this.D0);
            this.E0.e(((m4o$m)m4o).a, (TextView)this.L0);
        }
        else if (m4o instanceof m4o$i) {
            final l4o e0 = this.E0;
            final l4o$a companion = l4o.Companion;
            e0.c((nnl)null);
        }
        else if (m4o instanceof m4o$k) {
            final l4o e2 = this.E0;
            final pmg f = e2.f;
            f.s(2131957400);
            f.m(2131957395);
            ((Dialog)f.n(2131957398, (DialogInterface$OnClickListener)null).p(2131957399, (DialogInterface$OnClickListener)new oy9((Object)e2, 2)).create()).show();
        }
        else if (m4o instanceof m4o$d) {
            final l4o e3 = this.E0;
            final gfo b = e3.b;
            final String string = e3.a.getResources().getString(2131957396);
            czd.e((Object)string, "activity.resources.getSt\u2026_alert_edit_confirmation)");
            b.d(string, Integer.valueOf(51));
        }
        else if (m4o instanceof m4o$e) {
            final gfo b2 = this.E0.b;
            final w5s$a w5s$a = new w5s$a();
            w5s$a.s(2131957397);
            w5s$a.e = (red$c)red$c$b.b;
            w5s$a.r("");
            w5s$a.q(31);
            b2.f((w5s)((n4j)w5s$a).e());
        }
        else if (m4o instanceof m4o$c) {
            fu8.o((String)null, (Integer)null, false, 7, this.F0);
        }
        else if (m4o instanceof m4o$l) {
            final Context h0 = this.H0;
            czd.e((Object)h0, "context");
            ((Dialog)new wwn(h0, true)).show();
        }
        else if (m4o instanceof m4o$g && djo.Q(this.G0)) {
            final Context h2 = this.H0;
            czd.e((Object)h2, "context");
            ((Dialog)new wwn(h2, true)).show();
        }
    }
    
    public final h5j<o4o> w() {
        final h5j map = ((h5j)mru.r((TextView)this.J0)).map((psb)new wtn((qsb)p4o$e.D0, 23));
        final h5j map2 = max.h((View)this.J0).map((psb)new abr((qsb)p4o$f.D0, 10));
        final ImageView i0 = this.I0;
        czd.e((Object)i0, "backButton");
        final h5j mergeArray = h5j.mergeArray(new taj[] { (taj)map, (taj)map2, (taj)max.h((View)i0).map((psb)new ncr((qsb)p4o$g.D0, 6)), (taj)max.h((View)this.K0).map((psb)new byn((qsb)p4o$h.D0, 16)), (taj)max.h((View)this.L0).map((psb)new h3o((qsb)p4o$i.D0, 16)), (taj)max.h((View)this.M0).map((psb)new cyn((qsb)p4o$j.D0, 17)), (taj)max.h((View)this.N0).map((psb)new hpn((qsb)p4o$k.D0, 21)), (taj)max.h((View)this.P0).map((psb)new b9n((qsb)p4o$l.D0, 21)), (taj)((h5j)this.E0.c).map((psb)new wtn((qsb)p4o$m.D0, 24)), (taj)((h5j)this.E0.d).map((psb)new bon((qsb)p4o$b.D0, 18)), (taj)((h5j)this.E0.e).map((psb)new bon((qsb)new p4o$c(this), 17)), (taj)max.h((View)this.O0).map((psb)new k2o((qsb)p4o$d.D0, 14)) });
        czd.e((Object)mergeArray, "override fun userIntentO\u2026ingButtonToggled },\n    )");
        return (h5j<o4o>)mergeArray;
    }
}
