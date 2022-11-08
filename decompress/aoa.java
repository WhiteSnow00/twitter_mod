import android.net.Uri;
import android.os.Bundle;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aoa implements foa
{
    public final List<String> a;
    
    public aoa(final List a) {
        this.a = a;
    }
    
    public final Bundle a(final mwp mwp, final String s) {
        zzd.f((Object)mwp, "sharedItemContent");
        zzd.f((Object)s, "sessionToken");
        return new Bundle();
    }
    
    public final List<String> b() {
        return this.a;
    }
    
    public final boolean c(final lwp lwp) {
        zzd.f((Object)lwp, "sharedItem");
        return true;
    }
    
    public abstract Uri d();
    
    public abstract Uri e(final mwp p0, final String p1);
}
