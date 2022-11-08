import java.io.Serializable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cnm extends zl1
{
    public static final cnm.cnm$b Companion;
    
    static {
        Companion = new cnm.cnm$b();
    }
    
    public cnm(final Bundle bundle) {
        super(bundle);
    }
    
    public static final class a extends zl1$a<cnm, a>
    {
        public final ymm b;
        
        public a(final ymm b) {
            this.b = b;
        }
        
        public final Object i() {
            super.a.putSerializable("key_request_inbox", (Serializable)this.b);
            final Bundle a = super.a;
            zzd.e((Object)a, "mBundle");
            return new cnm(a);
        }
    }
}
