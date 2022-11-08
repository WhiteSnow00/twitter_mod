import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import android.view.ViewGroup;
import androidx.fragment.app.p;
import android.view.LayoutInflater;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yla implements sn6
{
    public final View C0;
    
    public yla(final LayoutInflater layoutInflater, final p p2) {
        zzd.f((Object)layoutInflater, "layoutInflater");
        this.C0 = layoutInflater.inflate(2131623984, (ViewGroup)null);
        if (p2.G(2131431374) == null) {
            final a a = new a(p2);
            a.e(2131431374, (Fragment)new fma(), "TAG_EXPLORE_SETTINGS_FRAGMENT", 1);
            a.c();
        }
    }
    
    public final jn6 c() {
        final jn6$a companion = jn6.Companion;
        final View c0 = this.C0;
        zzd.e((Object)c0, "contentView");
        return companion.a(c0);
    }
}
