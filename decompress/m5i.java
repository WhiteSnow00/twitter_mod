import com.twitter.nft.subsystem.model.Web3Wallet;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.nft.subsystem.api.args.NFTGalleryContentViewArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m5i extends ste implements qsb<x5i, fzv>
{
    public final k5i D0;
    
    public m5i(final k5i d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final x5i x5i = (x5i)o;
        czd.f((Object)x5i, "$this$distinct");
        final Web3Wallet b = x5i.b;
        if (b != null) {
            final k5i d0 = this.D0;
            final StringBuilder sb = new StringBuilder();
            sb.append("navigate to NFTGalleryContentViewArgs ");
            sb.append(b);
            s9g.a("NFT_TAG", sb.toString());
            d0.D0.finish();
            d0.G0.b((ContentViewArgs)new NFTGalleryContentViewArgs(x5i.b, true));
        }
        return fzv.a;
    }
}
