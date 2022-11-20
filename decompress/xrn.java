import android.app.Service;
import android.app.Notification;
import android.os.Parcelable;
import android.util.Log;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;
import com.twitter.rooms.service.RoomService;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xrn
{
    public final Context a;
    public final asn b;
    public final y5o c;
    public final Intent d;
    public final NotificationManager e;
    public boolean f;
    public final xrn$a g;
    
    public xrn(final Context a, final asn b, final y5o c) {
        czd.f((Object)a, "context");
        czd.f((Object)b, "notificationsProvider");
        czd.f((Object)c, "roomServiceBinder");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new Intent(a, (Class)RoomService.class);
        this.e = kn6.c(a, NotificationManager.class);
        this.g = new ServiceConnection(this) {
            public final xrn D0;
            
            public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
                czd.f((Object)componentName, "className");
                czd.f((Object)binder, "serviceBinder");
                this.D0.f = true;
            }
            
            public final void onServiceDisconnected(final ComponentName componentName) {
                czd.f((Object)componentName, "className");
                this.D0.f = false;
                final StringBuilder sb = new StringBuilder();
                sb.append("onServiceDisconnected ");
                sb.append(componentName);
                Log.e("RoomServiceController", sb.toString());
            }
        };
    }
    
    public final void a(final vqn vqn, final String s, final boolean b) {
        czd.f((Object)vqn, "state");
        if (b) {
            if (this.f) {
                this.c(vqn, s);
            }
            else {
                final Notification c = this.b.c(vqn, s);
                if (c != null) {
                    this.d.putExtra("notification", (Parcelable)c);
                    kn6.d(this.a, this.d);
                    this.a.bindService(this.d, (ServiceConnection)this.g, 1);
                }
            }
        }
        else {
            final Notification c2 = this.b.c(vqn, s);
            if (c2 != null) {
                this.d.putExtra("notification", (Parcelable)c2);
                kn6.d(this.a, this.d);
                this.a.bindService(this.d, (ServiceConnection)this.g, 1);
            }
        }
    }
    
    public final void b() {
        if (!this.f) {
            return;
        }
        final RoomService a = this.c.a();
        if (a != null) {
            ((Service)a).stopForeground(true);
        }
        this.a.unbindService((ServiceConnection)this.g);
        this.f = false;
    }
    
    public final void c(final vqn vqn, final String s) {
        czd.f((Object)vqn, "state");
        if (this.f && this.e != null) {
            final Notification c = this.b.c(vqn, s);
            if (c != null) {
                this.e.notify(84726, c);
            }
        }
    }
    
    public final void d(final String s, final String s2, final boolean b) {
        czd.f((Object)s, "title");
        czd.f((Object)s2, "description");
        if (this.f) {
            final Notification b2 = asn.b(this.b, s, s2, b, (String)null, true, 8, (Object)null);
            final NotificationManager e = this.e;
            if (e != null) {
                e.notify(84726, b2);
            }
        }
    }
}
