import android.content.Context;
import android.content.Intent;
import com.twitter.android.settings.dm.DMSettingsActivity;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rpm implements wpm
{
    public final Activity a;
    
    public rpm(final Activity a) {
        czd.f((Object)a, "activity");
        this.a = a;
    }
    
    public final void a() {
        final Intent putExtra = new Intent((Context)this.a, (Class)DMSettingsActivity.class).putExtra("page_render_type", 1);
        czd.e((Object)putExtra, "Intent(activity, DMSetti\u2026wProvider.PageType.MODAL)");
        final Activity a = this.a;
        a.startActivity(putExtra, tn.a((Context)a, 2130772041, 2130772042).b());
    }
    
    public final void c() {
        this.a.finish();
    }
}
