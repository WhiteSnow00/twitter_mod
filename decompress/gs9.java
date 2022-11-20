import android.net.Uri;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gs9 extends xi1
{
    public static final gs9.gs9$b Companion;
    
    static {
        Companion = new gs9.gs9$b();
    }
    
    public gs9(final Intent intent) {
        super(intent);
    }
    
    public static final class a extends xi1.a<gs9, xi1$b>
    {
        public final Object i() {
            final Intent a = super.a;
            czd.e((Object)a, "mIntent");
            return new gs9(a);
        }
        
        public final a q(final Uri data) {
            czd.f((Object)data, "uri");
            super.a.setData(data);
            return this;
        }
    }
}
