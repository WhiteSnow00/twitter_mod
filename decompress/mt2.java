import android.util.SizeF;
import android.util.Size;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mt2
{
    public static final void a(final Bundle bundle, final String s, final Size size) {
        e0e.f((Object)bundle, "bundle");
        e0e.f((Object)s, "key");
        bundle.putSize(s, size);
    }
    
    public static final void b(final Bundle bundle, final String s, final SizeF sizeF) {
        e0e.f((Object)bundle, "bundle");
        e0e.f((Object)s, "key");
        bundle.putSizeF(s, sizeF);
    }
}
