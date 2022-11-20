import android.os.BaseBundle;
import android.os.Bundle;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class yma implements ena
{
    public final List<String> a;
    public final int b;
    public final int c;
    
    public yma(final List a, final int b, final int c, final rf8 rf8) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Bundle a(dxp a, final String s) {
        czd.f((Object)a, "sharedItemContent");
        czd.f((Object)s, "sessionToken");
        a = a.a(this.b, s);
        final Bundle bundle = new Bundle();
        final int e = ib0.E(this.c);
        if (e != 0) {
            if (e == 1) {
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
    
    public final boolean c(final cxp cxp) {
        czd.f((Object)cxp, "sharedItem");
        return true;
    }
}
