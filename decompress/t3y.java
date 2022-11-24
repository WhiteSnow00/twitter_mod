import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import android.view.View;
import java.util.Objects;
import com.google.android.gms.maps.MapView$a;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t3y implements e5y
{
    public final Bundle a;
    public final cm8 b;
    
    public t3y(final cm8 b, final Bundle a) {
        this.b = b;
        this.a = a;
    }
    
    public final int a() {
        return 1;
    }
    
    public final void c() {
        final nbf a = this.b.a;
        final Bundle a2 = this.a;
        final MapView$a mapView$a = (MapView$a)a;
        Objects.requireNonNull(mapView$a);
        try {
            final Bundle bundle = new Bundle();
            kny.g(a2, bundle);
            mapView$a.b.r(bundle);
            kny.g(bundle, a2);
            mapView$a.c = (View)p5j.U0(mapView$a.b.getView());
            mapView$a.a.removeAllViews();
            mapView$a.a.addView(mapView$a.c);
        }
        catch (final RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
}
