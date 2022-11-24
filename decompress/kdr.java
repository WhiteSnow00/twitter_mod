import android.widget.TextView;
import java.util.List;
import android.net.Uri;
import android.content.Context;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.PopupWindow;
import android.view.ViewGroup;
import java.util.Objects;
import android.view.View;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.widget.Button;
import com.twitter.common.ui.settings.StationPodcastSettingsView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdr implements xlx<her, idr, hdr>
{
    private static final b Companion;
    public final fci<?> F0;
    public final zl1 G0;
    public final hlm H0;
    public final ex8 I0;
    public final znl<idr> J0;
    public final ImageView K0;
    public final ImageView L0;
    public final ImageView M0;
    public final TypefacesTextView N0;
    public final TypefacesTextView O0;
    public final SeekBar P0;
    public final ProgressBar Q0;
    public final ImageView R0;
    public final ynl<vzv> S0;
    public final hvn<StationPodcastSettingsView> T0;
    public final Button U0;
    public final ImageView V0;
    public final TypefacesTextView W0;
    public final TypefacesTextView X0;
    public final TypefacesTextView Y0;
    public final TypefacesTextView Z0;
    public final FrescoMediaImageView a1;
    public final fih<her> b1;
    
    static {
        Companion = new b();
    }
    
    public kdr(final View view, final fci<?> f0, final zl1 g0, final hlm h0, final ex8 i0) {
        e0e.f((Object)view, "rootView");
        e0e.f((Object)f0, "navigator");
        e0e.f((Object)h0, "reportPodcastActionSheetHelper");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = (znl<idr>)new znl();
        final View viewById = view.findViewById(2131432107);
        e0e.e((Object)viewById, "rootView.findViewById(R.id.toggle_playback)");
        this.K0 = (ImageView)viewById;
        final View viewById2 = view.findViewById(2131431666);
        e0e.e((Object)viewById2, "rootView.findViewById(R.id.speed_ahead)");
        this.L0 = (ImageView)viewById2;
        final View viewById3 = view.findViewById(2131430996);
        e0e.e((Object)viewById3, "rootView.findViewById(id.rewind)");
        this.M0 = (ImageView)viewById3;
        final View viewById4 = view.findViewById(2131430612);
        e0e.e((Object)viewById4, "rootView.findViewById(R.id.playback_progress)");
        this.N0 = (TypefacesTextView)viewById4;
        final View viewById5 = view.findViewById(2131432041);
        e0e.e((Object)viewById5, "rootView.findViewById(R.id.time_left)");
        this.O0 = (TypefacesTextView)viewById5;
        final View viewById6 = view.findViewById(2131431255);
        e0e.e((Object)viewById6, "rootView.findViewById(R.id.scrubber)");
        final SeekBar p5 = (SeekBar)viewById6;
        this.P0 = p5;
        final View viewById7 = view.findViewById(2131429857);
        e0e.e((Object)viewById7, "rootView.findViewById(loading_progress_bar)");
        this.Q0 = (ProgressBar)viewById7;
        final ymn ymn = new ymn(view);
        this.R0 = ymn.f;
        final ynl s0 = new ynl();
        this.S0 = (ynl<vzv>)s0;
        final hvn$a companion = hvn.Companion;
        final Context context = view.getContext();
        e0e.e((Object)context, "rootView.context");
        Objects.requireNonNull(companion);
        final View inflate = View.inflate(context, 2131625724, (ViewGroup)null);
        final d7o d7o = (d7o)inflate.findViewById(2131431728);
        final PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, true);
        popupWindow.setElevation(inflate.getElevation());
        popupWindow.setOnDismissListener((PopupWindow$OnDismissListener)new gvn(s0));
        e0e.e((Object)d7o, "roomSettingsView");
        this.T0 = (hvn<StationPodcastSettingsView>)new hvn(popupWindow, d7o);
        this.U0 = ymn.d;
        this.V0 = ymn.a;
        final View viewById8 = view.findViewById(2131428966);
        e0e.e((Object)viewById8, "rootView.findViewById(id.episode_description)");
        this.W0 = (TypefacesTextView)viewById8;
        final View viewById9 = view.findViewById(2131430895);
        e0e.e((Object)viewById9, "rootView.findViewById(id.read_more_text)");
        this.X0 = (TypefacesTextView)viewById9;
        final View viewById10 = view.findViewById(2131428968);
        e0e.e((Object)viewById10, "rootView.findViewById(id.episode_title)");
        this.Y0 = (TypefacesTextView)viewById10;
        final View viewById11 = view.findViewById(2131431518);
        e0e.e((Object)viewById11, "rootView.findViewById(id.social_proof)");
        this.Z0 = (TypefacesTextView)viewById11;
        final View viewById12 = view.findViewById(2131427735);
        e0e.e((Object)viewById12, "rootView.findViewById(id.avatar)");
        this.a1 = (FrescoMediaImageView)viewById12;
        ((TextView)ymn.d).setText(2131952079);
        ((View)ymn.g).setVisibility(4);
        final Context context2 = view.getContext();
        e0e.e((Object)context2, "rootView.context");
        ak1.c(ymn, context2);
        ((View)ymn.e).setVisibility(4);
        ((View)ymn.b).setAlpha(0.0f);
        p5.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new SeekBar$OnSeekBarChangeListener(this) {
            public final kdr a;
            
            public final void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
            }
            
            public final void onStartTrackingTouch(final SeekBar seekBar) {
                e0e.f((Object)seekBar, "seekBar");
                this.a.J0.onNext((Object)idr$f.a);
            }
            
            public final void onStopTrackingTouch(final SeekBar seekBar) {
                e0e.f((Object)seekBar, "seekBar");
                this.a.J0.onNext((Object)new idr$e((long)((ProgressBar)seekBar).getProgress()));
            }
        });
        this.b1 = (fih<her>)ma7.S((stb)new kdr$l(this, view));
    }
    
    public final void T(final ccx ccx) {
        final her her = (her)ccx;
        e0e.f((Object)her, "state");
        this.b1.b((Object)her);
    }
    
    public final void a() {
        this.T0.a();
    }
    
    public final void r(final Object o) {
        final hdr hdr = (hdr)o;
        e0e.f((Object)hdr, "effect");
        if (hdr instanceof hdr.a) {
            final ex8 i0 = this.I0;
            if (i0 != null) {
                i0.E0();
            }
        }
        else if (hdr instanceof hdr.e) {
            final ImageView r0 = this.R0;
            e0e.f((Object)r0, "button");
            ((View)r0).animate().alpha(0.5f).setDuration(300L).start();
            final hvn<StationPodcastSettingsView> t0 = this.T0;
            final ImageView r2 = this.R0;
            t0.b((View)r2, (View)r2, (hub)new ldr(this));
        }
        else if (hdr instanceof hdr.c) {
            this.a();
            final String string = ((Context)this.G0).getString(2131957119);
            e0e.e((Object)string, "activity.getString(R.str\u2026pyright_infringement_url)");
            final fci<?> f0 = this.F0;
            final Uri parse = Uri.parse(string);
            e0e.e((Object)parse, "parse(url)");
            f0.d((cn)new mnx(parse));
        }
        else if (hdr instanceof hdr.d) {
            this.a();
            final hlm h0 = this.H0;
            final hdr.d d = (hdr.d)hdr;
            final String a = d.a;
            final String b = d.b;
            final long c = d.c;
            Objects.requireNonNull(h0);
            e0e.f((Object)a, "podcastId");
            e0e.f((Object)b, "episodeId");
            final List z = xd.Z(h0.b);
            final gm$b gm$b = new gm$b();
            ((z92$a)gm$b).b = h0.b.getString(2131957137);
            final int a2 = o5j.a;
            ((z92$a)gm$b).a = h0.b.getString(2131957049);
            ((ojf)gm$b.h).q((Iterable)z);
            final ul$b ul$b = new ul$b(0);
            ((pmp$a)ul$b).z(((z4j)gm$b).e());
            final bl1 w = ((cl1$a)ul$b).w();
            w.W1 = (dx8)new glm(z, h0, a, b, c);
            w.e2(((dob)h0.a).P(), "TAG_ROOM_ACTION_SHEET");
        }
        else if (hdr instanceof hdr.b) {
            this.a();
        }
    }
    
    public final t5j<idr> w() {
        final t5j mergeArray = t5j.mergeArray(new fbj[] { (fbj)vq9.a((View)this.V0).map((rtb)new xcn((stb)kdr$d.F0, 11)), (fbj)vq9.a((View)this.U0).map((rtb)new d3o((stb)kdr$e.F0, 5)), (fbj)vq9.a((View)this.K0).map((rtb)new ter((stb)kdr$f.F0, 2)), (fbj)vq9.a((View)this.L0).map((rtb)new wsn((stb)kdr$g.F0, 28)), (fbj)vq9.a((View)this.M0).map((rtb)new t8o((stb)kdr$h.F0, 11)), (fbj)too.f((View)this.R0).map((rtb)new a4o((stb)kdr$i.F0, 7)), (fbj)((t5j)((d7o)this.T0.b).H0).map((rtb)new vyn((stb)kdr$j.F0, 9)), (fbj)((t5j)this.S0).map((rtb)new uyn((stb)kdr$k.F0, 10)), (fbj)this.J0 });
        e0e.e((Object)mergeArray, "mergeArray(\n        dock\u2026     intentSubject,\n    )");
        return (t5j<idr>)mergeArray;
    }
    
    public static final class b
    {
    }
    
    public interface c
    {
        kdr a(final View p0);
    }
}
