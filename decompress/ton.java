import androidx.appcompat.app.e;
import androidx.appcompat.app.f;
import android.widget.TextView;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import android.view.View;
import android.widget.ImageView;
import android.widget.FrameLayout;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ton implements xlx<gpn, son, pon>
{
    public final zl1 F0;
    public final gpq G0;
    public final ex8 H0;
    public final zv1 I0;
    public final TypefacesTextView J0;
    public final FrameLayout K0;
    public final TypefacesTextView L0;
    public final TypefacesTextView M0;
    public final TypefacesTextView N0;
    public final ImageView O0;
    public final znl<vzv> P0;
    public final fih<gpn> Q0;
    
    public ton(View viewById, final zl1 f0, final gpq g0, final ex8 h0, final zv1 i0) {
        e0e.f((Object)viewById, "rootView");
        e0e.f((Object)g0, "spacesCardFactory");
        e0e.f((Object)h0, "dialogNavigationDelegate");
        e0e.f((Object)i0, "behavioralEventHelper");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        final View viewById2 = viewById.findViewById(2131430919);
        e0e.e((Object)viewById2, "rootView.findViewById(R.id.reconnect_button)");
        this.J0 = (TypefacesTextView)viewById2;
        final View viewById3 = viewById.findViewById(2131431578);
        e0e.e((Object)viewById3, "rootView.findViewById(R.id.spaces_card_view)");
        this.K0 = (FrameLayout)viewById3;
        final View viewById4 = viewById.findViewById(2131428948);
        e0e.e((Object)viewById4, "rootView.findViewById(R.id.end_space_button)");
        this.L0 = (TypefacesTextView)viewById4;
        final View viewById5 = viewById.findViewById(2131430526);
        e0e.e((Object)viewById5, "rootView.findViewById(R.id.participants_label)");
        this.M0 = (TypefacesTextView)viewById5;
        final View viewById6 = viewById.findViewById(2131431538);
        e0e.e((Object)viewById6, "rootView.findViewById(R.id.space_ending_warning)");
        this.N0 = (TypefacesTextView)viewById6;
        viewById = viewById.findViewById(2131428972);
        e0e.e((Object)viewById, "rootView.findViewById(R.id.error_icon)");
        this.O0 = (ImageView)viewById;
        this.P0 = (znl<vzv>)new znl();
        this.Q0 = (fih<gpn>)ma7.S((stb)new ton$e(this));
    }
    
    public final void T(final ccx ccx) {
        final gpn gpn = (gpn)ccx;
        e0e.f((Object)gpn, "state");
        this.Q0.b((Object)gpn);
    }
    
    public final void a(long seconds) {
        final g5s a = nq1.a;
        seconds -= System.currentTimeMillis();
        if (seconds > 1000L) {
            seconds = TimeUnit.MILLISECONDS.toSeconds(seconds);
            ((TextView)this.N0).setText((CharSequence)((f)this.F0).getResources().getString(2131954331, new Object[] { String.valueOf(seconds) }));
        }
        else {
            ((TextView)this.N0).setText((CharSequence)((f)this.F0).getResources().getString(2131954332));
        }
    }
    
    public final void r(final Object o) {
        final pon pon = (pon)o;
        e0e.f((Object)pon, "effect");
        if (pon instanceof pon.b) {
            qjy.D((Context)this.F0, this.P0, ((pon.b)pon).a);
        }
        else if (pon instanceof pon.a) {
            this.H0.E0();
        }
        else if (pon instanceof pon.c) {
            final jng jng = new jng((Context)this.F0, 0);
            ((e.a)jng).a.g = ((f)this.F0).getResources().getString(2131954327);
            jng.q((CharSequence)((f)this.F0).getResources().getString(2131957273), (DialogInterface$OnClickListener)null);
            ((e.a)jng).k();
        }
        else if (pon instanceof pon.d) {
            this.a(((pon.d)pon).a);
        }
    }
    
    public final t5j<son> w() {
        final t5j merge = t5j.merge((fbj)too.f((View)this.J0).map((rtb)new xcn((stb)ton$b.F0, 1)), (fbj)too.f((View)this.L0).map((rtb)new x0i((stb)ton$c.F0, 25)), (fbj)((t5j)this.P0).map((rtb)new kzf((stb)ton$d.F0, 24)));
        e0e.e((Object)merge, "merge(\n            recon\u2026rmedEndSpace },\n        )");
        return (t5j<son>)merge;
    }
}
