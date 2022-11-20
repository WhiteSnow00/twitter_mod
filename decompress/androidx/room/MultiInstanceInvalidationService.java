// 
// Decompiled by Procyon v0.6.0
// 

package androidx.room;

import android.os.IBinder;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import java.util.HashMap;
import android.app.Service;

public class MultiInstanceInvalidationService extends Service
{
    public int D0;
    public final HashMap<Integer, String> E0;
    public final RemoteCallbackList<a> F0;
    public final MultiInstanceInvalidationService$b G0;
    
    public MultiInstanceInvalidationService() {
        this.D0 = 0;
        this.E0 = new HashMap<Integer, String>();
        this.F0 = new RemoteCallbackList<a>(this) {
            public final MultiInstanceInvalidationService a;
            
            public final void onCallbackDied(final IInterface interface1, final Object o) {
                final a a = (a)interface1;
                this.a.E0.remove((int)o);
            }
        };
        this.G0 = new b$a(this) {
            public final MultiInstanceInvalidationService b;
            
            public final void M0(final int n, final String[] array) {
                synchronized (this.b.F0) {
                    final String s = this.b.E0.get(n);
                    if (s == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return;
                    }
                    final int beginBroadcast = this.b.F0.beginBroadcast();
                    int i = 0;
                    while (i < beginBroadcast) {
                        try {
                            final int intValue = (int)this.b.F0.getBroadcastCookie(i);
                            final String s2 = this.b.E0.get(intValue);
                            if (n != intValue) {
                                if (s.equals(s2)) {
                                    try {
                                        ((a)this.b.F0.getBroadcastItem(i)).P(array);
                                    }
                                    catch (final RemoteException ex) {
                                        Log.w("ROOM", "Error invoking a remote callback", (Throwable)ex);
                                    }
                                }
                            }
                            ++i;
                            continue;
                        }
                        finally {
                            this.b.F0.finishBroadcast();
                        }
                        break;
                    }
                    this.b.F0.finishBroadcast();
                }
            }
            
            public final int p1(final a a, final String s) {
                if (s == null) {
                    return 0;
                }
                synchronized (this.b.F0) {
                    final MultiInstanceInvalidationService b = this.b;
                    final int d0 = b.D0 + 1;
                    b.D0 = d0;
                    if (b.F0.register((IInterface)a, (Object)d0)) {
                        this.b.E0.put(d0, s);
                        return d0;
                    }
                    final MultiInstanceInvalidationService b2 = this.b;
                    --b2.D0;
                    return 0;
                }
            }
        };
    }
    
    public final IBinder onBind(final Intent intent) {
        return (IBinder)this.G0;
    }
}
