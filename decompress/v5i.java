import java.util.Objects;
import android.widget.TextView;
import com.google.android.material.timepicker.c;
import java.util.Calendar;
import android.content.Context;
import com.twitter.ui.widget.TintableImageView;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v5i implements View$OnClickListener
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    public final Object J0;
    
    public v5i(final Object g0, final Object h0, final Object i0, final Object j0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public v5i(final ll1 g0, final b1p h0, final String j0, final String i0) {
        this.F0 = 3;
        this.G0 = g0;
        this.H0 = h0;
        this.J0 = j0;
        this.I0 = i0;
    }
    
    public final void onClick(final View view) {
        switch (this.F0) {
            default: {
                final ll1 ll1 = (ll1)this.G0;
                final b1p b1p = (b1p)this.H0;
                final String s = (String)this.J0;
                final String s2 = (String)this.I0;
                e0e.f((Object)ll1, "this$0");
                e0e.f((Object)s, "$topicName");
                e0e.f((Object)s2, "$topicId");
                ll1.N0.g(b1p, s);
                ll1.K0.c(s2, s, ll1.N0.b(b1p));
                return;
            }
            case 2: {
                final sfr sfr = (sfr)this.G0;
                final TintableImageView tintableImageView = (TintableImageView)this.H0;
                final Context context = (Context)this.I0;
                final x21 x21 = (x21)this.J0;
                e0e.f((Object)sfr, "this$0");
                e0e.f((Object)tintableImageView, "$setReminderView");
                e0e.f((Object)context, "$context");
                e0e.f((Object)x21, "$space");
                sfr.o(tintableImageView, context);
                sfr.e.q(x21, (stb)new sfr$c(sfr, x21, tintableImageView, context));
                return;
            }
            case 1: {
                final Calendar calendar = (Calendar)this.G0;
                final c c = (c)this.H0;
                final TextView textView = (TextView)this.I0;
                final znl znl = (znl)this.J0;
                e0e.f((Object)calendar, "$scheduledTime");
                e0e.f((Object)c, "$timePicker");
                e0e.f((Object)textView, "$timeTextView");
                e0e.f((Object)znl, "$onCalendarChanged");
                final Object clone = calendar.clone();
                e0e.d(clone, "null cannot be cast to non-null type java.util.Calendar");
                final Calendar calendar2 = (Calendar)clone;
                calendar2.set(11, c.m2.I0 % 24);
                calendar2.set(12, c.m2.J0);
                Objects.requireNonNull(e5o.Companion);
                textView.setText((CharSequence)e5o.h.format(calendar2.getTime()));
                znl.onNext((Object)amz.o(calendar2));
                return;
            }
            case 0: {
                final w5i w5i = (w5i)this.G0;
                final ocj ocj = (ocj)this.H0;
                final rsw rsw = (rsw)this.I0;
                final String s3 = (String)this.J0;
                e0e.f((Object)w5i, "this$0");
                e0e.f((Object)ocj, "$eventEmitter");
                e0e.f((Object)rsw, "$session");
                e0e.f((Object)s3, "$address");
                final z5i u0 = w5i.U0;
                final String s4 = null;
                String o = null;
                Label_0368: {
                    if (u0 != null) {
                        final int a = u0.a;
                        if (a != 0) {
                            o = z9a.o(a);
                            break Label_0368;
                        }
                    }
                    o = null;
                }
                sbw.b((tlm)new q0i$i0(o));
                ocj.onNext((Object)new g3i$b(rsw, s3));
                final z5i u2 = w5i.U0;
                String o2 = s4;
                if (u2 != null) {
                    final int a2 = u2.a;
                    o2 = s4;
                    if (a2 != 0) {
                        o2 = z9a.o(a2);
                    }
                }
                sbw.b((tlm)new q0i$k0(o2));
                w5i.X0.setText(2131955406);
                final TextView w0 = w5i.W0;
                e0e.e((Object)w0, "addressView");
                ((View)w0).setVisibility(8);
                final TextView y0 = w5i.Y0;
                e0e.e((Object)y0, "confirmButton");
                ((View)y0).setVisibility(8);
                final TextView z0 = w5i.Z0;
                e0e.e((Object)z0, "cancelButton");
                ((View)z0).setVisibility(0);
            }
        }
    }
}
