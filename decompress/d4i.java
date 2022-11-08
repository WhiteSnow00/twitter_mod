import android.app.Dialog;
import com.twitter.nft.subsystem.model.Web3Wallet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d4i implements c4i
{
    public final p4i a;
    
    public d4i(final p4i a) {
        zzd.f((Object)a, "nftRepository");
        this.a = a;
    }
    
    @Override
    public final void a(final Context context, final mbi<?> mbi) {
        zzd.f((Object)context, "context");
        zzd.f((Object)mbi, "navigator");
        ((Dialog)new c0i(context, (mbi)mbi)).show();
    }
    
    @Override
    public final void b(final Context context, final mbi<?> mbi, final Web3Wallet web3Wallet) {
        zzd.f((Object)mbi, "navigator");
        zzd.f((Object)web3Wallet, "web3Wallet");
        ((Dialog)new x5i(context, (mbi)mbi, this.a, web3Wallet)).show();
    }
    
    @Override
    public final void c(final Context context, final mbi<?> mbi) {
        zzd.f((Object)context, "context");
        zzd.f((Object)mbi, "navigator");
        this.a.h().G((fk6)new xja((rtb)new d4i$a(this, (mbi)mbi), 23), (fk6)new za6((rtb)d4i$b.C0, 25));
    }
}
