import java.util.Map;
import com.twitter.ui.widget.PopupEditText;
import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q6p implements e9p
{
    public final void a(final String s) {
        czd.f((Object)s, "query");
    }
    
    public final void b(final MenuItem menuItem, final PopupEditText popupEditText, final htl htl, final h9p h9p, final efv efv, final String s, final int n, final String s2, final long n2, final String s3, final Map<String, String> map) {
        czd.f((Object)htl, "receiver");
        czd.f((Object)efv, "association");
        czd.f((Object)s, "query");
        czd.f((Object)s2, "querySource");
        czd.f((Object)map, "configurationOptions");
        if (h9p != null) {
            h9p.a(s, n, efv, s2, n2, s3, (Map)map);
        }
    }
    
    public final boolean c(final int n) {
        return n == 0;
    }
    
    public final void d(final String s) {
        czd.f((Object)s, "query");
    }
    
    public final void e() {
    }
    
    public final void release() {
    }
}
