import android.os.BaseBundle;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Bundle;
import com.google.android.gms.common.api.c$c;
import com.google.android.gms.common.api.c$b;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yrz extends i4c<sxz>
{
    public yrz(final Context context, final Looper looper, final gg4 gg4, final c$b c$b, final c$c c$c) {
        super(context, looper, 148, gg4, (tg6)c$b, (ihj)c$c);
    }
    
    public final Bundle B() {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }
    
    public final String E() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }
    
    public final String F() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }
    
    public final int r() {
        return 13000000;
    }
    
    public final IInterface x(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        if (queryLocalInterface instanceof sxz) {
            return queryLocalInterface;
        }
        return (IInterface)new ryz(binder);
    }
    
    public final yra[] z() {
        return new yra[] { u9y.a };
    }
}
