import android.app.Dialog;
import android.content.Context;
import android.app.Activity;
import android.widget.RelativeLayout;
import android.view.ViewGroup;
import android.view.View;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import androidx.appcompat.widget.SwitchCompat;
import android.widget.TextView;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f3o implements xlx<w3o, y2o, x2o>
{
    public final zl1 F0;
    public final psn G0;
    public final zfo H0;
    public final e5o I0;
    public final ImageView J0;
    public final TextView K0;
    public final TextView L0;
    public final TextView M0;
    public final TextView N0;
    public final TextView O0;
    public final SwitchCompat P0;
    public final ImageView Q0;
    public final TypefacesTextView R0;
    public final fih<w3o> S0;
    
    public f3o(View viewById, final zl1 f0, final psn g0, final zfo h0, final e5o i0) {
        e0e.f((Object)viewById, "rootView");
        e0e.f((Object)g0, "roomNotificationSettingsChecker");
        e0e.f((Object)h0, "roomToaster");
        e0e.f((Object)i0, "roomScheduledSpaceEditDelegate");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        final View viewById2 = viewById.findViewById(2131431020);
        e0e.e((Object)viewById2, "rootView.findViewById(R.\u2026om_audio_space_container)");
        final ViewGroup viewGroup = (ViewGroup)viewById2;
        final View viewById3 = viewById.findViewById(2131431183);
        e0e.e((Object)viewById3, "rootView.findViewById(R.\u2026chedule_room_back_button)");
        this.J0 = (ImageView)viewById3;
        final View viewById4 = viewById.findViewById(2131431184);
        e0e.e((Object)viewById4, "rootView.findViewById(R.\u2026chedule_room_description)");
        this.K0 = (TextView)viewById4;
        final View viewById5 = viewById.findViewById(2131431187);
        e0e.e((Object)viewById5, "rootView.findViewById(R.\u2026hedule_space_date_button)");
        this.L0 = (TextView)viewById5;
        final View viewById6 = viewById.findViewById(2131431192);
        e0e.e((Object)viewById6, "rootView.findViewById(R.\u2026hedule_space_time_button)");
        this.M0 = (TextView)viewById6;
        final View viewById7 = viewById.findViewById(2131431189);
        e0e.e((Object)viewById7, "rootView.findViewById(R.\u2026hedule_space_next_button)");
        this.N0 = (TextView)viewById7;
        final View viewById8 = viewById.findViewById(2131431191);
        e0e.e((Object)viewById8, "rootView.findViewById(R.\u2026ule_space_tickets_button)");
        this.O0 = (TextView)viewById8;
        final View viewById9 = viewById.findViewById(2131430929);
        e0e.e((Object)viewById9, "rootView.findViewById(R.id.recording_layout)");
        final RelativeLayout relativeLayout = (RelativeLayout)viewById9;
        final View viewById10 = viewById.findViewById(2131430926);
        e0e.e((Object)viewById10, "rootView.findViewById(R.id.record_toggle)");
        this.P0 = (SwitchCompat)viewById10;
        final View viewById11 = viewById.findViewById(2131430928);
        e0e.e((Object)viewById11, "rootView.findViewById(R.id.recording_info)");
        this.Q0 = (ImageView)viewById11;
        viewById = viewById.findViewById(2131429948);
        e0e.e((Object)viewById, "rootView.findViewById(R.\u2026ax_scheduled_spaces_text)");
        this.R0 = (TypefacesTextView)viewById;
        qjy.c((View)viewGroup, (stb)f3o$a.F0);
        int visibility;
        if (vjo.x()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)relativeLayout).setVisibility(visibility);
        this.S0 = (fih<w3o>)ma7.S((stb)new f3o$l(this));
    }
    
    public final void T(final ccx ccx) {
        final w3o w3o = (w3o)ccx;
        e0e.f((Object)w3o, "state");
        this.S0.b((Object)w3o);
    }
    
    public final void r(final Object o) {
        final x2o x2o = (x2o)o;
        e0e.f((Object)x2o, "effect");
        if (x2o instanceof x2o.a) {
            final psn g0 = this.G0;
            g0.b.b((Activity)g0.a, new qw8(2131957423, 2131957419, 2131957420, 2131957421));
        }
        else if (x2o instanceof x2o.b) {
            final zfo h0 = this.H0;
            final Context context = ((View)this.N0).getContext();
            e0e.e((Object)context, "nextButton.context");
            bs4.u(h0, context, ((x2o.b)x2o).a);
        }
        else if (x2o instanceof x2o.c) {
            ((Dialog)new oxn((Context)this.F0, true)).show();
        }
    }
    
    public final t5j<y2o> w() {
        final t5j merge = t5j.merge((Iterable)shw.y0((Object[])new t5j[] { vq9.a((View)this.J0).map((rtb)new t8o((stb)f3o$c.F0, 8)), vq9.a((View)this.L0).map((rtb)new a4o((stb)f3o$d.F0, 1)), vq9.a((View)this.M0).map((rtb)new vyn((stb)f3o$e.F0, 3)), vq9.a((View)this.N0).map((rtb)new uyn((stb)f3o$f.F0, 3)), vq9.a((View)this.O0).map((rtb)new w1n((stb)f3o$g.F0, 9)), ((t5j)this.I0.c).map((rtb)new wcn((stb)f3o$h.F0, 6)), ((t5j)this.I0.c).map((rtb)new xcn((stb)f3o$i.F0, 6)), vq9.a((View)this.Q0).map((rtb)new d3o((stb)f3o$j.F0, 0)), vq9.a((View)this.P0).map((rtb)new kzf((stb)f3o$k.F0, 28)) }));
        e0e.e((Object)merge, "merge(\n        listOf(\n \u2026ggled },\n        ),\n    )");
        return (t5j<y2o>)merge;
    }
}
