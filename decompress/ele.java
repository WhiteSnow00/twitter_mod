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

public final class ele implements x2j
{
    public final JsonUnifiedCard a;
    public final Map b;
    public final Map c;
    
    public ele(final JsonUnifiedCard a, final Map b, final Map c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object apply(final Object o) {
        final JsonUnifiedCard a = this.a;
        final Map b = this.b;
        final Map c = this.c;
        final eih eih = (eih)o;
        Objects.requireNonNull(a);
        vmw.g((Object)eih);
        if (eih instanceof gec) {
            final Map j = a.j;
            final int a2 = o5j.a;
            JsonUnifiedCard.y(j, (gec)eih);
        }
        if (eih instanceof dfc) {
            final Map l = a.l;
            final int a3 = o5j.a;
            final dfc dfc = (dfc)eih;
            final String a4 = dfc.a();
            if (flr.g((CharSequence)a4)) {
                final qgv qgv = l.get(a4);
                vmw.g((Object)qgv);
                dfc.b(qgv);
            }
        }
        if (eih instanceof gfc) {
            final Map i = a.l;
            final int a5 = o5j.a;
            final gfc gfc = (gfc)eih;
            final List c2 = gfc.c();
            final ArrayList<qgv> list = new ArrayList<qgv>();
            if (c2 != null) {
                for (final String s : c2) {
                    if (flr.g((CharSequence)s)) {
                        final qgv qgv2 = i.get(s);
                        if (qgv2 != null) {
                            list.add(qgv2);
                        }
                        else {
                            r9a.d((Throwable)new Exception("JsonUnifiedCard: Failed to parse user"));
                        }
                    }
                }
            }
            gfc.q((List)list);
        }
        if (eih instanceof qdc) {
            final int a6 = o5j.a;
            JsonUnifiedCard.x(b, (qdc)eih);
        }
        if (eih instanceof adc) {
            final int a7 = o5j.a;
            final adc adc = (adc)eih;
            final ko0 ko0 = c.get(adc.o());
            vmw.g((Object)ko0);
            adc.l(ko0);
        }
        if (eih instanceof uec) {
            final Map k = a.i;
            final int a8 = o5j.a;
            final uec uec = (uec)eih;
            Object string;
            if (uec.g() == null) {
                string = null;
            }
            else {
                string = uec.g().toString();
            }
            if (string != null && k.containsKey(string)) {
                uec.m((JsonCommerceShop)k.get(string));
            }
        }
        if (eih instanceof hdc) {
            final int a9 = o5j.a;
            final hdc hdc = (hdc)eih;
            final Map h = a.h;
            final List m = hdc.j();
            final ArrayList<JsonCommerceItem> list2 = new ArrayList<JsonCommerceItem>();
            final Iterator iterator2 = m.iterator();
            while (iterator2.hasNext()) {
                final JsonCommerceItemResult jsonCommerceItemResult = h.get(iterator2.next());
                if (jsonCommerceItemResult != null) {
                    list2.add(jsonCommerceItemResult.a);
                }
            }
            hdc.e((List)list2);
            final Map j2 = a.j;
            final HashMap<String, wtg> hashMap = new HashMap<String, wtg>();
            for (final String s2 : hdc.d()) {
                hashMap.put(s2, (wtg)j2.get(s2));
            }
            hdc.p((Map)hashMap);
        }
        if (eih instanceof idc) {
            final int a10 = o5j.a;
            kr4.c(((idc)eih).f(), (lub)new dle(a, b));
        }
        return eih.s();
    }
}
