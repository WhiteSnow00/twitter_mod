import android.os.BaseBundle;
import android.os.IInterface;
import android.os.IBinder;
import java.util.Objects;
import android.os.Bundle;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a6y extends k5c<i5y>
{
    public final jes l1;
    
    public a6y(final Context context, final Looper looper, final lh4 lh4, final jes l1, final zh6 zh6, final whj whj) {
        super(context, looper, 270, lh4, zh6, whj);
        this.l1 = l1;
    }
    
    public final Bundle B() {
        final jes l1 = this.l1;
        Objects.requireNonNull(l1);
        final Bundle bundle = new Bundle();
        final String f0 = l1.F0;
        if (f0 != null) {
            ((BaseBundle)bundle).putString("api", f0);
        }
        return bundle;
    }
    
    public final String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }
    
    public final String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }
    
    public final boolean G() {
        return true;
    }
    
    public final int r() {
        return 203400000;
    }
    
    public final IInterface x(final IBinder binder) {
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
            if (queryLocalInterface instanceof i5y) {
                o = queryLocalInterface;
            }
            else {
                o = new i5y(binder);
            }
        }
        return (IInterface)o;
    }
    
    public final gta[] z() {
        return l4y.b;
    }
}
