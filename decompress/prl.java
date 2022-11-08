import androidx.fragment.app.Fragment;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View$OnClickListener;
import android.view.View$OnLongClickListener;
import android.os.Bundle;
import android.view.View;
import com.twitter.android.qrcodes.view.QRCodeView;
import com.twitter.android.qrcodes.a;

// 
// Decompiled by Procyon v0.6.0
// 

public class prl extends a
{
    public final rd6 W1;
    public QRCodeView X1;
    public hfv Y1;
    public ark Z1;
    
    public prl() {
        this.W1 = new rd6();
    }
    
    public final void D1(final View view, final Bundle bundle) {
        (this.X1 = (QRCodeView)view.findViewById(2131430834)).setUser(this.Y1);
        tbx.v((View)this.X1, (View$OnLongClickListener)new mrl(this));
        ((View)this.X1).setOnClickListener((View$OnClickListener)new qi2((Object)this, 6));
    }
    
    public final View g2(final LayoutInflater layoutInflater, final Bundle bundle) {
        return layoutInflater.inflate(2131625450, (ViewGroup)null);
    }
    
    public final void i2() {
        this.Z1.a(ijf.w((Object)new zqk(((Fragment)this).W0(2131957374), (zqk$a)new on3((Object)this, 13)), (Object[])new zqk[] { new zqk(((Fragment)this).W0(2131958027), (zqk$a)new zga(this, ((Fragment)this).N0(), 8)) }));
    }
    
    public final void k1(final Bundle bundle) {
        super.k1(bundle);
        this.Y1 = ncw.b(((wl1)this).K1).getUser();
        this.Z1 = new ark(((Fragment)this).N0());
    }
    
    public final void o1() {
        this.W1.dispose();
        super.o1();
    }
}
