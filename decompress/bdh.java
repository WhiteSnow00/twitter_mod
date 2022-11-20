import android.app.Dialog;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bdh
{
    public final void a(final int n, final int n2, final int n3, final int n4, final nsb<fzv> nsb, final nsb<fzv> nsb2, final Context context) {
        final pmg pmg = new pmg(context, 0);
        pmg.s(n);
        pmg.m(n2);
        ((Dialog)pmg.p(n3, (DialogInterface$OnClickListener)new r5g((Object)nsb, 2)).n(n4, (DialogInterface$OnClickListener)new nr2((Object)nsb2, 3)).create()).show();
    }
}
