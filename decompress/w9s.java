import java.io.Serializable;
import android.view.Menu;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import com.google.android.material.tabs.TabLayout$g;
import android.view.View;
import java.util.List;
import com.google.android.material.tabs.TabLayout$c;
import androidx.viewpager.widget.ViewPager;
import java.util.Arrays;
import android.os.Handler;
import android.os.Looper;
import com.google.android.material.tabs.TabLayout;
import com.twitter.ui.widget.DockLayout;
import android.os.Bundle;
import com.twitter.users.TabbedVitFollowersContentViewArgs;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import com.twitter.ui.view.RtlViewPager;
import android.net.Uri;
import com.google.android.material.tabs.TabLayout$d;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w9s extends vbv implements ftj, TabLayout$d
{
    public static final Uri a1;
    public static final Uri b1;
    public final qbu X0;
    public final RtlViewPager Y0;
    public w9s.w9s$a Z0;
    
    static {
        a1 = Uri.parse("twitter://followers/verified");
        b1 = Uri.parse("twitter://followers/all");
    }
    
    public w9s(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final TabbedVitFollowersContentViewArgs tabbedVitFollowersContentViewArgs, final Bundle bundle, final cbw cbw, final t8p t8p) {
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, (t8p)cbw);
        final RtlViewPager y0 = (RtlViewPager)((u9)this).C4(2131430503);
        this.Y0 = y0;
        final DockLayout dockLayout = (DockLayout)((u9)this).C4(2131428769);
        final TabLayout tabLayout = (TabLayout)((u9)this).C4(2131431879);
        final int d0 = dockLayout.D0;
        final int n = 1;
        if (d0 != 0) {
            final View topDockView = dockLayout.getTopDockView();
            jee.l((Object)topDockView);
            dockLayout.P0.add(new gtj((ftj)this, topDockView));
        }
        final qbu e = pbu.e(userIdentifier, "vit_followers");
        this.X0 = e;
        new Handler(Looper.getMainLooper()).post((Runnable)new nob((Object)this, (Object)tabbedVitFollowersContentViewArgs, 5));
        final List<jsj> list = Arrays.asList(this.W4(w9s.b1), this.W4(w9s.a1));
        if (tabLayout != null) {
            tabLayout.setupWithViewPager((ViewPager)y0);
            tabLayout.a((TabLayout$c)this);
        }
        y0.setAdapter((huj)(this.Z0 = new w9s.w9s$a(this, cnb, (List)list, y0)));
        int n2;
        if (bundle != null) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        String s = tabbedVitFollowersContentViewArgs.getStartTab();
        if (n2 != 0) {
            s = null;
        }
        if (s == null) {
            s = e.j("tag", "");
            if (!ikr.g((CharSequence)s)) {
                s = ((ksj)this.Z0).A(0).a.toString();
            }
        }
        final int t = ((ksj)this.Z0).t(Uri.parse(s));
        if (t != -1 && t != y0.getCurrentItem() && t != -1 && t != y0.getCurrentItem()) {
            y0.setCurrentItem(t);
        }
        final af4 af4 = new af4(userIdentifier);
        ((u0p)af4).q(new String[] { "followers:vit_verified_followers:::impression" });
        cbw.b((elm)af4);
        this.X4(y0.getCurrentItem(), userIdentifier);
    }
    
    public final void C2(final TabLayout$g tabLayout$g) {
        final w9s.w9s$a z0 = this.Z0;
        Object a2 = null;
        Label_0051: {
            if (z0 != null) {
                final jsj a = ((ksj)z0).A(this.Y0.getCurrentItem());
                if (a != null) {
                    final w9s.w9s$a z2 = this.Z0;
                    if (z2 != null) {
                        a2 = a.a((p)((ksj)z2).M0);
                        break Label_0051;
                    }
                }
            }
            a2 = null;
        }
        if (a2 instanceof umd) {
            final qkt qkt = (qkt)xjr.h((Fragment)a2, (Class)qkt.class);
            if (qkt != null) {
                qkt.y0();
            }
        }
    }
    
    public final osj E2() {
        return (osj)this.Z0;
    }
    
    public final void J0(final TabLayout$g tabLayout$g) {
    }
    
    public final void K1(final TabLayout$g tabLayout$g) {
    }
    
    public final boolean N2(final hai hai, final Menu menu) {
        super.N2(hai, menu);
        hai.z(2131689552, menu);
        return true;
    }
    
    public final void P4() {
        super.P4();
        final w9s.w9s$a z0 = this.Z0;
        if (z0 != null) {
            final qbu x0 = this.X0;
            final Uri o = ((ksj)z0).o();
            String string;
            if (o != null) {
                string = o.toString();
            }
            else {
                string = null;
            }
            x0.i().b("tag", string).e();
        }
    }
    
    public final jsj W4(final Uri uri) {
        int n;
        Serializable s;
        xib$a xib$a;
        if (w9s.b1.equals((Object)uri)) {
            n = 2131954149;
            s = ajb.class;
            xib$a = new xib$a();
            xib$a.w(((u9)this).K0.getId());
        }
        else {
            if (!w9s.a1.equals((Object)uri)) {
                throw new IllegalArgumentException("Invalid page");
            }
            n = 2131954146;
            s = jsw.class;
            xib$a = new xib$a();
            xib$a.w(((u9)this).K0.getId());
        }
        final jsj$a jsj$a = new jsj$a(uri, (Class)s);
        jsj$a.d = ((u9)this).H4(n);
        final Object e = ((n4j)xib$a).e();
        final int a = c5j.a;
        jsj$a.c = (vl1)e;
        return (jsj)((n4j)jsj$a).e();
    }
    
    public final void X4(final int n, final UserIdentifier userIdentifier) {
        String s;
        if (n != 0) {
            if (n != 1) {
                s = null;
            }
            else {
                s = "verified";
            }
        }
        else {
            s = "all";
        }
        if (s != null) {
            final af4 af4 = new af4(userIdentifier);
            ((u0p)af4).q(new String[] { "followers:vit_verified_followers", s, ":impression" });
            cbw.b((elm)af4);
        }
    }
    
    public final Fragment y3(final jsj jsj) {
        final w9s.w9s$a z0 = this.Z0;
        Object a;
        if (z0 != null) {
            a = jsj.a((p)((ksj)z0).M0);
        }
        else {
            a = null;
        }
        return (Fragment)a;
    }
}
