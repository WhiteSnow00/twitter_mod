import android.net.Uri;
import android.os.Bundle;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class hoa implements moa
{
    public final List<String> a;
    
    public hoa(final List a) {
        this.a = a;
    }
    
    public final Bundle a(final ayp ayp, final String s) {
        e0e.f((Object)ayp, "sharedItemContent");
        e0e.f((Object)s, "sessionToken");
        return new Bundle();
    }
    
    public final List<String> b() {
        return this.a;
    }
    
    public final boolean c(final zxp zxp) {
        e0e.f((Object)zxp, "sharedItem");
        return true;
    }
    
    public abstract Uri d();
    
    public abstract Uri e(final ayp p0, final String p1);
}
