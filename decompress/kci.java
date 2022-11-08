import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kci extends aj6<rdi>
{
    public kci(final ej6<rdi> ej6) {
        zzd.f((Object)ej6, "tracker");
        super((ej6)ej6);
    }
    
    public final boolean b(final bsx bsx) {
        zzd.f((Object)bsx, "workSpec");
        return bsx.j.a == 2;
    }
    
    public final boolean c(final Object o) {
        final rdi rdi = (rdi)o;
        zzd.f((Object)rdi, "value");
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b = true;
        if (sdk_INT >= 26) {
            boolean b2 = b;
            if (!rdi.a) {
                return b2;
            }
            if (!rdi.b) {
                b2 = b;
                return b2;
            }
        }
        else if (!rdi.a) {
            return b;
        }
        return false;
    }
}
