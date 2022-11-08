import java.util.Map;
import com.twitter.ui.widget.PopupEditText;
import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z4p implements k8p
{
    @Override
    public final void a(final String s) {
        zzd.f((Object)s, "query");
    }
    
    @Override
    public final void b(final MenuItem menuItem, final PopupEditText popupEditText, final ssl ssl, final n8p n8p, final jev jev, final String s, final int n, final String s2, final long n2, final String s3, final Map<String, String> map) {
        zzd.f((Object)ssl, "receiver");
        zzd.f((Object)jev, "association");
        zzd.f((Object)s, "query");
        zzd.f((Object)s2, "querySource");
        zzd.f((Object)map, "configurationOptions");
        if (n8p != null) {
            n8p.a(s, n, jev, s2, n2, s3, map);
        }
    }
    
    @Override
    public final boolean c(final int n) {
        boolean b = true;
        if (n != 1) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final void d(final String s) {
        zzd.f((Object)s, "query");
    }
}
