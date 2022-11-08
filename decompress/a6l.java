import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a6l extends gue implements rtb<r6l, oyv>
{
    public final /* synthetic */ r5l C0;
    
    public a6l(final r5l c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final r6l r6l = (r6l)o;
        zzd.f((Object)r6l, "$this$distinct");
        final ViewGroup l0 = this.C0.L0;
        zzd.e((Object)l0, "moduleRow");
        int visibility;
        if (r6l.c) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)l0).setVisibility(visibility);
        return oyv.a;
    }
}
