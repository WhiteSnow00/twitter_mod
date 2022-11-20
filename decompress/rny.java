import java.util.Iterator;
import java.util.Collection;
import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.HashSet;
import java.util.Set;
import android.content.Context;
import android.content.IntentFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class rny<StateT>
{
    public final f3a a;
    public final IntentFilter b;
    public final Context c;
    public final Set<o9r<StateT>> d;
    public liy e;
    public volatile boolean f;
    
    public rny(final f3a a, final IntentFilter b, Context c) {
        this.d = new HashSet();
        this.e = null;
        this.f = false;
        this.a = a;
        this.b = b;
        final Context applicationContext = c.getApplicationContext();
        if (applicationContext != null) {
            c = applicationContext;
        }
        this.c = c;
    }
    
    public abstract void a(final Context p0, final Intent p1);
    
    public final void b() {
        if ((this.f || !this.d.isEmpty()) && this.e == null) {
            final liy e = new liy(this);
            this.e = e;
            this.c.registerReceiver((BroadcastReceiver)e, this.b);
        }
        if (!this.f && this.d.isEmpty()) {
            final liy e2 = this.e;
            if (e2 != null) {
                this.c.unregisterReceiver((BroadcastReceiver)e2);
                this.e = null;
            }
        }
    }
    
    public final void c(final StateT stateT) {
        synchronized (this) {
            final Iterator iterator = new HashSet(this.d).iterator();
            while (iterator.hasNext()) {
                ((o9r<StateT>)iterator.next()).a(stateT);
            }
        }
    }
}
