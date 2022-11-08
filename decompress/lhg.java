import android.os.BaseBundle;
import android.net.Uri;
import android.os.Parcelable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lhg extends jt2
{
    public final /* synthetic */ mhg C0;
    
    public lhg(final mhg c0) {
        this.C0 = c0;
    }
    
    public final void a(final Bundle bundle) {
        final Uri y4 = this.C0.Y4();
        if (y4 != null) {
            bundle.putParcelable("currentTab", (Parcelable)y4);
        }
        bundle.putBoolean("alreadyCheckedExpiredDrafts", this.C0.e2);
        ((BaseBundle)bundle).putInt("saved_state_main_pager_offscreen_limit", this.C0.u1.a.f());
    }
    
    public final void v(final Parcelable parcelable) {
        final Bundle bundle = (Bundle)parcelable;
        final Uri uri = (Uri)bundle.getParcelable("currentTab");
        if (uri != null) {
            this.C0.d5(uri);
        }
        this.C0.e2 = bundle.getBoolean("alreadyCheckedExpiredDrafts", false);
    }
}
