import android.os.IInterface;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class c000 extends qiy implements szz
{
    public static szz x(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface instanceof szz) {
            return (szz)queryLocalInterface;
        }
        return (szz)new n000(binder);
    }
}
