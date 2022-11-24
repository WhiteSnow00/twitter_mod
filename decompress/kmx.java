import com.twitter.nft.subsystem.model.Web3Wallet;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmx
{
    public final List<Web3Wallet> a;
    
    public kmx(final List<Web3Wallet> a) {
        e0e.f((Object)a, "wallets");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof kmx && e0e.a((Object)this.a, (Object)((kmx)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return rh.x("Web3Wallets(wallets=", (List)this.a, ")");
    }
}
