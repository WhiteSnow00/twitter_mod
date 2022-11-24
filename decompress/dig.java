import tv.periscope.android.hydra.HydraAudioIndicatingProfileImage;
import android.widget.ImageView;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewStub$OnInflateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dig implements ViewStub$OnInflateListener
{
    public final gig F0;
    
    public dig(final gig f0) {
        this.F0 = f0;
    }
    
    public final void onInflate(final ViewStub viewStub, final View view) {
        final gig f0 = this.F0;
        e0e.f((Object)f0, "this$0");
        f0.g = (ImageView)view.findViewById(2131429492);
        f0.h = view.findViewById(2131429493);
        f0.i = (HydraAudioIndicatingProfileImage)view.findViewById(2131429495);
    }
}
