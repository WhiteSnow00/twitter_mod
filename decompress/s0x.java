import android.view.View;
import com.twitter.media.av.autoplay.ui.VideoContainerHost;
import com.twitter.android.liveevent.ui.SlateView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s0x
{
    public final SlateView a;
    public final VideoContainerHost b;
    public int c;
    
    public s0x(final cve cve) {
        czd.f((Object)cve, "contentViewProvider");
        final View viewById = cve.c().getView().findViewById(2131427541);
        czd.e((Object)viewById, "contentViewProvider.cont\u2026ty_live_event_hero_slate)");
        this.a = (SlateView)viewById;
        final View viewById2 = cve.c().getView().findViewById(2131430612);
        czd.e((Object)viewById2, "contentViewProvider.cont\u2026findViewById(R.id.player)");
        this.b = (VideoContainerHost)viewById2;
    }
    
    public final void a(int n) {
        this.c = n;
        final SlateView a = this.a;
        final int n2 = 0;
        int visibility;
        if (n == 3) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)a).setVisibility(visibility);
        final VideoContainerHost b = this.b;
        if (n == 1) {
            n = n2;
        }
        else {
            n = 8;
        }
        ((View)b).setVisibility(n);
    }
}
