import android.os.IInterface;
import com.google.android.gms.location.LocationRequest;
import android.os.RemoteException;
import java.util.Iterator;
import android.app.PendingIntent;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rfy
{
    public final onz a;
    public final Context b;
    public boolean c;
    public final Map<tmf$a<u5g>, ehy> d;
    public final Map<tmf$a<Object>, sgy> e;
    public final Map<tmf$a<Object>, agy> f;
    
    public rfy(final Context b, final onz a) {
        this.c = false;
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.b = b;
        this.a = a;
    }
    
    public final void a() throws RemoteException {
        synchronized (this.d) {
            for (final ehy ehy : this.d.values()) {
                if (ehy != null) {
                    ((oey)this.a.b()).N1(aky.r((l000)ehy, (zcy)null));
                }
            }
            this.d.clear();
            monitorexit(this.d);
            HashMap hashMap = this.f;
            synchronized (this.d) {
                for (final agy agy : this.f.values()) {
                    if (agy != null) {
                        ((oey)this.a.b()).N1(new aky(2, (qjy)null, (IBinder)null, (PendingIntent)null, (IBinder)agy, (IBinder)null));
                    }
                }
                this.f.clear();
                monitorexit(this.d);
                hashMap = this.e;
                synchronized (this.d) {
                    for (final sgy sgy : this.e.values()) {
                        if (sgy != null) {
                            ((oey)this.a.b()).o0(new ntz(2, null, (IBinder)sgy, null));
                        }
                    }
                    this.e.clear();
                }
            }
        }
    }
    
    public final void b(final LocationRequest locationRequest, final tmf<u5g> tmf, final zcy zcy) throws RemoteException {
        this.a.a();
        synchronized (this.d) {
            ehy ehy;
            if ((ehy = this.d.get(tmf.c)) == null) {
                ehy = new ehy(tmf);
            }
            this.d.put(tmf.c, ehy);
            monitorexit(this.d);
            ((oey)this.a.b()).N1(new aky(1, new qjy(locationRequest, qjy.K0, (String)null, false, false, false, (String)null), (IBinder)ehy, (PendingIntent)null, (IBinder)null, ((IInterface)zcy).asBinder()));
        }
    }
    
    public final void c() throws RemoteException {
        if (this.c) {
            this.a.a();
            ((oey)this.a.b()).a();
            this.c = false;
        }
    }
}
