import android.os.BaseBundle;
import java.util.List;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxf
{
    public final zyf a;
    public final jyf b;
    public final String c;
    public final String d;
    
    public dxf(final jyf b, final zyf a, final String c, final String d) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public final ysj a(int a, final zof zof, final ryf ryf) {
        final String a2 = this.a.a(ryf.a);
        final jyf$a jyf$a = new jyf$a(this.b);
        if (zof != null) {
            final ufv ufv = new ufv();
            final zxf$a zxf$a = new zxf$a();
            zxf$a.a = zof.a;
            zxf$a.b = ryf.a;
            zxf$a.i = ryf.g;
            zxf$a.j = ryf.h;
            zxf$a.h = a;
            ufv.h0 = (zxf)((z4j)zxf$a).e();
            swj.k(((am1.a)jyf$a).a, "scribe_item", (Object)ufv, (nmp)ufv.w1);
            a = o5j.a;
        }
        ((bts$a)jyf$a).v(a2);
        ((BaseBundle)((am1.a)jyf$a).a).putString("event_timeline_id", ryf.a);
        ((BaseBundle)((am1.a)jyf$a).a).putString("hashtag", ryf.c);
        ((BaseBundle)((am1.a)jyf$a).a).putString("compose_semantic_core_id", ryf.d);
        swj.k(((am1.a)jyf$a).a, "customization_info", (Object)ryf.e, (nmp)ke7.c);
        ((BaseBundle)((am1.a)jyf$a).a).putString("compose_timeline_id", ryf.f);
        ((BaseBundle)((am1.a)jyf$a).a).putString("timeline_source_id", ryf.g);
        ((BaseBundle)((am1.a)jyf$a).a).putString("timeline_source_type", ryf.h);
        final jyf c = (jyf)((z4j)jyf$a).e();
        final StringBuilder f = ehk.f("twitter://events/timeline/");
        f.append(ryf.a);
        final ysj$a ysj$a = new ysj$a(Uri.parse(f.toString()), (Class)qyf.class);
        ysj$a.k = a2.hashCode();
        ysj$a.d = ryf.b;
        ysj$a.c = (am1)c;
        ysj$a.e = ryf.a;
        return (ysj)((z4j)ysj$a).e();
    }
    
    public final List<ysj> b(final zof zof) {
        final ojf h = ojf.H();
        List list;
        if (zof.d.isEmpty()) {
            final String b = zof.b;
            final String c = zof.c;
            final ryf$a ryf$a = new ryf$a("DEFAULT_TIMELINE_ID");
            final String d = this.d;
            String b2;
            if ((b2 = b) == null) {
                b2 = d;
            }
            ryf$a.b = b2;
            String c2;
            if ((c2 = c) == null) {
                c2 = "";
            }
            ryf$a.c = c2;
            ryf$a.d = "EVENT_SEMANTICCOREID";
            list = ojf.v((Object)((z4j)ryf$a).e());
        }
        else {
            list = zof.d;
        }
        for (int i = 0; i < list.size(); ++i) {
            h.p((Object)this.a(i, zof, (ryf)list.get(i)));
        }
        return (List)((z4j)h).e();
    }
}
