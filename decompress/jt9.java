import android.net.Uri;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jt9 extends aj1
{
    public static final jt9.jt9$b Companion;
    
    static {
        Companion = new jt9.jt9$b();
    }
    
    public jt9(final Intent intent) {
        super(intent);
    }
    
    public static final class a extends aj1.a<jt9, aj1$b>
    {
        public final Object i() {
            final Intent a = super.a;
            e0e.e((Object)a, "mIntent");
            return new jt9(a);
        }
        
        public final a q(final Uri data) {
            e0e.f((Object)data, "uri");
            super.a.setData(data);
            return this;
        }
    }
}
