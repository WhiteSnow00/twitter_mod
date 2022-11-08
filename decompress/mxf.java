import com.twitter.util.InvalidDataException;
import java.util.Objects;
import android.view.View$OnClickListener;
import android.os.Parcelable;
import android.os.Bundle;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mxf extends e7x implements hxf
{
    public final gxf H0;
    public final lxf I0;
    public final t0p J0;
    public boolean K0;
    
    public mxf(final z7x z7x, final sso sso, final gxf h0, final lxf i0, final View view) {
        super(z7x);
        this.C1(view.findViewById(2131431150));
        this.H0 = h0;
        h0.h = (hxf)this;
        this.I0 = i0;
        this.J0 = new t0p((Object)this, 1);
        sso.a((vro)new jt2() {
            public final void a(final Bundle bundle) {
                bundle.putBoolean("reminder_impression_logged", mxf.this.K0);
            }
            
            public final String getId() {
                return Integer.toString(mxf.this.I0.hashCode());
            }
            
            public final void v(final Parcelable parcelable) {
                mxf.this.K0 = ((Bundle)parcelable).getBoolean("reminder_impression_logged", false);
            }
        });
        if (!h0.g.b()) {
            h0.g.c((j29)((b5j)((ggm)h0.d).C0).subscribeWith((wbj)new exf(h0)));
        }
    }
    
    public final void Q(final boolean b) {
        this.I0.a(b ^ true);
    }
    
    public final void T() {
        this.I0.b((View$OnClickListener)this.J0);
        if (!this.K0) {
            final gxf h0 = this.H0;
            final qof i = h0.i;
            if (i != null) {
                final jxf d = h0.a.d(i.a);
                if (d != null) {
                    if (d.b()) {
                        final ixf e = h0.e;
                        Objects.requireNonNull(e);
                        final nca e2 = nca.Companion.e("live_event_timeline", "", "", "reminder_button", "impression");
                        final txf txf = new txf(e.a.eventId);
                        txf.e = null;
                        txf.f = d;
                        final lev a = txf.a();
                        final zf4 zf4 = new zf4();
                        zf4.i((szo)a);
                        zf4.T = e2.toString();
                        final int a2 = w4j.a;
                        saw.b((okm)zf4);
                    }
                    else {
                        e9a.d((Throwable)new InvalidDataException("Subscription should be visible but it is hidden"));
                    }
                }
            }
            this.K0 = true;
        }
    }
    
    public final void V0(final boolean b) {
        this.I0.c(b);
    }
    
    @Override
    public final void w1() {
        this.H0.h = (hxf)hxf.R;
    }
    
    public final void x() {
        this.I0.x();
    }
}
