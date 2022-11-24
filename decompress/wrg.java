import android.view.View;
import android.view.View$DragShadowBuilder;
import android.content.ClipData;
import android.net.Uri;
import com.twitter.media.legacy.widget.AttachmentMediaView;
import com.twitter.media.legacy.widget.MediaAttachmentsLayout$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wrg implements wpo
{
    public final MediaAttachmentsLayout$a F0;
    public final AttachmentMediaView G0;
    public final Uri H0;
    public final int I0;
    
    public wrg(final MediaAttachmentsLayout$a f0, final AttachmentMediaView g0, final Uri h0, final int i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final Object call() {
        final MediaAttachmentsLayout$a f0 = this.F0;
        final AttachmentMediaView g0 = this.G0;
        return ((View)f0.a.g(g0.getAttachmentMediaKey())).startDrag(ClipData.newRawUri((CharSequence)"image", g0.getAttachmentMediaKey()), (View$DragShadowBuilder)f0.a.R0, (Object)this.H0, this.I0);
    }
}
