import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import android.view.View;
import java.util.Objects;
import com.google.android.gms.maps.MapView;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j2y implements u3y
{
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ ol8 b;
    
    public j2y(final ol8 b, final Bundle a) {
        this.b = b;
        this.a = a;
    }
    
    public final int a() {
        return 1;
    }
    
    public final void c() {
        final fbf a = this.b.a;
        final Bundle a2 = this.a;
        final MapView.a a3 = (MapView.a)a;
        Objects.requireNonNull(a3);
        try {
            final Bundle bundle = new Bundle();
            amy.N(a2, bundle);
            a3.b.r(bundle);
            amy.N(bundle, a2);
            a3.c = (View)x4j.U0(a3.b.getView());
            a3.a.removeAllViews();
            a3.a.addView(a3.c);
        }
        catch (final RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
}
