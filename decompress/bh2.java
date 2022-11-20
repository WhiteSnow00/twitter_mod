import java.util.Date;
import tv.periscope.model.b;
import java.text.SimpleDateFormat;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bh2
{
    public final Context a;
    public final n4s b;
    
    public bh2(final Context a) {
        czd.f((Object)a, "context");
        this.a = a;
        this.b = (n4s)pps.n((nsb)new nsb<SimpleDateFormat>(this) {
            public final bh2 D0;
            
            public final Object invoke() {
                return new SimpleDateFormat(yqs.i(this.D0.a), m5s.d());
            }
        });
    }
    
    public final String a(final b b) {
        final Long v = b.V();
        if (v == null) {
            return null;
        }
        return this.a.getString(2131952256, new Object[] { ((SimpleDateFormat)this.b.getValue()).format(new Date(v.longValue())) });
    }
}
