import java.util.Iterator;
import android.database.Cursor;
import java.util.List;
import android.webkit.WebView;
import android.os.Parcelable;
import android.os.Bundle;
import android.net.Uri;
import android.app.Activity;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.LinkedHashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class owu
{
    public static final a Companion;
    public final zb7 a;
    public final eox b;
    public final icu c;
    public final Set<Long> d;
    public final Set<String> e;
    public long f;
    public final int g;
    public final int h;
    public final long i;
    
    static {
        Companion = new a();
    }
    
    public owu(final zb7 a, final eox b, final icu c) {
        e0e.f((Object)a, "customTabsManager");
        e0e.f((Object)b, "webviewPreconnectionManager");
        e0e.f((Object)c, "systemClock");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new LinkedHashSet();
        this.e = new LinkedHashSet();
        this.f = c.b();
        final int f = ita.b().f("wcl_cct_timeline_promoted_url_preconnect_search_range", 10);
        final int n = 0;
        int g = f;
        if (f < 0) {
            g = 0;
        }
        this.g = g;
        int f2 = ita.b().f("wcl_cct_timeline_promoted_url_preconnect_search_valid_distance", 6);
        if (f2 < 0) {
            f2 = n;
        }
        this.h = f2;
        this.i = TimeUnit.SECONDS.toMillis(ita.b().f("wcl_cct_timeline_promoted_url_preconnect_cache_clear_interval_in_seconds", 900));
    }
    
    public final boolean a(final p4e<vxs> p4e, int n, int intValue) {
        e0e.f((Object)p4e, "items");
        if (!p4e.isEmpty() && p4e instanceof wxs && (intValue < 0 || this.h < Math.abs(n - intValue))) {
            final long b = this.c.b();
            if (b > this.f + this.i) {
                this.f = b;
                this.d.clear();
                this.e.clear();
                this.b.b = false;
            }
            final LinkedHashSet set = new LinkedHashSet();
            final b6e b6e = new b6e(n, this.g);
            n = 0;
            List list;
            while (true) {
                final boolean hasNext = b6e.hasNext();
                list = null;
                final ls8 ls8 = null;
                if (!hasNext) {
                    break;
                }
                final Integer n2 = (Integer)((ohz)b6e).next();
                final wxs wxs = (wxs)p4e;
                e0e.e((Object)n2, "itemPosition");
                intValue = n2;
                Long value = null;
                Label_0246: {
                    if (wxs.q() && wxs.K0) {
                        final Cursor j0 = wxs.J0;
                        if (j0.moveToPosition(intValue) && !j0.isNull(you.D)) {
                            final long d = bys.d((p4e)wxs, intValue);
                            if (d != 0L) {
                                value = d;
                                break Label_0246;
                            }
                        }
                    }
                    value = null;
                }
                if (value == null || this.d.contains(value)) {
                    continue;
                }
                this.d.add(value);
                final vxs vxs = p4e.m(n2);
                if (!(vxs instanceof xec)) {
                    continue;
                }
                final xec xec = (xec)vxs;
                if (xec.i().O2()) {
                    final uwv a1 = xec.i().F0.a1;
                    ls8 a2 = ls8;
                    if (a1 != null) {
                        final List<zwv> k = a1.k;
                        a2 = ls8;
                        if (k != null) {
                            final zwv zwv = k.get(0);
                            a2 = ls8;
                            if (zwv != null) {
                                a2 = zwv.a();
                            }
                        }
                    }
                    if (a2 instanceof hkk) {
                        final eox b2 = this.b;
                        Objects.requireNonNull(b2);
                        final String l = ita.b().l("unified_cards_playables_prefetching_bucket_android", "");
                        if (!b2.b && e0e.a((Object)"preconnect", (Object)l)) {
                            intValue = 1;
                        }
                        else {
                            intValue = 0;
                        }
                        if (intValue != 0) {
                            n = 1;
                            continue;
                        }
                    }
                }
                if (!this.a.k()) {
                    continue;
                }
                final a companion = owu.Companion;
                final hp6 i = xec.i();
                e0e.e((Object)i, "item.tweet");
                Objects.requireNonNull(companion);
                final aop$a aop$a = new aop$a(1);
                if (i.O2()) {
                    final uwv a3 = i.F0.a1;
                    if (a3 != null) {
                        final Iterator<zwv> iterator = a3.k.iterator();
                        while (iterator.hasNext()) {
                            final ls8 a4 = iterator.next().a();
                            if (a4 instanceof dq2) {
                                ((aop)aop$a).o((Object)((dq2)a4).toString());
                            }
                        }
                    }
                    final ck3 z0 = i.F0.Z0;
                    if (z0 != null) {
                        ((aop)aop$a).o((Object)z0.b);
                    }
                    if (i.a0()) {
                        final d8a a5 = i.F0.N0.K0.a;
                        e0e.e((Object)a5, "tweet.content.tweetEntities.urls");
                        final ArrayList list2 = new ArrayList<String>(nr4.d1((Iterable)a5, 10));
                        final Iterator iterator2 = a5.iterator();
                        while (iterator2.hasNext()) {
                            list2.add(((w6w)iterator2.next()).M0);
                        }
                        ((aop)aop$a).p((Iterable)list2);
                    }
                }
                final Collection collection = (Collection)((z4j)aop$a).e();
                final ArrayList<String> list3 = new ArrayList<String>();
                for (final Object next : collection) {
                    if (this.e.contains(next) ^ true) {
                        list3.add((String)next);
                    }
                }
                for (final String s : list3) {
                    set.add(s);
                    this.e.add(s);
                }
            }
            if (set.isEmpty() ^ true) {
                final zb7 a6 = this.a;
                final List i2 = rr4.i2((Iterable)set);
                if (a6.k() && a6.f() && !i2.isEmpty()) {
                    final gc7 d2 = a6.d("https://t.co", (yp2)null, (Activity)null);
                    if (d2 != null) {
                        final fc7 l2 = a6.L0;
                        final Uri parse = Uri.parse("https://t.co");
                        List list4;
                        if (i2.isEmpty()) {
                            list4 = list;
                        }
                        else {
                            final List a7 = luh.a(i2.size());
                            final Iterator iterator5 = i2.iterator();
                            while (true) {
                                list4 = a7;
                                if (!iterator5.hasNext()) {
                                    break;
                                }
                                final String s2 = (String)iterator5.next();
                                final Bundle bundle = new Bundle();
                                bundle.putParcelable("android.support.customtabs.otherurls.URL", (Parcelable)Uri.parse(s2));
                                a7.add(bundle);
                            }
                        }
                        l2.d(d2, parse, list4);
                    }
                }
            }
            if (n != 0) {
                final eox b3 = this.b;
                if (!b3.b) {
                    b3.b = true;
                    new WebView(b3.a).loadUrl("https://creatives.crossinstall.com");
                    xw0.g(TimeUnit.MILLISECONDS, 5000L, (sj)new kgc(b3, 16));
                }
            }
            return true;
        }
        return false;
    }
    
    public static final class a
    {
    }
}
