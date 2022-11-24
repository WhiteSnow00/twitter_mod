import java.util.Objects;
import java.util.Map;
import com.twitter.model.json.unifiedcard.JsonUnifiedCard;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dle implements lub
{
    public final JsonUnifiedCard a;
    public final Map b;
    
    public dle(final JsonUnifiedCard a, final Map b) {
        this.a = a;
        this.b = b;
    }
    
    public final Object apply(final Object o) {
        final JsonUnifiedCard a = this.a;
        final Map b = this.b;
        final yde yde = (yde)o;
        Objects.requireNonNull(a);
        if (yde instanceof qdc) {
            final int a2 = o5j.a;
            JsonUnifiedCard.x(b, (qdc)yde);
        }
        if (yde instanceof gec) {
            final Map j = a.j;
            final int a3 = o5j.a;
            JsonUnifiedCard.y(j, (gec)yde);
        }
        return yde;
    }
}
