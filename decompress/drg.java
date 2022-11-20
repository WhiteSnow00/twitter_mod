import com.twitter.media.legacy.widget.MediaAttachmentsLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drg implements Runnable
{
    public final MediaAttachmentsLayout D0;
    public final int E0;
    public final float F0;
    
    public drg(final MediaAttachmentsLayout d0, final int e0, final float f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final void run() {
        final MediaAttachmentsLayout d0 = this.D0;
        final int e0 = this.E0;
        final float f0 = this.F0;
        final int g1 = MediaAttachmentsLayout.g1;
        d0.e(e0, f0);
    }
}
