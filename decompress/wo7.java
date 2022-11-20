import android.content.res.Resources;
import android.app.Dialog;
import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;
import android.annotation.SuppressLint;
import com.twitter.util.user.UserIdentifier;
import android.app.Activity;
import android.content.Context;
import com.twitter.dm.dialog.BaseConversationActionsDialog$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wo7 implements BaseConversationActionsDialog$a
{
    public final to7 a;
    public final qo7 b;
    public final int c;
    public final String d;
    public final cgv e;
    public final uj7 f;
    public final fp7$a g;
    
    public wo7(final to7 a, final qo7 b, final int c, final String d, final cgv e, final uj7 f, final fp7$a g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @SuppressLint({ "StringFormatInvalid" })
    public final void a() {
        final af4 af4 = new af4();
        ((u0p)af4).q(new String[] { "messages:inbox::thread:unmute_dm_thread" });
        cbw.b((elm)af4);
        final z9j p = this.a.p;
        final to7 a = this.a;
        final Activity a2 = a.a;
        final qo7 b = this.b;
        final UserIdentifier b2 = a.b;
        p.d((anm)new q3w((Context)a2, b, b2, this.d, false, 4, k28.Companion.a(b2).v2()));
    }
    
    public final void b() {
        final uj7 f = this.f;
        final boolean b = (f != null && f.c) ^ true;
        String s;
        if (b) {
            s = "messages:inbox:thread:pin_dm_conversation";
        }
        else {
            s = "messages:inbox:thread:unpin_dm_conversation";
        }
        final af4 af4 = new af4(new String[] { s });
        af4.w0 = this.d;
        af4.C0 = this.b.h.size();
        af4.B0 = (this.b.g ? 1 : 0);
        ((u0p)af4).y = this.g.c;
        final int a = c5j.a;
        cbw.b((elm)af4);
        this.a.k.c(this.d, b, (qsb)new qsb<zj7$a, fzv>(this.a) {
            public final Object invoke(final Object o) {
                final zj7$a zj7$a = (zj7$a)o;
                czd.f((Object)zj7$a, "p0");
                final to7 to7 = (to7)((m93)this).receiver;
                Objects.requireNonNull(to7);
                int n;
                if (zj7$a instanceof zj7$a$a) {
                    if (zj7$a.a()) {
                        n = 2131953341;
                    }
                    else {
                        n = 2131953340;
                    }
                }
                else {
                    if (!(zj7$a instanceof zj7$a$b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (zj7$a.a()) {
                        n = 2131953507;
                    }
                    else {
                        n = 2131953506;
                    }
                }
                to7.g.c(n);
                return fzv.a;
            }
        }, (nsb)new nsb<fzv>(this.a) {
            public final Object invoke() {
                final to7 to7 = (to7)((m93)this).receiver;
                Objects.requireNonNull(to7);
                final af4 af4 = new af4(new String[] { "messages:inbox:thread:error_shown" });
                af4.S0 = "max_pins_reached";
                cbw.b((elm)af4);
                final int r = xli.R();
                final to7$c g = to7.g;
                final kjl$b kjl$b = new kjl$b(684);
                ((kjl$a)kjl$b).I(((Context)to7.a).getResources().getQuantityString(2131820577, r, new Object[] { r }));
                ((kjl$a)kjl$b).B((CharSequence)((Context)to7.a).getResources().getString(2131953346));
                ((kjl$a)kjl$b).F(2131955543);
                g.a((jjl)((xk1$a)kjl$b).w());
                return fzv.a;
            }
        });
    }
    
    public final void c() {
        final to7 a = this.a;
        a.g.a((jjl)hvh.n2(a.b, this.d, "inbox", this.b, "swipe_menu"));
    }
    
    public final void d() {
        final cgv e = this.e;
        czd.c((Object)e);
        final boolean y = chw.Y(e.I1);
        int n;
        if (y) {
            n = 3;
        }
        else {
            n = 1;
        }
        final itb<Dialog, Integer, Integer, fzv> itb = (itb<Dialog, Integer, Integer, fzv>)new itb<Dialog, Integer, Integer, fzv>(this.b, y, this.a, this.e, n) {
            public final qo7 D0;
            public final boolean E0;
            public final to7 F0;
            public final cgv G0;
            public final int H0;
            
            public final Object h0(final Object o, final Object o2, final Object o3) {
                final Dialog dialog = (Dialog)o;
                ((Number)o2).intValue();
                final int intValue = ((Number)o3).intValue();
                czd.f((Object)dialog, "<anonymous parameter 0>");
                if (intValue == -1) {
                    if (!this.D0.l) {
                        String s;
                        if (this.E0) {
                            s = "messages:inbox:requests_timeline:untrusted_overflow_menu:block";
                        }
                        else {
                            s = "messages:inbox:requests_timeline:untrusted_overflow_menu:unblock";
                        }
                        cbw.b((elm)new af4(new String[] { s }));
                        cbw.b((elm)new af4());
                    }
                    final z9j r = this.F0.r;
                    final to7 f0 = this.F0;
                    r.d((anm)new t12((Context)f0.a, f0.b, this.G0.D0, (uil)null, this.H0));
                }
                return fzv.a;
            }
        };
        jjl jjl;
        if (y) {
            final Activity a = this.a.a;
            final String k0 = this.e.K0;
            czd.c((Object)k0);
            jjl = hqo.c((Context)a, k0, 5);
        }
        else {
            final Resources resources = ((Context)this.a.a).getResources();
            final String k2 = this.e.K0;
            czd.c((Object)k2);
            jjl = hqo.a(resources, k2, 4);
        }
        ((wk1)jjl).U1 = (xv8)new vo7((Object)itb, 0);
        final int a2 = c5j.a;
        this.a.g.a(jjl);
    }
    
    public final void e() {
        this.a.a(this.g, ah7$b.D0);
    }
    
    public final void f() {
        this.a.a(this.g, ah7$b.E0);
    }
    
    public final void g() {
        this.a.h(this.b, "swipe_menu", this.c);
    }
    
    public final void h() {
        this.a.e(this.b);
    }
    
    public final void i() {
        this.a.j(this.b);
    }
    
    public final void j() {
        if (this.b.l) {
            final af4 af4 = new af4();
            String s;
            if (this.b.g) {
                s = "android:messages:inbox:requests_timeline:untrusted_overflow_menu:view_profile";
            }
            else {
                s = "android:messages:inbox:requests_timeline:untrusted_overflow_menu:view_participants";
            }
            ((u0p)af4).q(new String[] { s });
            cbw.b((elm)af4);
        }
        final to7 a = this.a;
        final cgv e = this.e;
        czd.c((Object)e);
        a.f(e.D0);
    }
}
