import android.os.IInterface;
import android.os.IBinder;
import android.os.Looper;
import android.content.Context;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d9y extends k5c<g9y>
{
    public final Bundle l1;
    
    public d9y(final Context context, final Looper looper, final lh4 lh4, final zh6 zh6, final whj whj) {
        super(context, looper, 223, lh4, zh6, whj);
        this.l1 = new Bundle();
    }
    
    public final Bundle B() {
        return this.l1;
    }
    
    public final String E() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }
    
    public final String F() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
    }
    
    public final boolean G() {
        return true;
    }
    
    public final boolean I() {
        return true;
    }
    
    public final int r() {
        return 17895000;
    }
    
    public final /* bridge */ IInterface x(final IBinder binder) {
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
            if (queryLocalInterface instanceof g9y) {
                o = queryLocalInterface;
            }
            else {
                o = new g9y(binder);
            }
        }
        return (IInterface)o;
    }
    
    public final gta[] z() {
        return c7y.d;
    }
}
