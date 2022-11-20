import androidx.core.graphics.drawable.IconCompat;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import android.graphics.Bitmap;
import java.util.concurrent.TimeUnit;
import com.twitter.util.user.UserIdentifier;
import android.util.Log;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b28
{
    public static final d Companion;
    public static final boolean h;
    public final pfw<ywl> a;
    public final kfv b;
    public final Context c;
    public final pfw<ah7> d;
    public final pfw<pt6> e;
    public final kwg f;
    public final wc6 g;
    
    static {
        Companion = new d();
        h = (s9g.i() && Log.isLoggable("DynamicShortcut", 3));
    }
    
    public b28(final pfw<ywl> a, final xbm xbm, final kfv b, final h5j<UserIdentifier> h5j, final Context c, final pfw<ah7> d, final pfw<pt6> e, final kwg f) {
        czd.f((Object)a, "rankedSuggestionUserProvider");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)b, "twitterShortcutManager");
        czd.f((Object)h5j, "shareHistoryUpdateSubject");
        czd.f((Object)c, "context");
        czd.f((Object)d, "dmChatLauncherProvider");
        czd.f((Object)e, "conversationTitleFactoryProvider");
        czd.f((Object)f, "mediaManager");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        final wc6 g = new wc6();
        this.g = g;
        if (b28.h) {
            s9g.a("DynamicShortcut", "Initialize shortcut listener");
        }
        g.a(h5j.startWith((Object)UserIdentifier.Companion.c()).filter((ytk)new vi4((qsb)b28$a.D0, 4)).throttleWithTimeout(5L, TimeUnit.SECONDS).flatMap((psb)new ti4((qsb)new qsb<UserIdentifier, h5j<j3q>>(this) {
            public final Object invoke(final Object o) {
                final UserIdentifier userIdentifier = (UserIdentifier)o;
                czd.f((Object)userIdentifier, "p0");
                final b28 b28 = (b28)((m93)this).receiver;
                return ((ywl)((zyr)b28.a).get((Object)userIdentifier)).a(eur.c).y(owo.c()).s((psb)new y9v((qsb)new c28(b28, userIdentifier), 6));
            }
        }, 9)).subscribe((lj6)new sma((qsb)new qsb<j3q, fzv>(this) {
            public final b28 D0;
            
            public final Object invoke(final Object o) {
                final j3q j3q = (j3q)o;
                if (b28.h) {
                    final String b = j3q.b;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Updating shortcut ");
                    sb.append(b);
                    sb.append(" with avatar");
                    s9g.a("DynamicShortcut", sb.toString());
                }
                r3q.i(this.D0.c, j3q);
                return fzv.a;
            }
        }, 12)));
        xbm.i((oj)new qbk(this, 7));
    }
    
    public final j3q$a a(final UserIdentifier userIdentifier, final qo7 qo7, final Bitmap bitmap) {
        final List<exj> h = qo7.h;
        czd.e((Object)h, "inboxItem.participants");
        final ArrayList list = new ArrayList(iq4.H((Iterable)h, 10));
        for (final exj exj : h) {
            final cgv i0 = exj.I0;
            final String s = null;
            Bitmap g = null;
            Label_0108: {
                if (i0 != null) {
                    final String e0 = i0.E0;
                    if (e0 != null) {
                        g = this.f.g(this.c(e0));
                        break Label_0108;
                    }
                }
                g = null;
            }
            final IconCompat d = this.d(2131232320, g);
            final hbk.c c = new hbk.c();
            c.d = String.valueOf(exj.D0);
            c.b = d;
            final cgv i2 = exj.I0;
            String a;
            if (i2 == null || (a = i2.c()) == null) {
                final cgv i3 = exj.I0;
                String k0 = s;
                if (i3 != null) {
                    k0 = i3.K0;
                }
                a = ikr.l(k0);
            }
            c.a = a;
            list.add((Object)new hbk(c));
        }
        final String f = ((pt6)((zyr)this.e).get((Object)userIdentifier)).f(qo7);
        czd.e((Object)f, "conversationTitleFactory\u2026veUser).create(inboxItem)");
        final j3q$a j3q$a = new j3q$a(this.c, qo7.a);
        final Object[] array = list.toArray((Object[])new hbk[0]);
        czd.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final hbk[] j = (hbk[])array;
        final j3q a2 = j3q$a.a;
        a2.j = j;
        a2.e = f;
        a2.f = f;
        a2.m = false;
        j3q$a.a.k = dnp.s((Object)"android.intent.category.DEFAULT");
        j3q$a.a.h = this.d(2131232312, bitmap);
        final ah7 ah7 = (ah7)((zyr)this.d).get((Object)userIdentifier);
        final Context c2 = this.c;
        final tj7$b tj7$b = new tj7$b();
        ((vl1$a)tj7$b).u(userIdentifier);
        ((tj7$a)tj7$b).A(qo7.a);
        ((tj7$a)tj7$b).B(true);
        j3q$a.b(ah7.e(c2, (tj7)((n4j)tj7$b).e()));
        return j3q$a;
    }
    
    public final j3q$a b(final UserIdentifier userIdentifier, final x38 x38, final Bitmap bitmap) {
        final IconCompat d = this.d(2131232320, bitmap);
        final hbk.c c = new hbk.c();
        c.d = x38.y();
        c.a = x38.a.c();
        c.b = d;
        final String e = this.e(userIdentifier, (m28)x38);
        String s;
        if ((s = x38.a.c()) == null && (s = ikr.l(x38.a.K0)) == null) {
            s = "";
        }
        final j3q$a j3q$a = new j3q$a(this.c, e);
        final hbk hbk = new hbk(c);
        final j3q a = j3q$a.a;
        a.j = new hbk[] { hbk };
        a.e = s;
        a.f = s;
        a.m = false;
        a.h = d;
        j3q$a.a.k = dnp.s((Object)"android.intent.category.DEFAULT");
        final ah7 ah7 = (ah7)((zyr)this.d).get((Object)userIdentifier);
        final Context c2 = this.c;
        final tj7$b tj7$b = new tj7$b();
        ((vl1$a)tj7$b).u(userIdentifier);
        ((tj7$a)tj7$b).A(e);
        ((tj7$a)tj7$b).B(true);
        j3q$a.b(ah7.e(c2, (tj7)((n4j)tj7$b).e()));
        return j3q$a;
    }
    
    public final x7d c(final String s) {
        final x7d$a x7d$a = new x7d$a(s, (jvg)null);
        x7d$a.s = (l8d)new u94();
        x7d$a.l = edq.Companion.b(84, 84);
        return new x7d(x7d$a);
    }
    
    public final IconCompat d(final int n, final Bitmap bitmap) {
        if (bitmap != null) {
            return IconCompat.c(bitmap);
        }
        return IconCompat.d(this.c, n);
    }
    
    public final String e(final UserIdentifier userIdentifier, final m28 m28) {
        String s;
        if (m28 instanceof x38) {
            s = chw.U(userIdentifier.getId(), Long.parseLong(m28.y()));
        }
        else if (m28 instanceof ao7) {
            s = ((ao7)m28).a.a;
        }
        else {
            s = String.valueOf(m28.hashCode());
        }
        czd.e((Object)s, "when (dmSuggestion) {\n  \u2026de().toString()\n        }");
        return s;
    }
    
    public static final class d
    {
    }
}
