import android.os.BaseBundle;
import android.os.Bundle;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class foa implements moa
{
    public final List<String> a;
    public final int b;
    public final int c;
    
    public foa(final List a, final int b, final int c, final wg8 wg8) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Bundle a(ayp a, final String s) {
        e0e.f((Object)a, "sharedItemContent");
        e0e.f((Object)s, "sessionToken");
        a = a.a(this.b, s);
        final Bundle bundle = new Bundle();
        final int g = lb0.G(this.c);
        if (g != 0) {
            if (g == 1) {
                ((BaseBundle)bundle).putString("android.intent.extra.TEXT", a.d);
            }
        }
        else {
            ((BaseBundle)bundle).putString("android.intent.extra.TEXT", a.c.b);
            ((BaseBundle)bundle).putString("android.intent.extra.SUBJECT", a.c.a);
        }
        return bundle;
    }
    
    public final List<String> b() {
        return this.a;
    }
    
    public final boolean c(final zxp zxp) {
        e0e.f((Object)zxp, "sharedItem");
        return true;
    }
}
