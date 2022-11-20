import android.view.View;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import com.twitter.nft.walletconnect.NFTWalletConnectActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q5i extends ste implements qsb<x5i, fzv>
{
    public final k5i D0;
    
    public q5i(final k5i d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final x5i x5i = (x5i)o;
        czd.f((Object)x5i, "$this$distinct");
        if (x5i.c != null && x5i.d != null) {
            this.D0.D0.startActivity(new Intent((Context)this.D0.D0, (Class)NFTWalletConnectActivity.class));
            final k5i d0 = this.D0;
            final Context context = ((View)this.D0.I0).getContext();
            czd.e((Object)context, "recyclerView.context");
            d0.N0 = (Dialog)new d5i(context, x5i.d, x5i.c, (ccj)this.D0.M0, x5i.a);
            final Dialog n0 = this.D0.N0;
            if (n0 != null) {
                n0.show();
            }
        }
        return fzv.a;
    }
}
