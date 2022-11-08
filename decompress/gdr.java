import android.content.Context;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.util.Map;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdr extends gue implements rtb<tdr, oyv>
{
    public final /* synthetic */ cdr C0;
    public final /* synthetic */ View D0;
    
    public gdr(final cdr c0, final View d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final tdr tdr = (tdr)o;
        zzd.f((Object)tdr, "$this$distinct");
        final ViewGroup l0 = this.C0.L0;
        final hsq a = hsq.a;
        final abr a2 = abr.Companion.a(tdr.g);
        final Context context = this.D0.getContext();
        zzd.e((Object)context, "rootView.context");
        ((View)l0).setBackground((Drawable)a.a(context, a2, (Map<abr, GradientDrawable>)hsq.i.getValue(), null));
        return oyv.a;
    }
}
