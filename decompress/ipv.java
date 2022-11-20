import android.os.BaseBundle;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ipv extends hss
{
    public static final int d = 0;
    
    public ipv(final Bundle bundle) {
        super(bundle);
    }
    
    public final String j() {
        return "guide";
    }
    
    public final String l() {
        return ((BaseBundle)((vl1)this).a).getString("arg_tab_position", "main");
    }
    
    public final int n() {
        return 22;
    }
    
    public final pqv o() {
        final mpv mpv = new mpv();
        final String string = ((BaseBundle)((vl1)this).a).getString("arg_request_param_tab_category");
        if (ikr.g((CharSequence)string)) {
            ((qjg)mpv.a).w((Object)"tab_category", (Object)string);
        }
        final String string2 = ((BaseBundle)((vl1)this).a).getString("arg_request_param_sc_category_id");
        if (ikr.g((CharSequence)string2)) {
            ((qjg)mpv.a).w((Object)"sc_category_id", (Object)string2);
        }
        return (pqv)mpv.e();
    }
    
    public final boolean q() {
        return true;
    }
    
    public static final class a extends hss$a<ipv, a>
    {
        public a(final Bundle bundle) {
            super(bundle);
        }
        
        public final Object i() {
            return new ipv(((vl1$a)this).a);
        }
    }
}
