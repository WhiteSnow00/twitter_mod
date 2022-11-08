import android.app.Dialog;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adh
{
    public final void a(final int n, final int n2, final int n3, final int n4, final otb<oyv> otb, final otb<oyv> otb2, final Context context) {
        final qmg qmg = new qmg(context, 0);
        qmg.s(n);
        qmg.m(n2);
        ((Dialog)qmg.p(n3, (DialogInterface$OnClickListener)new yr2((Object)otb, 5)).n(n4, (DialogInterface$OnClickListener)new xr2((Object)otb2, 1)).create()).show();
    }
}
