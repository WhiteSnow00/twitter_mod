import com.twitter.database.schema.GlobalSchema;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dgc
{
    public final rbq<zsl, List<ufc>> a;
    public final egc b;
    public final GlobalSchema c;
    public final long d;
    public final znl<List<ufc>> e;
    public final bgc f;
    
    public dgc(final m4c m4c, final egc b, final bgc f) {
        this.e = (znl<List<ufc>>)new znl();
        final GlobalSchema c = (GlobalSchema)((sp1)m4c).T();
        this.c = c;
        this.a = new koc(((rmq)((oxo)c).f((Class)ggc.class)).c(), (m2d)new igc());
        this.b = b;
        final g5s a = nq1.a;
        this.d = System.currentTimeMillis();
        this.f = f;
    }
    
    public final bbq<List<ufc>> a() {
        final long long1 = this.f.a.getLong("hashflag_last_fetch_time", -1L);
        final long h = ita.b().h("hashflags_from_strato_not_feature_switches_refresh_interval_seconds", 0L);
        final long b = nq1.b();
        if (ita.b().b("hashflags_from_strato_not_feature_switches_enabled", false) && (long1 < 0L || Math.abs(b - long1) > h)) {
            return this.b();
        }
        return (bbq<List<ufc>>)this.a.S((Object)zsl.g);
    }
    
    public final bbq<List<ufc>> b() {
        return (bbq<List<ufc>>)((tnm<Long, Object, osc>)this.b).S(this.d).y(jxo.c()).w((rtb)new qo9((Object)this, 8));
    }
}
