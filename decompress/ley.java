import android.os.BaseBundle;
import com.google.android.play.core.assetpacks.AssetPackException;
import android.os.RemoteException;
import android.os.Bundle;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class ley<T> extends k000
{
    public final ffz<T> a;
    public final shy b;
    
    public ley(final shy b, final ffz<T> a) {
        this.b = b;
        this.a = a;
    }
    
    public void G(final List<Bundle> list) {
        this.b.d.c(this.a);
        shy.g.l("onGetSessionStates", new Object[0]);
    }
    
    public void J0(final Bundle bundle, final Bundle bundle2) {
        this.b.d.c(this.a);
        shy.g.l("onKeepAlive(%b)", bundle.getBoolean("keep_alive"));
    }
    
    public void W0(final Bundle bundle, final Bundle bundle2) throws RemoteException {
        this.b.d.c(this.a);
        shy.g.l("onGetChunkFileDescriptor", new Object[0]);
    }
    
    public void m(final Bundle bundle) {
        this.b.d.c(this.a);
        final int int1 = ((BaseBundle)bundle).getInt("error_code");
        shy.g.j("onError(%d)", int1);
        this.a.a((Exception)new AssetPackException(int1));
    }
}
