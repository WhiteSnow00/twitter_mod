import com.twitter.model.json.unifiedcard.componentitems.JsonButton;
import com.twitter.model.json.unifiedcard.JsonUnifiedCardException;
import com.twitter.model.json.unifiedcard.JsonUnifiedCard;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fle implements x2j
{
    public final Map a;
    public final Map b;
    public final Map c;
    
    public fle(final Map a, final Map b, final Map c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object apply(final Object o) {
        final Map a = this.a;
        final Map b = this.b;
        final Map c = this.c;
        final eih eih = (eih)o;
        if (eih instanceof qdc) {
            final int a2 = o5j.a;
            final qdc qdc = (qdc)eih;
            final String k = qdc.k();
            if (flr.g((CharSequence)k)) {
                final eih eih2 = a.get(k);
                if (eih2 != null) {
                    JsonUnifiedCard.w(eih2, b, c);
                    qdc.n((ls8)eih2.s());
                }
                else {
                    r9a.d((Throwable)new JsonUnifiedCardException(mqb.l("missing nested Destination for destination key ", k)));
                }
            }
        }
        if (eih instanceof lec) {
            final int a3 = o5j.a;
            final JsonButton h = ((lec)eih).h();
            if (h != null) {
                final String a4 = h.a;
                if (a4 != null) {
                    if (!a4.isEmpty()) {
                        final eih eih3 = a.get(a4);
                        if (eih3 != null) {
                            JsonUnifiedCard.w(eih3, b, c);
                            h.h = (ls8)eih3.s();
                        }
                        else {
                            r9a.d((Throwable)new JsonUnifiedCardException(mqb.l("missing nested Destination for destination key ", a4)));
                        }
                    }
                }
            }
        }
        JsonUnifiedCard.w(eih, b, c);
        return eih.s();
    }
}
