import android.os.BaseBundle;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tpv extends bts
{
    public static final int d = 0;
    
    public tpv(final Bundle bundle) {
        super(bundle);
    }
    
    public final String j() {
        return "guide";
    }
    
    public final String l() {
        return ((BaseBundle)((am1)this).a).getString("arg_tab_position", "main");
    }
    
    public final int n() {
        return 22;
    }
    
    public final arv o() {
        final xpv xpv = new xpv();
        final String string = ((BaseBundle)((am1)this).a).getString("arg_request_param_tab_category");
        if (flr.g((CharSequence)string)) {
            ((kkg)xpv.a).w((Object)"tab_category", (Object)string);
        }
        final String string2 = ((BaseBundle)((am1)this).a).getString("arg_request_param_sc_category_id");
        if (flr.g((CharSequence)string2)) {
            ((kkg)xpv.a).w((Object)"sc_category_id", (Object)string2);
        }
        return (arv)((z4j)xpv).e();
    }
    
    public final boolean q() {
        return true;
    }
    
    public static final class a extends bts$a<tpv, a>
    {
        public a(final Bundle bundle) {
            super(bundle);
        }
        
        public final Object i() {
            return new tpv(((am1.a)this).a);
        }
    }
}
