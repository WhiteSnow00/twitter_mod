import android.net.Uri;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yzl extends af4
{
    public final /* synthetic */ Context I0;
    
    public yzl(final int n, final int n2, final Context i0) {
        this.I0 = i0;
        super(n, n2, true);
    }
    
    public final void onClick(final View view) {
        final Context i0 = this.I0;
        final cn a = bn.a();
        final Context i2 = this.I0;
        i0.startActivity(a.a(i2, (zm)new dmx(Uri.parse(i2.getString(2131953490)))));
    }
}
