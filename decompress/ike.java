import java.util.Iterator;
import java.util.HashMap;
import com.twitter.model.json.unifiedcard.commerce.JsonCommerceItemResult;
import com.twitter.model.json.unifiedcard.commerce.JsonCommerceItem;
import com.twitter.model.json.unifiedcard.commerce.JsonCommerceShop;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Map;
import com.twitter.model.json.unifiedcard.JsonUnifiedCard;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ike implements k2j
{
    public final JsonUnifiedCard a;
    public final Map b;
    public final Map c;
    
    public ike(final JsonUnifiedCard a, final Map b, final Map c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object apply(Object o) {
        final JsonUnifiedCard a = this.a;
        final Map b = this.b;
        final Map c = this.c;
        final qhh qhh = (qhh)o;
        Objects.requireNonNull(a);
        jee.l((Object)qhh);
        if (qhh instanceof edc) {
            final Map j = a.j;
            final int a2 = c5j.a;
            JsonUnifiedCard.y(j, (edc)qhh);
        }
        if (qhh instanceof bec) {
            final Map l = a.l;
            final int a3 = c5j.a;
            final bec bec = (bec)qhh;
            final String a4 = bec.a();
            if (ikr.g((CharSequence)a4)) {
                final cgv cgv = l.get(a4);
                jee.l((Object)cgv);
                bec.b(cgv);
            }
        }
        if (qhh instanceof eec) {
            final Map i = a.l;
            final int a5 = c5j.a;
            final eec eec = (eec)qhh;
            final List d = eec.d();
            o = new ArrayList();
            if (d != null) {
                for (final String s : d) {
                    if (ikr.g((CharSequence)s)) {
                        final cgv cgv2 = i.get(s);
                        if (cgv2 != null) {
                            ((ArrayList<cgv>)o).add(cgv2);
                        }
                        else {
                            m8a.d((Throwable)new Exception("JsonUnifiedCard: Failed to parse user"));
                        }
                    }
                }
            }
            eec.q((List)o);
        }
        if (qhh instanceof occ) {
            final int a6 = c5j.a;
            JsonUnifiedCard.x(b, (occ)qhh);
        }
        if (qhh instanceof ybc) {
            final int a7 = c5j.a;
            final ybc ybc = (ybc)qhh;
            final lo0 lo0 = c.get(ybc.o());
            jee.l((Object)lo0);
            ybc.l(lo0);
        }
        if (qhh instanceof sdc) {
            final Map k = a.i;
            final int a8 = c5j.a;
            final sdc sdc = (sdc)qhh;
            Object string;
            if (sdc.g() == null) {
                string = null;
            }
            else {
                string = sdc.g().toString();
            }
            if (string != null && k.containsKey(string)) {
                sdc.m((JsonCommerceShop)k.get(string));
            }
        }
        if (qhh instanceof fcc) {
            final int a9 = c5j.a;
            final fcc fcc = (fcc)qhh;
            final Map h = a.h;
            final List<String> m = fcc.j();
            final ArrayList<JsonCommerceItem> list = new ArrayList<JsonCommerceItem>();
            final Iterator<String> iterator2 = m.iterator();
            while (iterator2.hasNext()) {
                final JsonCommerceItemResult jsonCommerceItemResult = h.get(iterator2.next());
                if (jsonCommerceItemResult != null) {
                    list.add(jsonCommerceItemResult.a);
                }
            }
            fcc.e(list);
            final Map j2 = a.j;
            final HashMap<String, dtg> hashMap = new HashMap<String, dtg>();
            for (final String s2 : fcc.c()) {
                hashMap.put(s2, (dtg)j2.get(s2));
            }
            fcc.p(hashMap);
        }
        if (qhh instanceof gcc) {
            final int a10 = c5j.a;
            fq4.c(((gcc)qhh).f(), (jtb)new hke(a, b));
        }
        return qhh.s();
    }
}
