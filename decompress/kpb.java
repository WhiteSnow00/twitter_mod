import android.os.Handler;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager$c;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager$b;
import java.util.Objects;
import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.g$b;
import com.google.android.exoplayer2.drm.h;
import android.media.MediaDrm$OnEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kpb implements MediaDrm$OnEventListener
{
    public final h a;
    public final g$b b;
    
    public kpb(final h a, final g$b b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onEvent(final MediaDrm mediaDrm, final byte[] array, final int n, final int n2, final byte[] array2) {
        final h a = this.a;
        final g$b b = this.b;
        Objects.requireNonNull(a);
        final DefaultDrmSessionManager$c y = ((DefaultDrmSessionManager$b)b).a.y;
        Objects.requireNonNull(y);
        ((Handler)y).obtainMessage(n, (Object)array).sendToTarget();
    }
}
