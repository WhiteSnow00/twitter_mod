import java.io.Serializable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g08 extends am1
{
    public static final g08.g08$b Companion;
    
    static {
        Companion = new g08.g08$b();
    }
    
    public g08(final Bundle bundle) {
        super(bundle);
    }
    
    public static final class a extends am1.a<g08, a>
    {
        public final u28 b;
        
        public a(final u28 b) {
            e0e.f((Object)b, "type");
            this.b = b;
        }
        
        public final Object i() {
            super.a.putSerializable("key_search_type", (Serializable)this.b);
            final Bundle a = super.a;
            e0e.e((Object)a, "mBundle");
            return new g08(a);
        }
    }
}
