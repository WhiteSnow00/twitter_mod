import android.app.Service;
import android.os.BaseBundle;
import android.os.RemoteException;
import android.content.ServiceConnection;
import android.content.Intent;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import android.app.PendingIntent;
import android.app.Notification$Builder;
import android.app.NotificationChannel;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.app.NotificationManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cjy extends o100
{
    public final h4a a;
    public final Context b;
    public final dly c;
    public final doz d;
    public final nqy e;
    public final NotificationManager f;
    
    public cjy(final Context b, final dly c, final doz d, final nqy e) {
        this.a = new h4a("AssetPackExtractionService");
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = (NotificationManager)b.getSystemService("notification");
    }
    
    public final void x(Bundle i0, final g200 g200) throws RemoteException {
        synchronized (this) {
            this.a.i("updateServiceState AIDL call", new Object[0]);
            if (jqy.b(this.b)) {
                if (jqy.a(this.b)) {
                    final int int1 = ((BaseBundle)i0).getInt("action_type");
                    final nqy e = this.e;
                    Object o = e.G0;
                    synchronized (o) {
                        e.G0.add(g200);
                        monitorexit(o);
                        if (int1 == 1) {
                            final int sdk_INT = Build$VERSION.SDK_INT;
                            if (sdk_INT >= 26) {
                                o = ((BaseBundle)i0).getString("notification_channel_name");
                                monitorenter(this);
                                if (o == null) {}
                                try {
                                    o = new NotificationChannel("playcore-assetpacks-service-notification-channel", (CharSequence)o, 2);
                                    this.f.createNotificationChannel((NotificationChannel)o);
                                }
                                finally {
                                    monitorexit(this);
                                }
                            }
                            this.d.a(true);
                            final nqy e2 = this.e;
                            final String string = ((BaseBundle)i0).getString("notification_title");
                            final String string2 = ((BaseBundle)i0).getString("notification_subtext");
                            final long long1 = ((BaseBundle)i0).getLong("notification_timeout", 600000L);
                            o = i0.getParcelable("notification_on_click_intent");
                            Notification$Builder notification$Builder;
                            if (sdk_INT >= 26) {
                                notification$Builder = new Notification$Builder(this.b, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(long1);
                            }
                            else {
                                notification$Builder = new Notification$Builder(this.b).setPriority(-2);
                            }
                            if (o instanceof PendingIntent) {
                                notification$Builder.setContentIntent((PendingIntent)o);
                            }
                            final Notification$Builder setOngoing = notification$Builder.setSmallIcon(17301633).setOngoing(false);
                            if ((o = string) == null) {
                                o = "Downloading additional file";
                            }
                            final Notification$Builder setContentTitle = setOngoing.setContentTitle((CharSequence)o);
                            if ((o = string2) == null) {
                                o = "Transferring";
                            }
                            setContentTitle.setSubText((CharSequence)o);
                            final int int2 = ((BaseBundle)i0).getInt("notification_color");
                            if (int2 != 0) {
                                notification$Builder.setColor(int2).setVisibility(-1);
                            }
                            e2.J0 = notification$Builder.build();
                            this.b.bindService(new Intent(this.b, (Class)ExtractionForegroundService.class), (ServiceConnection)this.e, 1);
                            return;
                        }
                        if (int1 == 2) {
                            this.d.a(false);
                            final nqy e3 = this.e;
                            e3.F0.i("Stopping foreground installation service.", new Object[0]);
                            e3.H0.unbindService((ServiceConnection)e3);
                            i0 = (Bundle)e3.I0;
                            if (i0 != null) {
                                synchronized (i0) {
                                    ((Service)i0).stopForeground(true);
                                    ((Service)i0).stopSelf();
                                }
                            }
                            e3.a();
                            return;
                        }
                        this.a.j("Unknown action type received: %d", int1);
                        g200.m(new Bundle());
                        return;
                    }
                }
            }
            g200.m(new Bundle());
        }
    }
}
