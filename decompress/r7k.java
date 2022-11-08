import android.view.View;
import androidx.compose.ui.platform.ComposeView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r7k
{
    public final ComposeView a;
    public final e76 b;
    public final fxe<v9l> c;
    public final ocw d;
    public boolean e;
    public boolean f;
    
    public r7k(final ComposeView a, final e76 b, final fxe<v9l> c, final ocw d) {
        zzd.f((Object)a, "followButton");
        zzd.f((Object)b, "composeDependencies");
        zzd.f((Object)c, "profileHeaderListeners");
        zzd.f((Object)d, "userInfo");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        ((View)a).setVisibility(8);
    }
}
