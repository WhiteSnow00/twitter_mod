import java.util.Iterator;
import java.net.URISyntaxException;
import com.twitter.util.user.UserIdentifier;
import java.net.URI;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lei implements kei
{
    public volatile Set<String> a;
    public final List<a> b;
    public volatile List<qxm> c;
    public volatile Map<String, String> d;
    public volatile Set<String> e;
    public volatile List<String> f;
    public int g;
    public final Random h;
    public volatile lw1<String, String> i;
    public volatile String j;
    
    public lei() {
        this.a = Collections.emptySet();
        this.b = new ArrayList();
        this.c = new ArrayList<qxm>();
        this.d = null;
        this.e = Collections.emptySet();
        this.f = new ArrayList<String>();
        this.g = 0;
        this.h = new Random();
        this.i = (lw1<String, String>)new lw1(0);
        final rmv b = ita.b();
        final t5j merge = t5j.merge((fbj)b.p("traffic_redirect_5347"), (fbj)b.p("traffic_redirect_5347_hostmap"));
        final lta b2 = lta.b;
        final int a = o5j.a;
        merge.startWith((Object)b2).subscribe((rk6)new ec2((Object)this, 15));
        b.o("traffic_rewrite_path_blacklist").subscribe((rk6)new td3((Object)this, 16));
        b.o("traffic_rewrite_map").subscribe((rk6)new di3((Object)this, 15));
        b.o("traffic_passive_measurement_rewrite_list").subscribe((rk6)new pg2((Object)this, 10));
        b.o("traffic_passive_measurement_hosts").subscribe((rk6)new iug((Object)this, 8));
        b.o("traffic_passive_measurement_sampling_rate").subscribe((rk6)new i9f((Object)this, 7));
    }
    
    public static void g(final Map<String, Map<String, String>> map, final String s, final String s2, final String s3) {
        Map<String, String> value;
        if ((value = map.get(s)) == null) {
            value = new HashMap<String, String>(3);
            map.put(s, value);
        }
        final Map<String, String> map2 = value;
        if (s2 != null && s3 != null) {
            map2.put(s2, s3);
        }
    }
    
    public static f6w j(final Map<String, String> map, final URI uri, final boolean b, final UserIdentifier userIdentifier) throws URISyntaxException {
        final f6w.a a = new f6w.a(uri);
        if (UserIdentifier.getCurrent() != b && ita.b().b("traffic_disable_host_rewrite_for_background_requests", false)) {
            return (f6w)a.e();
        }
        if (map != null) {
            final String s = map.get(uri.getHost());
            if (s != null) {
                a.a = hr1.f(uri, s);
            }
        }
        return (f6w)a.e();
    }
    
    @Override
    public final void a(final Map<String, String> map) {
        if (!map.equals(this.i)) {
            this.i = (lw1<String, String>)new lw1((Iterable)map.entrySet());
            this.i(ked.c((Map)this.i));
        }
    }
    
    public final f6w b(final URI uri, final UserIdentifier userIdentifier) throws URISyntaxException {
        URI a = uri;
        if (this.c.size() > 0) {
            final f6w.a a2 = new f6w.a(uri);
            for (final qxm qxm : this.c) {
                if (qxm.a(uri)) {
                    a2.a = hr1.f(uri, qxm.b);
                    break;
                }
            }
            a = ((f6w)a2.e()).a;
        }
        final boolean b = nso.a(this.g).b();
        final int n = 0;
        if (b && (!this.h(a.getPath()) && (this.f.isEmpty() ^ true)) && this.e.contains(a.getPath())) {
            final f6w.a a3 = new f6w.a(a);
            a3.a = hr1.f(a, (String)this.f.get(this.h.nextInt(this.f.size())));
            return (f6w)a3.e();
        }
        if (!this.h(a.getPath()) && this.i.containsKey((Object)a.getHost())) {
            return j((Map)this.i, a, userIdentifier);
        }
        int l0;
        if (this.h(a.getPath())) {
            l0 = n;
        }
        else {
            l0 = (d4j.l0(this.j) ? 1 : 0);
        }
        if (l0 != 0) {
            return j((Map)this.d, a, userIdentifier);
        }
        return (f6w)new f6w.a(a).e();
    }
    
    @Override
    public final String c(final String s) {
        return (String)this.i.a((Object)s);
    }
    
    public final String d(final String s) {
        return (String)this.i.get((Object)s);
    }
    
    @Override
    public final void e(final a a) {
        this.b.add(a);
        final Map<String, String> d = this.d;
        if (d != null) {
            ((rfk.rfk$a)a).a(d);
        }
    }
    
    @Override
    public final Map<String, String> f() {
        return ked.c((Map)this.i);
    }
    
    public final boolean h(final String s) {
        return this.a.contains(s);
    }
    
    public final void i(final Map<String, String> map) {
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((a)iterator.next()).a(map);
        }
    }
}
