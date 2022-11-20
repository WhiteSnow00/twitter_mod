import java.util.Iterator;
import android.os.RemoteException;
import android.os.IBinder$DeathRecipient;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rcy implements IBinder$DeathRecipient
{
    public final yfy a;
    
    public rcy(final yfy a) {
        this.a = a;
    }
    
    public final void binderDied() {
        final yfy a = this.a;
        a.b.l("reportBinderDeath", new Object[0]);
        final bey bey = a.j.get();
        if (bey != null) {
            a.b.l("calling onBinderDied", new Object[0]);
            bey.a();
        }
        else {
            a.b.l("%s : Binder has died.", a.c);
            final Iterator iterator = a.d.iterator();
            while (iterator.hasNext()) {
                ((icy)iterator.next()).b((Exception)new RemoteException(String.valueOf(a.c).concat(" : Binder has died.")));
            }
            a.d.clear();
        }
        a.d();
    }
}
