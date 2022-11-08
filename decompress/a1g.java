import android.widget.TextView;
import android.view.View;
import com.twitter.util.user.UserIdentifier;
import android.view.View$OnClickListener;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a1g implements xxp<y0g>
{
    public final fft a;
    public final uuy b;
    public a1g.a1g$a c;
    
    public a1g(final fft a, final uuy b) {
        this.a = a;
        this.b = b;
    }
    
    public static a1g d(final Context context, final fft fft, final hfv hfv, final ocw ocw) {
        return new a1g(fft, new uuy(context, ocw, new oi((pi)new qi(aav.d2(ocw.k()), psc.c(), hfv, (hil)null, (pba)null))));
    }
    
    @Override
    public final void a(final wxp wxp) {
        final y0g y0g = (y0g)wxp;
        final UserIdentifier f = y0g.a.f();
        final boolean q = bgl.q(y0g.a.f(), y0g.a.J0, y0g.b);
        this.c(q, tdy.e0(y0g.a.H1), tdy.i0(y0g.a.H1));
        ((View)this.a.a).setOnClickListener((View$OnClickListener)new z0g(this, f, q));
    }
    
    @Override
    public final int b() {
        return 2;
    }
    
    public final void c(final boolean b, final boolean b2, final boolean toggledOn) {
        if (!b && b2) {
            this.a.c();
            this.a.a.setToggledOn(toggledOn);
            if (toggledOn) {
                ((TextView)this.a.a).setText((CharSequence)"");
            }
            else {
                this.a.b(2131954794);
            }
        }
        else {
            this.a.a();
        }
    }
    
    public final void e() {
        this.a.a();
    }
    
    public final void f() {
        this.a.c();
    }
    
    @Override
    public final View getActionView() {
        return (View)this.a.a;
    }
}
