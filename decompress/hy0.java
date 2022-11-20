import java.io.IOException;
import android.content.Context;
import com.twitter.model.json.tracking.JsonAttributionRequestInput;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hy0 extends aj8<JsonAttributionRequestInput, iy0>
{
    public final Context c;
    public final do0 d;
    
    public hy0(final Context c, final do0 d) {
        super((Class)iy0.class, "integration_service");
        this.c = c;
        this.d = d;
    }
    
    public final int g() {
        return 1;
    }
    
    public final void i(final tqc$a tqc$a, Object d) {
        final JsonAttributionRequestInput jsonAttributionRequestInput = (JsonAttributionRequestInput)d;
        try {
            d = new ujr(rih.a((Object)jsonAttributionRequestInput), lm6.G0);
        }
        catch (final IOException ex) {
            m8a.d((Throwable)ex);
            d = null;
        }
        tqc$a.n("/1.1/attribution/event.json", "/");
        final int a = c5j.a;
        tqc$a.e = arc$b.G0;
        tqc$a.d = (vqc)d;
        jy0.a(tqc$a, this.c, "Unable to get system user agent for attribution service.", this.d);
    }
}
