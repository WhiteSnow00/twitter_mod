import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bjk extends ste implements qsb<nc2$d, fzv>
{
    public final djk D0;
    
    public bjk(final djk d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final nc2$d nc2$d = (nc2$d)o;
        czd.f((Object)nc2$d, "$this$distinct");
        int imageResource;
        if (nc2$d.c) {
            imageResource = 2131232302;
        }
        else {
            imageResource = 2131232353;
        }
        this.D0.D0.setImageResource(imageResource);
        Object o2;
        if (nc2$d.c) {
            o2 = lc2$d.a;
        }
        else {
            o2 = lc2$e.a;
        }
        final djk d0 = this.D0;
        ((View)d0.D0).setOnClickListener((View$OnClickListener)new g8w((Object)d0, o2, 6));
        return fzv.a;
    }
}
