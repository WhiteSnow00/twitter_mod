import java.util.Objects;
import java.util.Map;
import com.twitter.model.json.unifiedcard.JsonUnifiedCard;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hke implements jtb
{
    public final JsonUnifiedCard a;
    public final Map b;
    
    public hke(final JsonUnifiedCard a, final Map b) {
        this.a = a;
        this.b = b;
    }
    
    public final Object apply(final Object o) {
        final JsonUnifiedCard a = this.a;
        final Map b = this.b;
        final ade ade = (ade)o;
        Objects.requireNonNull(a);
        if (ade instanceof occ) {
            final int a2 = c5j.a;
            JsonUnifiedCard.x(b, (occ)ade);
        }
        if (ade instanceof edc) {
            final Map j = a.j;
            final int a3 = c5j.a;
            JsonUnifiedCard.y(j, (edc)ade);
        }
        return ade;
    }
}
