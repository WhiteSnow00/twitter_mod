import com.twitter.ui.navigation.BadgeableTabView;
import com.google.android.material.tabs.TabLayout$g;
import com.google.android.material.tabs.TabLayout$d;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rfg implements TabLayout$d
{
    public final chg D0;
    public final xhg E0;
    public final ufg F0;
    public final eid G0;
    public final bbs H0;
    
    public rfg(final chg d0, final xhg e0, final ufg f0, final eid g0, final bbs h0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void C2(final TabLayout$g tabLayout$g) {
        final jsj a = ((osj)this.F0).A(tabLayout$g.e);
        if (a != null) {
            final boolean c = vfg.c(a.a);
            final boolean b = vfg.b(a.a);
            if ((c || b) && this.D0.n1() && (this.H0.d && asa.b().b("explore_tap_to_search", false))) {
                ((vbv)this.D0).T0.f();
            }
            else {
                String s;
                if (vfg.c(a.a)) {
                    s = "moments";
                }
                else if (vfg.b(a.a)) {
                    s = "explore";
                }
                else if (mfg.b.equals((Object)a.a)) {
                    s = "notifications_menu_item";
                }
                else if (mfg.d.equals((Object)a.a)) {
                    s = "messages_menu_item";
                }
                else if (mfg.a.equals((Object)a.a)) {
                    s = "home_menu_item";
                }
                else {
                    s = null;
                }
                if (s != null) {
                    final af4 af4 = new af4();
                    ((u0p)af4).q(new String[] { "home", "navigation_bar", "", s, "tab_tap_scroll_to_top" });
                    cbw.b((elm)af4);
                }
                this.D0.y0();
            }
        }
    }
    
    public final void J0(final TabLayout$g tabLayout$g) {
        final jsj a = ((osj)this.F0).A(tabLayout$g.e);
        final jsj l = ((osj)this.F0).l();
        if (a != null && ((osj)this.F0).m(l) && mfg.d.equals((Object)a.a)) {
            this.G0.a(1);
        }
        if (a != null) {
            final int i = a.i;
            if (i != 0) {
                final BadgeableTabView badgeableTabView = (BadgeableTabView)tabLayout$g.f;
                if (badgeableTabView != null) {
                    badgeableTabView.setIconResource(i);
                }
            }
        }
        this.E0.a(a);
    }
    
    public final void K1(final TabLayout$g tabLayout$g) {
        final jsj a = ((osj)this.F0).A(tabLayout$g.e);
        if (a != null) {
            final int h = a.h;
            if (h != 0) {
                final BadgeableTabView badgeableTabView = (BadgeableTabView)tabLayout$g.f;
                if (badgeableTabView != null) {
                    badgeableTabView.setIconResource(h);
                }
            }
        }
    }
}
