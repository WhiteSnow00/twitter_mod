import android.graphics.Bitmap;
import android.widget.RemoteViews;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpl extends ste implements qsb<tpb, fzv>
{
    public final RemoteViews D0;
    public final int E0;
    public final mv1<tmi> F0;
    
    public gpl(final RemoteViews d0, final int e0, final mv1<tmi> f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final tpb tpb = (tpb)o;
        if (tpb.a.f()) {
            this.D0.setImageViewBitmap(this.E0, (Bitmap)tpb.a.c());
            this.F0.onNext((Object)tmi.a);
        }
        return fzv.a;
    }
}
