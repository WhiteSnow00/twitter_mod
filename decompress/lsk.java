import java.util.Map;
import com.facebook.imagepipeline.request.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lsk implements p0l<wi4<ui4>>
{
    public final s3h<q73, ui4> a;
    public final u73 b;
    public final p0l<wi4<ui4>> c;
    
    public lsk(final s3h<q73, ui4> a, final u73 b, final p0l<wi4<ui4>> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final dk6<wi4<ui4>> dk6, final q0l q0l) {
        final u0l i = q0l.i();
        final a l = q0l.l();
        final Object a = q0l.a();
        final msk o = l.o;
        if (o != null && o.c() != null) {
            i.k(q0l, "PostprocessedBitmapMemoryCacheProducer");
            final q73 s = ((pf8)this.b).S(l, a);
            final wi4 value = this.a.get((Object)s);
            final Map map = null;
            final Map map2 = null;
            if (value != null) {
                Map of = map2;
                if (i.j(q0l, "PostprocessedBitmapMemoryCacheProducer")) {
                    of = ied.of((Object)"cached_value_found", (Object)"true");
                }
                i.a(q0l, "PostprocessedBitmapMemoryCacheProducer", of);
                i.d(q0l, "PostprocessedBitmapMemoryCacheProducer", true);
                q0l.f("memory_bitmap", "postprocessed");
                dk6.b(1.0f);
                dk6.c((Object)value, 1);
                value.close();
            }
            else {
                final lsk.lsk$a lsk$a = new lsk.lsk$a((dk6)dk6, s, o instanceof rfm, (s3h)this.a, q0l.l().m);
                Map of2 = map;
                if (i.j(q0l, "PostprocessedBitmapMemoryCacheProducer")) {
                    of2 = ied.of((Object)"cached_value_found", (Object)"false");
                }
                i.a(q0l, "PostprocessedBitmapMemoryCacheProducer", of2);
                this.c.a((dk6)lsk$a, q0l);
            }
            return;
        }
        this.c.a((dk6)dk6, q0l);
    }
}
