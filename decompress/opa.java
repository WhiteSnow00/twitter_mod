import com.twitter.gallerygrid.api.GalleryGridContentViewArgs;
import com.twitter.gallerygrid.api.GalleryGridMediaAttachedResult;
import android.view.View;
import android.content.Context;
import com.twitter.nft.subsystem.model.Web3Wallet;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class opa implements View$OnClickListener
{
    public final int F0;
    public final fci G0;
    public final Object H0;
    public final Object I0;
    public final Object J0;
    public final Object K0;
    
    public opa(final hpa h0, final zl1 i0, final fci g0, final zrm j0, final jo6 k0) {
        this.F0 = 0;
        this.H0 = h0;
        this.I0 = i0;
        this.G0 = g0;
        this.J0 = j0;
        this.K0 = k0;
    }
    
    public opa(final s6i h0, final k5i i0, final Web3Wallet j0, final Context k0, final fci g0) {
        this.F0 = 1;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.G0 = g0;
    }
    
    public final void onClick(final View view) {
        switch (this.F0) {
            default: {
                final s6i s6i = (s6i)this.H0;
                final k5i k5i = (k5i)this.I0;
                final Web3Wallet web3Wallet = (Web3Wallet)this.J0;
                final Context context = (Context)this.K0;
                final fci g0 = this.G0;
                final int w0 = s6i.W0;
                e0e.f((Object)s6i, "this$0");
                e0e.f((Object)k5i, "$nftRepository");
                e0e.f((Object)web3Wallet, "$web3Wallet");
                e0e.f((Object)context, "$context");
                e0e.f((Object)g0, "$navigator");
                sbw.b((tlm)q0i$a0.a);
                s6i.U0.a(k5i.a(web3Wallet.getAddress()).G((rk6)new cyt((stb)new s6i$a(s6i, context, g0), 3), (rk6)new gh5((stb)s6i$b.F0, 26)));
                return;
            }
            case 0: {
                final hpa hpa = (hpa)this.H0;
                final zl1 zl1 = (zl1)this.I0;
                final fci g2 = this.G0;
                final zrm zrm = (zrm)this.J0;
                final jo6 jo6 = (jo6)this.K0;
                hpa.a("gallery", "click");
                final String[] w2 = jxb.w2;
                if (nxb.a((Context)zl1)) {
                    g2.a(GalleryGridMediaAttachedResult.class).d((Object)new GalleryGridContentViewArgs("composition", (cxw)cxw$d.h, 0));
                }
                else {
                    jo6.d((Object)k7k.a(zrm.b.getString(2131954188), (Context)zl1, jxb.w2).e());
                }
            }
        }
    }
}
