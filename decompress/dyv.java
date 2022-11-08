import android.view.ViewGroup;
import com.twitter.android.unifiedlanding.header.api.di.UnifiedLandingHeaderObjectGraph;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyv
{
    public final Map<Class<? extends bsj>, csj<? extends bsj>> a;
    public UnifiedLandingHeaderObjectGraph b;
    public i06 c;
    
    public dyv(final ibm ibm, final Map<Class<? extends bsj>, ? extends csj<? extends bsj>> a) {
        zzd.f((Object)ibm, "viewReleaseCompletable");
        this.a = (Map<Class<? extends bsj>, csj<? extends bsj>>)a;
        ibm.i((rj)new zut((Object)this, 2));
    }
    
    public final void a(final ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "headerContainer");
        final i06 c = this.c;
        if (c != null) {
            c.onComplete();
        }
        this.c = null;
        viewGroup.removeAllViews();
    }
}
