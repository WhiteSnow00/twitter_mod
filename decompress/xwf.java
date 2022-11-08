import android.os.BaseBundle;
import java.util.List;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xwf
{
    public final syf a;
    public final cyf b;
    public final String c;
    public final String d;
    
    public xwf(final cyf b, final syf a, final String c, final String d) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public final esj a(int a, final qof qof, final kyf kyf) {
        final String a2 = this.a.a(kyf.a);
        final cyf$a cyf$a = new cyf$a(this.b);
        if (qof != null) {
            final lev lev = new lev();
            final sxf$a sxf$a = new sxf$a();
            sxf$a.a = qof.a;
            sxf$a.b = kyf.a;
            sxf$a.i = kyf.g;
            sxf$a.j = kyf.h;
            sxf$a.h = a;
            lev.h0 = (sxf)((h4j)sxf$a).e();
            yvj.k(((zl1$a)cyf$a).a, "scribe_item", (Object)lev, (alp)lev.w1);
            a = w4j.a;
        }
        ((qrs$a)cyf$a).v(a2);
        ((BaseBundle)((zl1$a)cyf$a).a).putString("event_timeline_id", kyf.a);
        ((BaseBundle)((zl1$a)cyf$a).a).putString("hashtag", kyf.c);
        ((BaseBundle)((zl1$a)cyf$a).a).putString("compose_semantic_core_id", kyf.d);
        yvj.k(((zl1$a)cyf$a).a, "customization_info", (Object)kyf.e, (alp)ae7.c);
        ((BaseBundle)((zl1$a)cyf$a).a).putString("compose_timeline_id", kyf.f);
        ((BaseBundle)((zl1$a)cyf$a).a).putString("timeline_source_id", kyf.g);
        ((BaseBundle)((zl1$a)cyf$a).a).putString("timeline_source_type", kyf.h);
        final cyf c = (cyf)((h4j)cyf$a).e();
        final StringBuilder g = w48.g("twitter://events/timeline/");
        g.append(kyf.a);
        final esj$a esj$a = new esj$a(Uri.parse(g.toString()), (Class)jyf.class);
        esj$a.k = a2.hashCode();
        esj$a.d = kyf.b;
        esj$a.c = (zl1)c;
        esj$a.e = kyf.a;
        return (esj)((h4j)esj$a).e();
    }
    
    public final List<esj> b(final qof qof) {
        final ijf h = ijf.H();
        List<kyf> list;
        if (qof.d.isEmpty()) {
            final String b = qof.b;
            final String c = qof.c;
            final kyf$a kyf$a = new kyf$a("DEFAULT_TIMELINE_ID");
            final String d = this.d;
            String b2;
            if ((b2 = b) == null) {
                b2 = d;
            }
            kyf$a.b = b2;
            String c2;
            if ((c2 = c) == null) {
                c2 = "";
            }
            kyf$a.c = c2;
            kyf$a.d = "EVENT_SEMANTICCOREID";
            list = ijf.v((Object)((h4j)kyf$a).e());
        }
        else {
            list = qof.d;
        }
        for (int i = 0; i < list.size(); ++i) {
            h.p((Object)this.a(i, qof, list.get(i)));
        }
        return (List)((h4j)h).e();
    }
}
