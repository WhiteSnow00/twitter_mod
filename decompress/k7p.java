import java.util.Map;
import com.twitter.ui.widget.PopupEditText;
import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k7p implements w9p
{
    @Override
    public final void a(final String s) {
        e0e.f((Object)s, "query");
    }
    
    @Override
    public final void b(final MenuItem menuItem, final PopupEditText popupEditText, final stl stl, final z9p z9p, final sfv sfv, final String s, final int n, final String s2, final long n2, final String s3, final Map<String, String> map) {
        e0e.f((Object)stl, "receiver");
        e0e.f((Object)sfv, "association");
        e0e.f((Object)s, "query");
        e0e.f((Object)s2, "querySource");
        e0e.f((Object)map, "configurationOptions");
        if (z9p != null) {
            z9p.a(s, n, sfv, s2, n2, s3, (Map)map);
        }
    }
    
    @Override
    public final boolean c(final int n) {
        return n == 0;
    }
    
    @Override
    public final void d(final String s) {
        e0e.f((Object)s, "query");
    }
    
    @Override
    public final void e() {
    }
    
    @Override
    public final void release() {
    }
}
