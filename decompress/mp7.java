import com.twitter.dm.dialog.BaseConversationActionsDialog$a;
import android.os.BaseBundle;
import kotlin.NoWhenBranchMatchedException;
import java.util.Collection;
import android.content.res.Resources;
import com.twitter.dm.dialog.b;
import com.twitter.dm.dialog.BaseConversationActionsDialog;
import com.twitter.dm.dialog.a;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import com.twitter.util.user.UserIdentifier;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mp7
{
    public static final a Companion;
    public final Activity a;
    public final UserIdentifier b;
    public final p c;
    public final boolean d;
    public final boolean e;
    public final bra<jp7, String> f;
    public final c g;
    public final gid h;
    public final um7 i;
    public final au6 j;
    public final qk7 k;
    public final egd l;
    public final mbi<?> m;
    public final s34 n;
    public final blw o;
    public final t9j<d3w> p;
    public final t9j<m3w> q;
    public final t9j<z12> r;
    public final Fragment s;
    public boolean t;
    
    static {
        Companion = new a();
    }
    
    public mp7(final Bundle bundle, final Activity a, final UserIdentifier b, final p c, final boolean d, final boolean e, final bra<jp7, String> f, final c g, final gid h, final um7 i, final au6 j, final qk7 k, final egd l, final p9s p9s, final mbi<?> m, final s34 n) {
        zzd.f((Object)i, "dmDatabaseWrapper");
        zzd.f((Object)j, "dmConversationRepository");
        zzd.f((Object)k, "dmConversationLabelRepository");
        zzd.f((Object)l, "inAppMessageManager");
        zzd.f((Object)p9s, "requestRepositoryFactory");
        zzd.f((Object)m, "navigator");
        zzd.f((Object)n, "chatOpenTracker");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        final String o = g9m.a((Class)d3w.class).o();
        final String s = "anonymous";
        String s2 = o;
        if (o == null) {
            s2 = "anonymous";
        }
        this.p = (t9j<d3w>)p9s.b((Class)d3w.class, s2);
        String o2;
        if ((o2 = g9m.a((Class)m3w.class).o()) == null) {
            o2 = "anonymous";
        }
        this.q = (t9j<m3w>)p9s.b((Class)m3w.class, o2);
        String o3 = g9m.a((Class)z12.class).o();
        if (o3 == null) {
            o3 = s;
        }
        this.r = (t9j<z12>)p9s.b((Class)z12.class, o3);
        this.s = c.H("DMInboxFragment");
        final Fragment h2 = c.H("TAG_USERS_BOTTOM_SHEET");
        final boolean b2 = h2 instanceof blw;
        boolean b3 = false;
        blw f2;
        if (b2) {
            if (bundle != null) {
                final long[] longArray = ((BaseBundle)bundle).getLongArray("participants_sheet_user_ids");
                if (longArray != null) {
                    ((blw)h2).i2(longArray);
                }
                final String string = ((BaseBundle)bundle).getString("participants_sheet_title");
                if (string == null || string.length() == 0) {
                    b3 = true;
                }
                if (!b3) {
                    ((blw)h2).T1 = string;
                }
            }
            f2 = (blw)h2;
        }
        else {
            final blw$a$a blw$a$a = new blw$a$a();
            blw$a$a.a = xd9.a((Context)a, 2130969530, 2131231057);
            blw$a$a.b = 2131624561;
            blw$a$a.c = 200;
            blw$a$a.d = false;
            blw$a$a.e = "messages:view_participants:user_list::impression";
            f2 = blw.f2((blw$a)((h4j)blw$a$a).e());
        }
        this.o = f2;
    }
    
    public final void a(final yp7$a yp7$a, final th7$b th7$b) {
        final s34 n = this.n;
        final boolean b = true;
        n.a(1);
        final jp7 a = yp7$a.a;
        final int c = yp7$a.c;
        final lk7 b2 = yp7$a.b;
        gid gid;
        if (a.l) {
            gid = gid.C0;
        }
        else if (a.o) {
            gid = gid.F0;
        }
        else {
            gid = gid.E0;
        }
        final String w = m0n.W(gid, false);
        String d = null;
        Label_0108: {
            if (!a.g) {
                final hfv r = rez.r(a, this.b);
                if (r != null) {
                    d = o48.d(r.H1);
                    break Label_0108;
                }
            }
            d = "not_applicable";
        }
        final zf4 zf4 = new zf4();
        zf4.q(new String[] { zi.y("messages:inbox:", w, ":conversation:click") });
        zf4.w0 = a.a;
        zf4.C0 = a.h.size();
        zf4.B0 = (a.g ? 1 : 0);
        zf4.I0 = d;
        Object c2 = null;
        Label_0258: {
            if (b2 != null) {
                final List<lk7.a> b3 = b2.b;
                if (b3 != null) {
                    final ArrayList list = new ArrayList<hl7>(kr4.h1((Iterable)b3, 10));
                    final Iterator<Object> iterator = b3.iterator();
                    while (true) {
                        c2 = list;
                        if (!iterator.hasNext()) {
                            break Label_0258;
                        }
                        list.add((Object)iterator.next().a);
                    }
                }
            }
            c2 = v2a.C0;
        }
        zf4.J((List<hl7>)c2);
        zf4.y = c;
        final int a2 = w4j.a;
        saw.b((okm)zf4);
        final th7 a3 = th7.Companion.a();
        final Activity a4 = this.a;
        final mbi<?> m = this.m;
        final kk7$b kk7$b = new kk7$b();
        ((kk7$a)kk7$b).E(a);
        ((kk7$a)kk7$b).F(c);
        ((zl1$a)kk7$b).a.putBoolean("conversation_is_pinned", b2 != null && b2.c);
        sh7.f(a3, (Context)a4, (mbi)m, (kk7)((h4j)ri4.X((Object)kk7$b, th7$b != null && b, (rtb)new mp7$d(th7$b))).e(), true, false, th7$b, 16, (Object)null);
    }
    
    public final void b(final jp7 jp7, final hfv hfv, final m3w$a m3w$a) {
        this.q.d((kmm)new m3w(this.b, this.i, hfv.C0, m3w$a, jp7.a, this.j, (m3w$c)new mp7$e(this, m3w$a, hfv, jp7)));
    }
    
    public final void c(final yp7$a yp7$a) {
        zzd.f((Object)yp7$a, "conversation");
        this.a(yp7$a, null);
    }
    
    public final void d(final yp7$a yp7$a) {
        zzd.f((Object)yp7$a, "conversation");
        final c g = this.g;
        final int c = yp7$a.c;
        final jp7 a = yp7$a.a;
        final lk7 b = yp7$a.b;
        final String a2 = a.a;
        zzd.e((Object)a2, "inboxItem.conversationId");
        if (a2.length() > 0) {
            final String a3 = a.a;
            zzd.e((Object)a3, "inboxItem.conversationId");
            final hfv r = rez.r(a, this.b);
            final op7 op7 = new op7(this, a, c, a3, r, b, yp7$a);
            Object o;
            if (a.l) {
                final Activity a4 = this.a;
                final boolean d = this.d;
                final boolean e = this.e;
                final int p = com.twitter.dm.dialog.a.p2;
                final Resources resources = ((Context)a4).getResources();
                final boolean g2 = dli.G(a.a);
                final boolean m = dli.M(a.a);
                final boolean k = dli.K(a.a);
                String string;
                if (!g2) {
                    int n;
                    if (!a.i) {
                        n = 2131953497;
                    }
                    else {
                        n = 2131953498;
                    }
                    string = resources.getString(n);
                }
                else {
                    string = null;
                }
                String s;
                if (!g2 && !m) {
                    if (k) {
                        if (r != null) {
                            s = resources.getString(2131953392, new Object[] { r.J0 });
                        }
                        else {
                            s = resources.getString(2131953391);
                        }
                    }
                    else {
                        s = resources.getString(2131953389);
                    }
                }
                else {
                    s = null;
                }
                int n2;
                if (a.g) {
                    n2 = 2131955071;
                }
                else {
                    n2 = 2131955068;
                }
                final String string2 = resources.getString(n2);
                final ijf h = ijf.H();
                bl0.a().a();
                bl0.a().d();
                if (e) {
                    int n3;
                    if (b != null && b.c) {
                        n3 = 2131953505;
                    }
                    else {
                        n3 = 2131953339;
                    }
                    h.p((Object)new jq6(6, resources.getString(n3)));
                }
                h.p((Object)new jq6(0, string2));
                final boolean b2 = d && lcs.b();
                if (string != null && !b2) {
                    h.p((Object)new jq6(1, string));
                }
                if (s != null) {
                    h.p((Object)new jq6(2, s));
                }
                final List n4 = (List)((h4j)h).e();
                final Bundle w = zi.w("twitter:id", 1);
                w.putCharSequenceArray("items", (CharSequence[])BaseConversationActionsDialog.n2(n4));
                final int a5 = w4j.a;
                if (!((BaseBundle)w).containsKey("twitter:id")) {
                    throw new Fragment.InstantiationException("Missing fragment id", null);
                }
                o = new com.twitter.dm.dialog.a();
                ((Fragment)o).N1(w);
                ((BaseConversationActionsDialog)o).m2 = a;
                ((BaseConversationActionsDialog)o).n2 = n4;
                ((BaseConversationActionsDialog)o).o2 = (BaseConversationActionsDialog$a)op7;
            }
            else {
                final Activity a6 = this.a;
                final int p2 = com.twitter.dm.dialog.b.p2;
                final Resources resources2 = ((Context)a6).getResources();
                final ijf h2 = ijf.H();
                bl0.a().a();
                bl0.a().d();
                int n5;
                if (a.g) {
                    n5 = 2131953536;
                }
                else {
                    n5 = 2131955042;
                }
                h2.p((Object)new jq6(3, resources2.getString(n5)));
                int n6;
                if (a.g) {
                    n6 = 2131955071;
                }
                else {
                    n6 = 2131955068;
                }
                h2.p((Object)new jq6(0, resources2.getString(n6)));
                if (!dli.G(a.a)) {
                    if (a.g) {
                        h2.p((Object)new jq6(4, resources2.getString(2131953389)));
                    }
                    else if (r != null) {
                        h2.p((Object)new jq6(4, resources2.getString(2131953392, new Object[] { r.J0 })));
                        int n7;
                        if (tdy.Y(r.H1)) {
                            n7 = 2131955041;
                        }
                        else {
                            n7 = 2131955039;
                        }
                        h2.p((Object)new jq6(5, resources2.getString(n7, new Object[] { r.J0 })));
                    }
                    else {
                        h2.p((Object)new jq6(4, resources2.getString(2131953391)));
                    }
                }
                final List n8 = (List)((h4j)h2).e();
                final Bundle w2 = zi.w("twitter:id", 1);
                w2.putCharSequenceArray("items", (CharSequence[])BaseConversationActionsDialog.n2(n8));
                final int a7 = w4j.a;
                if (!((BaseBundle)w2).containsKey("twitter:id")) {
                    throw new Fragment.InstantiationException("Missing fragment id", null);
                }
                o = new b();
                ((Fragment)o).N1(w2);
                ((BaseConversationActionsDialog)o).m2 = a;
                ((BaseConversationActionsDialog)o).n2 = n8;
                ((BaseConversationActionsDialog)o).o2 = (BaseConversationActionsDialog$a)op7;
            }
            g.b((wil)o);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final void e(final jp7 jp7) {
        zzd.f((Object)jp7, "inboxItem");
        this.o.i2(hr4.H((Collection)hr4.c(jp7.h, (kub)tp3.e)));
        this.o.T1 = (String)this.f.a((Object)jp7);
        if (this.g.a()) {
            this.o.e2(this.c, "TAG_USERS_BOTTOM_SHEET");
        }
    }
    
    public final void f(final long n) {
        rbl.d((Context)this.a, UserIdentifier.Companion.a(n));
    }
    
    public final void g(final hfv hfv, int n) {
        final z6m z6m = new z6m();
        z6m.C0 = hfv.H1;
        final String e = w30.e(n);
        final zf4 zf4 = new zf4(this.b);
        saw.b((okm)new zf4(new String[] { "messages:inbox", m0n.W(this.h, false), "untrusted_overflow_menu", e }));
        saw.b((okm)zf4);
        if (n != 0) {
            if (--n != 0) {
                if (n == 1) {
                    final Activity a = this.a;
                    final String j0 = hfv.J0;
                    zzd.c((Object)j0);
                    ppo.h((Context)a, j0, 11, this.c, (mw8)new kp7((Object)this, (Object)hfv, (Object)z6m, 0));
                }
            }
            else {
                final Activity a2 = this.a;
                final String j2 = hfv.J0;
                zzd.c((Object)j2);
                ppo.e((Context)a2, j2, 11, this.c, (mw8)new lp7((Object)this, (Object)hfv, (Object)z6m, 0));
            }
            return;
        }
        throw null;
    }
    
    public final void h(final jp7 jp7, final String s, final int n) {
        final String a = jp7.a;
        zzd.e((Object)a, "inboxItem.conversationId");
        if (a.length() > 0) {
            this.g.b((wil)jn8.n2(this.b, 2, jp7.g, jp7.a, "inbox", jp7.l, jp7.o, jp7.h, s, n, this.k));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final void i(final jp7 jp7, final int n) {
        hfv hfv;
        if (!jp7.g) {
            hfv = (hfv)hr4.q(o48.f(jp7.h, this.b.getId()));
        }
        else {
            hfv = null;
        }
        final yuh a = yuh.Companion.a((Context)this.a, jp7, false, hfv, n);
        ((Fragment)a).T1(this.s, 10);
        ((cl1)a).e2(this.c, (String)null);
    }
    
    public final void j(final jp7 jp7) {
        final gid h = this.h;
        zzd.f((Object)h, "<this>");
        final int ordinal = h.ordinal();
        zf4 zf4;
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            zf4 = new zf4(new String[] { zi.y("messages:inbox:", m0n.W(h, false), ":untrusted_overflow_menu:report") });
        }
        else {
            zf4 = new zf4(new String[] { zi.y("messages:inbox:", m0n.W(h, false), ":thread:report") });
        }
        saw.b((okm)zf4);
        final hfv r = rez.r(jp7, this.b);
        Long value;
        if (r != null) {
            value = r.C0;
        }
        else {
            value = null;
        }
        mp7.Companion.a(this.m, jp7, value);
    }
    
    public static final class a
    {
        public final void a(final mbi<?> mbi, final jp7 jp7, final Long n) {
            zzd.f((Object)mbi, "navigator");
            zzd.f((Object)jp7, "inboxItem");
            final sjm sjm = new sjm();
            sjm.s("reportdmconversation");
            sjm.m(jp7.a);
            sjm.r();
            if (n != null) {
                sjm.t((long)n);
            }
            mbi.d((zm)sjm);
        }
    }
    
    public interface c
    {
        boolean a();
        
        void b(final wil p0);
        
        void c(final int p0);
    }
}
