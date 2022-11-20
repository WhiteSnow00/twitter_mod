import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czi extends hss
{
    public static final Map<Integer, String> d;
    
    static {
        final qjg t = qjg.t();
        t.w((Object)7, (Object)"all");
        t.w((Object)8, (Object)"mentions");
        t.w((Object)9, (Object)"verified");
        t.w((Object)6, (Object)"super_follows");
        d = (Map)((n4j)t).e();
    }
    
    public czi(final Bundle bundle) {
        super(bundle);
    }
    
    public final String j() {
        return "ntab";
    }
    
    public final String l() {
        String s;
        if ((s = czi.d.get(this.n())) == null) {
            s = "";
        }
        return s;
    }
    
    public final int n() {
        return ((BaseBundle)((vl1)this).a).getInt("notifications_timeline_type", 7);
    }
    
    public final pqv o() {
        return pqv.c;
    }
    
    public final boolean q() {
        return true;
    }
    
    public static final class a extends hss$a<czi, a>
    {
        public a(final Bundle bundle) {
            super(bundle);
        }
        
        public final Object i() {
            return new czi(((vl1$a)this).a);
        }
    }
}
