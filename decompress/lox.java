import android.os.BaseBundle;
import java.util.Map;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lox extends hss
{
    public final long d;
    
    public lox(final Bundle bundle) {
        super(bundle);
        this.d = ((BaseBundle)bundle).getLong("arg_similar_to_user_id");
    }
    
    public final String j() {
        return "similar_to";
    }
    
    public final String l() {
        return "";
    }
    
    public final int n() {
        return 1;
    }
    
    public final pqv o() {
        final qjg$a qjg$a = new qjg$a(4);
        ((qjg)qjg$a).w((Object)"user_id", (Object)Long.toString(this.d));
        ((qjg)qjg$a).w((Object)"display_location", (Object)"st-component");
        ((qjg)qjg$a).w((Object)"pc", (Object)"true");
        ((qjg)qjg$a).w((Object)"connections", (Object)"true");
        return new pqv((Map)((n4j)qjg$a).e());
    }
    
    public final boolean q() {
        return false;
    }
    
    public static final class a extends hss$a<lox, a>
    {
        public a() {
            super(new Bundle());
        }
        
        public final Object i() {
            return new lox(((vl1$a)this).a);
        }
    }
}
