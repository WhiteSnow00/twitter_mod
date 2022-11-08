import android.os.BaseBundle;
import android.os.Bundle;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class yna implements foa
{
    public final List<String> a;
    public final int b;
    public final int c;
    
    public yna(final List a, final int b, final int c, final hg8 hg8) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Bundle a(final mwp mwp, final String s) {
        zzd.f((Object)mwp, "sharedItemContent");
        zzd.f((Object)s, "sessionToken");
        final mwp a = mwp.a(this.b, s);
        final Bundle bundle = new Bundle();
        final int d = nb0.D(this.c);
        if (d != 0) {
            if (d == 1) {
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
    
    public final boolean c(final lwp lwp) {
        zzd.f((Object)lwp, "sharedItem");
        return true;
    }
}
