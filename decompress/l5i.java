import com.twitter.nft.subsystem.model.Web3Wallet;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.nft.subsystem.api.args.NFTGalleryContentViewArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l5i extends gue implements rtb<w5i, oyv>
{
    public final /* synthetic */ j5i C0;
    
    public l5i(final j5i c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final w5i w5i = (w5i)o;
        zzd.f((Object)w5i, "$this$distinct");
        final Web3Wallet b = w5i.b;
        if (b != null) {
            final j5i c0 = this.C0;
            final StringBuilder sb = new StringBuilder();
            sb.append("navigate to NFTGalleryContentViewArgs ");
            sb.append(b);
            cag.a("NFT_TAG", sb.toString());
            c0.C0.finish();
            c0.F0.b((ContentViewArgs)new NFTGalleryContentViewArgs(w5i.b, true));
        }
        return oyv.a;
    }
}
