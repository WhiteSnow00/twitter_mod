import com.twitter.app.common.account.a$b;
import android.accounts.Account;
import com.twitter.app.common.account.AppAccountManager$c;
import com.twitter.app.common.account.a;
import com.twitter.app.common.account.AppAccountManager;
import com.twitter.app.common.account.b;
import java.util.Objects;
import com.twitter.app.common.account.c;
import com.twitter.app.common.account.d;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n5g implements sj
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    
    public n5g(final Object h0, final Object i0, final Object g0, final int f0) {
        this.F0 = f0;
        this.H0 = h0;
        this.I0 = i0;
        this.G0 = g0;
    }
    
    public n5g(final k3u h0, final String g0, final cvr$a i0) {
        this.F0 = 1;
        this.H0 = h0;
        this.G0 = g0;
        this.I0 = i0;
    }
    
    public final void run() {
        switch (this.F0) {
            default: {
                final nh4 nh4 = (nh4)this.H0;
                final gn6 gn6 = (gn6)this.I0;
                final dn6 dn6 = (dn6)this.G0;
                e0e.f((Object)nh4, "this$0");
                e0e.f((Object)dn6, "$contentRemover");
                final long b = nh4.b.b();
                if (gn6 != null) {
                    gn6.b(dn6);
                }
                dn6.a();
                if (gn6 != null) {
                    gn6.c(dn6, nh4.b.b() - b);
                }
                return;
            }
            case 3: {
                final jku jku = (jku)this.H0;
                final kju kju = (kju)this.I0;
                final fcq fcq = (fcq)this.G0;
                ((gku)jku.a).a((s5d)kju);
                ((mbq$a)fcq).b((Object)Boolean.TRUE);
                return;
            }
            case 2: {
                final oq oq = (oq)this.H0;
                final kq kq = (kq)this.I0;
                final Context context = (Context)this.G0;
                final nq value = oq.get();
                pp.a();
                if (!kq.a(value)) {
                    pp.c(value);
                }
                vq9.p(context, UserIdentifier.getCurrent(), "app::::launch", true);
                return;
            }
            case 1: {
                ((k3u)this.H0).b((String)this.G0, (cvr$a)this.I0);
                return;
            }
            case 0: {
                final d d = (d)this.H0;
                final c c = (c)this.I0;
                final String s = (String)this.G0;
                Objects.requireNonNull(d);
                fj1.f();
                final a a = ((AppAccountManager)d).a(s, (AppAccountManager$c)new b((AppAccountManager)d, ((a)c).b, (a)c), true);
                if (a != null) {
                    a.e.set(((a)c).e.getAndSet(a.e()));
                    ((a)c).j(a$b.G0);
                    ((AppAccountManager)d).g(a, true);
                }
            }
        }
    }
}
