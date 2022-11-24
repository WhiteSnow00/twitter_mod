import java.io.Serializable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hom extends am1
{
    public static final b Companion;
    
    static {
        Companion = new b();
    }
    
    public hom(final Bundle bundle) {
        super(bundle);
    }
    
    public static final class a extends am1.a<hom, a>
    {
        public final dom b;
        
        public a(final dom b) {
            this.b = b;
        }
        
        public final Object i() {
            super.a.putSerializable("key_request_inbox", (Serializable)this.b);
            final Bundle a = super.a;
            e0e.e((Object)a, "mBundle");
            return new hom(a);
        }
    }
    
    public static final class b
    {
    }
}
