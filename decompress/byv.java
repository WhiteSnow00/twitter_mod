import android.content.Intent;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class byv
{
    public final Map<String, cyv> a;
    public final String b;
    
    public byv(final Map<String, ? extends cyv> a, final msm msm) {
        zzd.f((Object)msm, "retainedArgs");
        this.a = (Map<String, cyv>)a;
        final Intent a2 = msm.a;
        zzd.e((Object)a2, "retainedArgs.intent");
        this.b = a2.getStringExtra("ulp_type");
    }
}
