import android.view.MenuItem;
import android.view.Menu;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yv2 implements gai
{
    public final Resources C0;
    public final snd D0;
    public boolean E0;
    
    public yv2(final Resources c0, final snd d0) {
        zzd.f((Object)c0, "resources");
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final boolean N2(final fai fai, final Menu menu) {
        zzd.f((Object)fai, "navComponent");
        zzd.f((Object)menu, "menu");
        fai.setTitle((CharSequence)this.C0.getString(2131954341));
        fai.z(2131689508, menu);
        return true;
    }
    
    public final int d2(final fai fai) {
        zzd.f((Object)fai, "navComponent");
        final MenuItem item = fai.findItem(2131430011);
        if (item != null) {
            item.setEnabled(this.E0);
        }
        return 2;
    }
}
