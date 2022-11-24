import androidx.recyclerview.widget.RecyclerView$c0;
import com.twitter.media.legacy.widget.AttachmentMediaView$c;
import android.graphics.Point;
import com.twitter.media.legacy.widget.AttachmentMediaView;
import android.view.View;
import android.view.View$OnLongClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxh implements View$OnLongClickListener
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    
    public dxh(final Object g0, final Object h0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final boolean onLongClick(final View view) {
        final int f0 = this.F0;
        boolean b = false;
        final boolean b2 = false;
        switch (f0) {
            default: {
                final AttachmentMediaView attachmentMediaView = (AttachmentMediaView)this.G0;
                final AttachmentMediaView$c f2 = attachmentMediaView.F1;
                if (f2 != null) {
                    f2.e(attachmentMediaView, new Point(attachmentMediaView.K1));
                    b = true;
                }
                return b;
            }
            case 0: {
                final exh exh = (exh)this.G0;
                final gse gse = (gse)this.H0;
                boolean b3 = b2;
                if (exh.J0 != null) {
                    final int l = ((RecyclerView$c0)gse).L();
                    final fxh c = exh.C(l);
                    final int a = o5j.a;
                    final nxh nxh = (nxh)c;
                    final exh$a j0 = exh.J0;
                    final cxh a2 = nxh.a;
                    final kt2 c2 = ((yxh$a)j0).a.c1;
                    if (c2.L0 == null) {
                        c2.g();
                    }
                    c2.h(l);
                    b3 = true;
                }
                return b3;
            }
        }
    }
}
