import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import java.util.Set;
import java.util.Map;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.HashMap;
import android.os.Build$VERSION;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p4j implements omx, j2z, wqy, jmb
{
    public Object C0 = c0;
    
    public p4j(final int n) {
        if (n == 9) {
            this.C0 = new HashSet();
            return;
        }
        if (n != 12) {
            Object c0;
            if (Build$VERSION.SDK_INT >= 28) {
                c0 = new jik();
            }
            else {
                c0 = new jgw();
            }
            this.C0 = c0;
            return;
        }
        this.C0 = new HashMap();
    }
    
    public p4j(final UserIdentifier c0, final ibm ibm, final d5c d5c, final iex iex) {
        zzd.f((Object)c0, "currentUserIdentifier");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)d5c, "globalUriNavigator");
        zzd.f((Object)iex, "visitedUrlRepository");
        this.C0 = c0;
        final hlv b = dta.b();
        boolean b2 = false;
        final boolean b3 = b.b("nudges_android_article_enable_visited_url_tracking", false);
        if (((UserIdentifier)this.C0).getId() > 0L) {
            b2 = true;
        }
        if (b2 && b3) {
            final gex gex = new gex(this, iex);
            if (!d5c.e.contains(gex)) {
                d5c.e.add(gex);
            }
            ibm.i((rj)new uys((Object)d5c, (Object)gex, 10));
        }
    }
    
    public final String[] b() {
        return ((WebViewProviderFactoryBoundaryInterface)this.C0).getSupportedFeatures();
    }
    
    public final void c(final String s, final int n, final Throwable t, final byte[] array, final Map map) {
        ((boz)this.C0).l(s, n, t, array, map);
    }
    
    public final int d(final String s) {
        if (s != null && ((Set)this.C0).contains(s.trim())) {
            return 2;
        }
        return 0;
    }
    
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface)db2.d((Class)WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface)this.C0).getWebkitToCompatConverter());
    }
}
