import java.util.List;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oxt
{
    public static final a Companion;
    public final fdi a;
    public volatile Collection<String> b;
    public volatile Collection<String> c;
    public volatile Collection<String> d;
    public volatile boolean e;
    public volatile awj<String, String> f;
    public volatile boolean g;
    public volatile boolean h;
    
    static {
        Companion = new a();
    }
    
    public oxt(final fdi a) {
        e0e.f((Object)a, "networkDetails");
        this.a = a;
        final h3a f0 = h3a.F0;
        this.b = (List)f0;
        this.c = (List)f0;
        this.d = (Collection<String>)f0;
        this.f = (awj<String, String>)new awj((Object)"", (Object)"");
        this.a();
        this.b();
    }
    
    public final void a() {
        synchronized (this) {
            this.e = false;
            final String k = ita.b().k("traffic_control_tower_configuration_key");
            e0e.e((Object)k, "getCurrent().getString(F\u2026CONTROL_TOWER_CONFIG_KEY)");
            final String i = ita.b().k("traffic_control_tower_configuration_value");
            e0e.e((Object)i, "getCurrent().getString(F\u2026NTROL_TOWER_CONFIG_VALUE)");
            this.f = (awj<String, String>)new awj((Object)k, (Object)i);
            final int length = ((CharSequence)this.f.F0).length();
            boolean e = true;
            if (length <= 0 || ((CharSequence)this.f.G0).length() <= 0) {
                e = false;
            }
            this.e = e;
            this.g = ita.b().b("traffic_control_tower_recommendations_should_send_client_details", false);
        }
    }
    
    public final void b() {
        synchronized (this) {
            this.h = false;
            final h3a f0 = h3a.F0;
            this.b = (List)f0;
            this.c = (List)f0;
            final List g = ita.b().g("traffic_image_probe_urls");
            e0e.e((Object)g, "getCurrent().getList(Fea\u2026TRAFFIC_IMAGE_PROBE_URLS)");
            this.b = g;
            final List g2 = ita.b().g("traffic_video_probe_urls");
            e0e.e((Object)g2, "getCurrent().getList(Fea\u2026TRAFFIC_VIDEO_PROBE_URLS)");
            this.c = g2;
            this.h = ita.b().b("traffic_send_synthetic_probes", false);
            this.d = rr4.T1((Collection)this.c, (Iterable)this.b);
        }
    }
    
    public final Collection<String> c(final eei eei, final Collection<String> collection, final String s, int f) {
        if (!this.h || !this.a.f().e(eei)) {
            return (Collection<String>)h3a.F0;
        }
        if (collection.size() <= 1) {
            return collection;
        }
        List list = shw.S0((Iterable)collection);
        f = ita.b().f(s, f);
        if (f < list.size()) {
            list = list.subList(0, f);
        }
        return list;
    }
    
    public static final class a
    {
    }
}
