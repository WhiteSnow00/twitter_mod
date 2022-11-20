import com.twitter.nft.subsystem.model.Web3Wallet;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ulx
{
    public final List<Web3Wallet> a;
    
    public ulx(final List<Web3Wallet> a) {
        czd.f((Object)a, "wallets");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ulx && czd.a((Object)this.a, (Object)((ulx)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return wc0.z("Web3Wallets(wallets=", (List)this.a, ")");
    }
}
