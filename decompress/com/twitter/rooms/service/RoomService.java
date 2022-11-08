// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.service;

import java.util.Objects;
import android.os.Build$VERSION;
import android.app.Notification;
import android.os.IBinder;
import android.content.Intent;
import kotlin.Metadata;
import android.app.Service;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006" }, d2 = { "Lcom/twitter/rooms/service/RoomService;", "Landroid/app/Service;", "<init>", "()V", "Companion", "a", "subsystem.tfa.rooms.core_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomService extends Service
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public final IBinder onBind(final Intent intent) {
        final j5o d1 = jrn.Companion.a().d1();
        d1.b(this);
        return (IBinder)d1;
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        final Object o = null;
        String action;
        if (intent != null) {
            action = intent.getAction();
        }
        else {
            action = null;
        }
        if (!pjr.g((CharSequence)action)) {
            if (intent != null) {
                final Notification notification = (Notification)intent.getParcelableExtra("notification");
                if (notification != null) {
                    if (Build$VERSION.SDK_INT >= 30) {
                        this.startForeground(84726, notification, 128);
                        return 2;
                    }
                    this.startForeground(84726, notification);
                    return 2;
                }
            }
            throw new IllegalArgumentException("Notification should not be null in intent");
        }
        String action2;
        if (intent != null) {
            action2 = intent.getAction();
        }
        else {
            action2 = null;
        }
        Object o2 = o;
        if (action2 != null) {
            switch (action2.hashCode()) {
                default: {
                    o2 = o;
                    break;
                }
                case 1639886058: {
                    if (!action2.equals("SPACE_NOTIFICATION_SKIP_BACKWARDS_ACTION")) {
                        o2 = o;
                        break;
                    }
                    o2 = zqn$a$d.a;
                    break;
                }
                case 950844626: {
                    if (!action2.equals("SPACE_NOTIFICATION_LEAVE_SPACE_ACTION")) {
                        o2 = o;
                        break;
                    }
                    o2 = zqn$a$b.a;
                    break;
                }
                case -626721726: {
                    if (!action2.equals("SPACE_NOTIFICATION_SKIP_FORWARDS_ACTION")) {
                        o2 = o;
                        break;
                    }
                    o2 = zqn$a$e.a;
                    break;
                }
                case -990223719: {
                    if (!action2.equals("SPACE_NOTIFICATION_MUTE_MIC_ACTION")) {
                        o2 = o;
                        break;
                    }
                    o2 = zqn$a$c.a;
                    break;
                }
                case -1677131542: {
                    if (!action2.equals("SPACE_NOTIFICATION_TOGGLE_PLAYBACK_ACTION")) {
                        o2 = o;
                        break;
                    }
                    o2 = zqn$a$f.a;
                    break;
                }
            }
        }
        if (o2 != null) {
            final zqn c1 = jrn.Companion.a().c1();
            Objects.requireNonNull(c1);
            c1.a.onNext(o2);
        }
        return 2;
    }
    
    public final void onTaskRemoved(final Intent intent) {
        final zqn c1 = jrn.Companion.a().c1();
        final zqn$a$a a = zqn$a$a.a;
        Objects.requireNonNull(c1);
        c1.a.onNext((Object)a);
        super.onTaskRemoved(intent);
    }
    
    public static final class a
    {
    }
}
