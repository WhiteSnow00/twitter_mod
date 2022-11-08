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

public final class op7 implements BaseConversationActionsDialog$a
{
    public final /* synthetic */ mp7 a;
    public final /* synthetic */ jp7 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ hfv e;
    public final /* synthetic */ lk7 f;
    public final /* synthetic */ yp7$a g;
    
    public op7(final mp7 a, final jp7 b, final int c, final String d, final hfv e, final lk7 f, final yp7$a g) {
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
        final zf4 zf4 = new zf4();
        zf4.q(new String[] { "messages:inbox::thread:unmute_dm_thread" });
        saw.b((okm)zf4);
        final t9j<d3w> p = this.a.p;
        final mp7 a = this.a;
        final Activity a2 = a.a;
        final jp7 b = this.b;
        final UserIdentifier b2 = a.b;
        p.d((kmm)new d3w((Context)a2, b, b2, this.d, false, 4, x28.Companion.a(b2).v2()));
    }
    
    public final void b() {
        final lk7 f = this.f;
        final boolean b = (f != null && f.c) ^ true;
        String s;
        if (b) {
            s = "messages:inbox:thread:pin_dm_conversation";
        }
        else {
            s = "messages:inbox:thread:unpin_dm_conversation";
        }
        final zf4 zf4 = new zf4(new String[] { s });
        zf4.w0 = this.d;
        zf4.C0 = this.b.h.size();
        zf4.B0 = (this.b.g ? 1 : 0);
        zf4.y = this.g.c;
        final int a = w4j.a;
        saw.b((okm)zf4);
        this.a.k.c(this.d, b, (rtb)new rtb<qk7$a, oyv>(this.a), (otb)new otb<oyv>(this.a));
    }
    
    public final void c() {
        final mp7 a = this.a;
        a.g.b((wil)evh.n2(a.b, this.d, "inbox", this.b, "swipe_menu"));
    }
    
    public final void d() {
        final hfv e = this.e;
        zzd.c((Object)e);
        final boolean y = tdy.Y(e.H1);
        int n;
        if (y) {
            n = 3;
        }
        else {
            n = 1;
        }
        final jub<Dialog, Integer, Integer, oyv> jub = (jub<Dialog, Integer, Integer, oyv>)new jub<Dialog, Integer, Integer, oyv>() {
            public final /* synthetic */ jp7 C0 = op7.this.b;
            public final /* synthetic */ mp7 E0 = op7.this.a;
            public final /* synthetic */ hfv F0 = op7.this.e;
            
            public final Object h0(final Object o, final Object o2, final Object o3) {
                final Dialog dialog = (Dialog)o;
                ((Number)o2).intValue();
                final int intValue = ((Number)o3).intValue();
                zzd.f((Object)dialog, "<anonymous parameter 0>");
                if (intValue == -1) {
                    if (!this.C0.l) {
                        String s;
                        if (y) {
                            s = "messages:inbox:requests_timeline:untrusted_overflow_menu:block";
                        }
                        else {
                            s = "messages:inbox:requests_timeline:untrusted_overflow_menu:unblock";
                        }
                        saw.b((okm)new zf4(new String[] { s }));
                        saw.b((okm)new zf4());
                    }
                    final t9j<z12> r = this.E0.r;
                    final mp7 e0 = this.E0;
                    r.d((kmm)new z12((Context)e0.a, e0.b, this.F0.C0, (hil)null, n));
                }
                return oyv.a;
            }
        };
        wil wil;
        if (y) {
            final Activity a = this.a.a;
            final String j0 = this.e.J0;
            zzd.c((Object)j0);
            wil = ppo.c((Context)a, j0, 5);
        }
        else {
            final Resources resources = ((Context)this.a.a).getResources();
            final String j2 = this.e.J0;
            zzd.c((Object)j2);
            wil = ppo.a(resources, j2, 4);
        }
        ((cl1)wil).T1 = (mw8)new dxf((Object)jub, 1);
        final int a2 = w4j.a;
        this.a.g.b(wil);
    }
    
    public final void e() {
        this.a.a(this.g, th7$b.C0);
    }
    
    public final void f() {
        this.a.a(this.g, th7$b.D0);
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
            final zf4 zf4 = new zf4();
            String s;
            if (this.b.g) {
                s = "android:messages:inbox:requests_timeline:untrusted_overflow_menu:view_profile";
            }
            else {
                s = "android:messages:inbox:requests_timeline:untrusted_overflow_menu:view_participants";
            }
            zf4.q(new String[] { s });
            saw.b((okm)zf4);
        }
        final mp7 a = this.a;
        final hfv e = this.e;
        zzd.c((Object)e);
        a.f(e.C0);
    }
}
