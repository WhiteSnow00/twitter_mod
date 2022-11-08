import android.widget.ImageView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.content.Context;
import android.view.View;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u7o implements okx<f6n, o0n, e0n>
{
    public static final u7o.u7o$a Companion;
    public static final List<String> P0;
    public final View C0;
    public final qeu D0;
    public final gjo E0;
    public final rsn F0;
    public final yl1 G0;
    public final Context H0;
    public final TypefacesTextView I0;
    public final ImageView J0;
    public final u3s K0;
    public final u3s L0;
    public final int M0;
    public final u3s N0;
    public final mhh<f6n> O0;
    
    static {
        Companion = new u7o.u7o$a();
        P0 = tdy.v0((Object[])new String[] { "TAG_ROOM_CREATION_SHEET_FRAGMENT", "TAG_ROOM_SCHEDULED_DETAILS_SHEET_FRAGMENT", "RoomAudioSpaceFragmentContentViewArgs", "RoomMultiScheduledSpacesArgs", "TAG_ROOM_STATIONS_TAB_CONTROLLER_FRAGMENT" });
    }
    
    public u7o(View viewById, final qeu d0, final gjo e0, final rsn f0, final yl1 g0) {
        zzd.f((Object)viewById, "rootView");
        zzd.f((Object)d0, "tweetDetailActivityLauncher");
        zzd.f((Object)e0, "roomsScribeReporter");
        zzd.f((Object)f0, "roomNuxTooltipController");
        this.C0 = viewById;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        final Context context = viewById.getContext();
        this.H0 = context;
        final View viewById2 = viewById.findViewById(2131428505);
        zzd.e((Object)viewById2, "rootView.findViewById(R.id.counter)");
        this.I0 = (TypefacesTextView)viewById2;
        viewById = viewById.findViewById(2131429505);
        zzd.e((Object)viewById, "rootView.findViewById(R.id.icon)");
        this.J0 = (ImageView)viewById;
        this.K0 = (u3s)rp2.z0((otb)new u7o$e(this));
        this.L0 = (u3s)rp2.z0((otb)new u7o$c(this));
        this.M0 = eo6.b(context, 2131100880);
        this.N0 = (u3s)rp2.z0((otb)new u7o$d(this));
        this.O0 = (mhh<f6n>)ajy.a0((rtb)new u7o$g(this));
    }
    
    public final void T(final oax oax) {
        final f6n f6n = (f6n)oax;
        zzd.f((Object)f6n, "state");
        this.O0.b((Object)f6n);
    }
    
    public final void s(final Object o) {
        final e0n e0n = (e0n)o;
        zzd.f((Object)e0n, "effect");
        if (e0n instanceof e0n.f) {
            this.D0.a(((e0n.f)e0n).a).start();
        }
    }
    
    public final b5j<o0n> x() {
        final b5j map = kno.f(this.C0).map((qtb)new uii((rtb)u7o$f.C0, 24));
        zzd.e((Object)map, "rootView.throttledClicks\u2026ntityReplyButtonClicked }");
        return (b5j<o0n>)map;
    }
}
