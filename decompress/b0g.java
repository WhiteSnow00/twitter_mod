import com.twitter.api.model.json.edit.JsonEditControlInitial;
import com.twitter.model.json.liveevent.JsonLiveEventTimelineInfo;
import com.twitter.model.json.timeline.urt.richtext.JsonUrtRichText$ReferenceObject;
import com.twitter.model.json.timeline.urt.richtext.JsonUrtRichText$JsonRichTextUserEntity;
import com.twitter.model.json.timeline.urt.JsonTimelineOperation;
import com.twitter.model.json.timeline.urt.a;
import com.twitter.model.json.timeline.urt.b$o;
import com.twitter.model.json.timeline.urt.b$p;
import com.twitter.model.json.timeline.urt.b$c;
import com.twitter.nft.subsystem.model.NFTSmartContract;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b0g implements lub
{
    public static final b0g A;
    public static final b0g B;
    public static final b0g C;
    public static final b0g D;
    public static final b0g E;
    public static final b0g b;
    public static final b0g c;
    public static final b0g d;
    public static final b0g e;
    public static final b0g f;
    public static final b0g g;
    public static final b0g h;
    public static final b0g i;
    public static final b0g j;
    public static final b0g k;
    public static final b0g l;
    public static final b0g m;
    public static final b0g n;
    public static final b0g o;
    public static final b0g p;
    public static final b0g q;
    public static final b0g r;
    public static final b0g s;
    public static final b0g t;
    public static final b0g u;
    public static final b0g v;
    public static final b0g w;
    public static final b0g x;
    public static final b0g y;
    public static final b0g z;
    public final int a;
    
    static {
        b = new b0g(0);
        c = new b0g(1);
        d = new b0g(2);
        e = new b0g(3);
        f = new b0g(4);
        g = new b0g(5);
        h = new b0g(6);
        i = new b0g(7);
        j = new b0g(8);
        k = new b0g(9);
        l = new b0g(10);
        m = new b0g(11);
        n = new b0g(12);
        o = new b0g(13);
        p = new b0g(14);
        q = new b0g(15);
        r = new b0g(16);
        s = new b0g(17);
        t = new b0g(18);
        u = new b0g(19);
        v = new b0g(20);
        w = new b0g(21);
        x = new b0g(22);
        y = new b0g(23);
        z = new b0g(24);
        A = new b0g(25);
        B = new b0g(26);
        C = new b0g(27);
        D = new b0g(28);
        E = new b0g(29);
    }
    
    public b0g(final int a) {
        this.a = a;
    }
    
    public final Object apply(Object c) {
        switch (this.a) {
            default: {
                final qhe qhe = (qhe)c;
                final yie.a companion = yie.Companion;
                e0e.c((Object)qhe);
                return uih.c(qhe, NFTSmartContract.ERC721.class, false);
            }
            case 28: {
                final qhe qhe2 = (qhe)c;
                final o8c b = ixv.b;
                return uih.c(qhe2, (Class<ls8>)cp0.class, false);
            }
            case 27: {
                final qhe qhe3 = (qhe)c;
                final o8c b2 = cxv.b;
                return uih.c(qhe3, (Class<zwv>)wsg.class, false);
            }
            case 26: {
                final qhe qhe4 = (qhe)c;
                final o8c<apv> b3 = dvs.b;
                return uih.c(qhe4, (Class<apv>)rpv.class, false);
            }
            case 25: {
                final qhe qhe5 = (qhe)c;
                final o8c b4 = a2t.b;
                final z1t$a z1t$a = new z1t$a();
                final rvs a = uih.c(qhe5, rvs.class, false);
                if (a != null) {
                    z1t$a.a = a;
                }
                return ((z4j)z1t$a).e();
            }
            case 24: {
                return new b$c((sbm)c);
            }
            case 23: {
                return new b$p((c2t)c);
            }
            case 22: {
                return new b$o((qwv)c);
            }
            case 21: {
                final qhe qhe6 = (qhe)c;
                final o8c b5 = com.twitter.model.json.timeline.urt.a.b;
                final zqv a2 = uih.c(qhe6, zqv.class, false);
                final JsonTimelineOperation jsonTimelineOperation = new JsonTimelineOperation();
                jsonTimelineOperation.a = a2;
                return jsonTimelineOperation;
            }
            case 20: {
                final qhe qhe7 = (qhe)c;
                final o8c b6 = vym.b;
                final JsonUrtRichText$JsonRichTextUserEntity b7 = uih.c(qhe7, JsonUrtRichText$JsonRichTextUserEntity.class, false);
                final JsonUrtRichText$ReferenceObject jsonUrtRichText$ReferenceObject = new JsonUrtRichText$ReferenceObject();
                jsonUrtRichText$ReferenceObject.b = b7;
                return jsonUrtRichText$ReferenceObject;
            }
            case 19: {
                final qhe qhe8 = (qhe)c;
                final o8c b8 = d87.b;
                return uih.c(qhe8, (Class<b87>)b87$c.class, false);
            }
            case 18: {
                return ((eih)c).s();
            }
            case 17: {
                final qhe qhe9 = (qhe)c;
                final o8c b9 = djw.b;
                return uih.c(qhe9, (Class<ziw>)qgv.class, false);
            }
            case 16: {
                final qhe qhe10 = (qhe)c;
                final o8c b10 = rg0.b;
                return uih.c(qhe10, (Class<og0>)hi0.class, false);
            }
            case 15: {
                return ((y6w)c).a();
            }
            case 14: {
                return ((x99)c).H0.toString();
            }
            case 13: {
                final qhe qhe11 = (qhe)c;
                e0e.f((Object)qhe11, "parser");
                return uih.c(qhe11, (Class<o8v>)n8v.class, false);
            }
            case 12: {
                final qhe qhe12 = (qhe)c;
                e0e.f((Object)qhe12, "parser");
                return uih.c(qhe12, (Class<k5v>)f5v.class, false);
            }
            case 11: {
                final qhe qhe13 = (qhe)c;
                final sg7$a companion2 = sg7.Companion;
                e0e.f((Object)qhe13, "parser");
                return uih.c(qhe13, (Class<kw7>)kw7$b.class, false);
            }
            case 10: {
                final mgr mgr = (mgr)c;
                final int e = rgr.e;
                return mgr.f;
            }
            case 9: {
                return ((gdv)c).L0;
            }
            case 8: {
                return ((qgv)c).F0;
            }
            case 7: {
                final qhe qhe14 = (qhe)c;
                final it5$a companion3 = it5.Companion;
                e0e.f((Object)qhe14, "input");
                c = uih.c(qhe14, yh5.class, false);
                e0e.c(c);
                return new ht5.a((yh5)c);
            }
            case 6: {
                final qhe qhe15 = (qhe)c;
                final hp5$a companion4 = hp5.Companion;
                e0e.f((Object)qhe15, "input");
                return uih.c(qhe15, (Class<gp5>)gp5$d.class, false);
            }
            case 5: {
                final qhe qhe16 = (qhe)c;
                final lo5$a companion5 = lo5.Companion;
                e0e.f((Object)qhe16, "input");
                return uih.c(qhe16, (Class<mo5>)mo5$c.class, false);
            }
            case 4: {
                final qhe qhe17 = (qhe)c;
                final wi5$a companion6 = wi5.Companion;
                e0e.f((Object)qhe17, "input");
                return uih.c(qhe17, (Class<xi5>)yi5.class, false);
            }
            case 3: {
                final oxb oxb = (oxb)c;
                e0e.f((Object)oxb, "obj");
                return oxb.a;
            }
            case 2: {
                final qhe qhe18 = (qhe)c;
                final zr9$a companion7 = zr9.Companion;
                e0e.f((Object)qhe18, "input");
                final JsonEditControlInitial jsonEditControlInitial = uih.c(qhe18, JsonEditControlInitial.class, false);
                tr9 s;
                if (jsonEditControlInitial != null) {
                    s = jsonEditControlInitial.s();
                }
                else {
                    s = null;
                }
                return s;
            }
            case 1: {
                return ((qsv)c).k.P0;
            }
            case 0: {
                return ((ezw)c).h;
            }
        }
    }
}
