import android.view.View;
import android.widget.ProgressBar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgo extends gue implements rtb<mgo, oyv>
{
    public final /* synthetic */ ggo C0;
    
    public kgo(final ggo c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final mgo mgo = (mgo)o;
        zzd.f((Object)mgo, "$this$distinct");
        final ProgressBar g0 = this.C0.G0;
        int visibility;
        if (mgo.b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)g0).setVisibility(visibility);
        return oyv.a;
    }
}
