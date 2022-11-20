import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mci extends gi6<udi>
{
    public mci(final ki6<udi> ki6) {
        czd.f((Object)ki6, "tracker");
        super((ki6)ki6);
    }
    
    public final boolean b(final rsx rsx) {
        czd.f((Object)rsx, "workSpec");
        return rsx.j.a == 2;
    }
    
    public final boolean c(final Object o) {
        final udi udi = (udi)o;
        czd.f((Object)udi, "value");
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b = true;
        if (sdk_INT >= 26) {
            boolean b2 = b;
            if (!udi.a) {
                return b2;
            }
            if (!udi.b) {
                b2 = b;
                return b2;
            }
        }
        else if (!udi.a) {
            return b;
        }
        return false;
    }
}
