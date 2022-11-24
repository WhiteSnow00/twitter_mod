import android.net.Uri;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.Objects;
import android.view.View;
import android.content.res.Resources;
import android.app.Activity;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y1g implements View$OnClickListener
{
    public final int F0;
    public final Activity G0;
    public final Object H0;
    public final Object I0;
    public final Object J0;
    
    public y1g(final String h0, final Activity g0, final Resources j0) {
        this.F0 = 0;
        this.H0 = h0;
        this.I0 = "contacts_sync_prompt";
        this.G0 = g0;
        this.J0 = j0;
    }
    
    public y1g(final ol3 h0, final u0x i0, final h1 j0, final Activity g0) {
        this.F0 = 1;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.G0 = g0;
    }
    
    public final void onClick(final View view) {
        switch (this.F0) {
            default: {
                final ol3 ol3 = (ol3)this.H0;
                final u0x u0x = (u0x)this.I0;
                final h1 e = (h1)this.J0;
                final Activity g0 = this.G0;
                Objects.requireNonNull(ol3);
                if (nb8.a().b()) {
                    final lk3 i0 = ol3.I0;
                    if (i0 != null) {
                        i0.s(ijl.G1);
                    }
                    final u0x c = u0x.c();
                    c.e = e;
                    final int a = o5j.a;
                    c.d = true;
                    c.b((Context)g0);
                }
                return;
            }
            case 0: {
                final String s = (String)this.H0;
                final String s2 = (String)this.I0;
                final Activity g2 = this.G0;
                final Resources resources = (Resources)this.J0;
                final UserIdentifier current = UserIdentifier.getCurrent();
                final sfv sfv = new sfv();
                ((f0p)sfv).c(s);
                ((f0p)sfv).d("address_book");
                sbw.b((tlm)new a8d((Object)current, (Object)sfv, (j98)null).k(s2, "learn_more", "click"));
                g2.startActivity(fn.a().a((Context)g2, (cn)new mnx(Uri.parse(resources.getString(2131959412)))));
            }
        }
    }
}
