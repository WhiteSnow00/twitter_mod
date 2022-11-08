import android.os.Build$VERSION;
import android.content.res.Resources;
import com.twitter.rooms.model.helpers.RoomUserItem;
import com.twitter.util.user.UserIdentifier;
import java.util.Iterator;
import android.widget.RemoteViews;
import android.app.PendingIntent;
import android.content.Intent;
import com.twitter.rooms.service.RoomService;
import android.app.Notification;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lrn
{
    public static final a Companion;
    public final Context a;
    public final dwi b;
    public gew c;
    public final cn d;
    public final Map<String, mqi> e;
    public final List<gvj<Integer, String>> f;
    
    static {
        Companion = new a();
    }
    
    public lrn(final Context a, final dwi b, final gew c, final cn d) {
        zzd.f((Object)a, "context");
        zzd.f((Object)b, "notificationsChannelsManager");
        zzd.f((Object)c, "userManager");
        zzd.f((Object)d, "activityArgsIntentFactory");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new LinkedHashMap();
        this.f = tdy.v0((Object[])new gvj[] { new gvj((Object)2131430379, (Object)"SPACE_NOTIFICATION_MUTE_MIC_ACTION"), new gvj((Object)2131430371, (Object)"SPACE_NOTIFICATION_LEAVE_SPACE_ACTION"), new gvj((Object)2131430384, (Object)"SPACE_NOTIFICATION_TOGGLE_PLAYBACK_ACTION"), new gvj((Object)2131431475, (Object)"SPACE_NOTIFICATION_SKIP_BACKWARDS_ACTION"), new gvj((Object)2131431478, (Object)"SPACE_NOTIFICATION_SKIP_FORWARDS_ACTION") });
    }
    
    public final Notification a(final String s, String e, final boolean b, final String s2, final boolean b2) {
        final dri e2 = this.e(s2, true, b2);
        final int a = e2.a;
        final PendingIntent b3 = e2.b;
        final RemoteViews c = e2.c;
        final RemoteViews d = e2.d;
        for (final gvj gvj : this.f) {
            final int intValue = ((Number)gvj.C0).intValue();
            final Intent setAction = new Intent(this.a, (Class)RoomService.class).setAction((String)gvj.D0);
            zzd.e((Object)setAction, "Intent(context, RoomServ\u2026s.java).setAction(action)");
            final PendingIntent service = PendingIntent.getService(this.a, 0, setAction, a);
            c.setOnClickPendingIntent(intValue, service);
            d.setOnClickPendingIntent(intValue, service);
            if (intValue == 2131430384) {
                int n;
                if (b) {
                    n = 2131232302;
                }
                else {
                    n = 2131232351;
                }
                c.setImageViewResource(2131430384, n);
                c.setViewVisibility(2131430384, 0);
                d.setImageViewResource(2131430384, n);
                d.setViewVisibility(2131430384, 0);
            }
        }
        if (s != null) {
            c.setTextViewText(2131432083, (CharSequence)s);
            d.setTextViewText(2131432083, (CharSequence)s);
        }
        if (e != null) {
            c.setTextViewText(2131428642, (CharSequence)e);
            d.setTextViewText(2131428642, (CharSequence)e);
        }
        final dwi b4 = this.b;
        final UserIdentifier b5 = this.c.b();
        zzd.e((Object)b5, "userManager.current");
        e = b4.e(b5);
        final LinkedHashMap e3 = this.e;
        final mqi mqi = new mqi(this.a, e);
        mqi.F.icon = 2131233418;
        mqi.m((rqi)new nqi());
        mqi.i(8, true);
        mqi.G = true;
        if (e3.get(e) == null) {
            e3.put(e, mqi);
        }
        final Object value = e3.get(e);
        zzd.c(value);
        final mqi mqi2 = (mqi)value;
        mqi2.g = b3;
        mqi2.z = d;
        mqi2.A = c;
        final Notification b6 = mqi2.b();
        zzd.e((Object)b6, "builderMap.getOrSetIfNot\u2026out)\n            .build()");
        return b6;
    }
    
    public final Notification c(final gqn gqn, String e) {
        zzd.f((Object)gqn, "state");
        Notification notification;
        if (tdy.l0(gqn) && gqn.Q) {
            notification = this.d(gqn, e);
        }
        else if (tdy.l0(gqn)) {
            notification = this.d(gqn, e);
        }
        else {
            final Resources resources = this.a.getResources();
            final RoomUserItem roomUserItem = (RoomUserItem)or4.H1((Iterable)gqn.n);
            if (roomUserItem != null) {
                final String title = gqn.getTitle();
                String s;
                if (title == null || ckr.h1((CharSequence)title)) {
                    s = this.a.getResources().getString(2131953572, new Object[] { roomUserItem.getName() });
                }
                else {
                    s = gqn.getTitle();
                }
                final int n = gqn.m.size() + gqn.t;
                String s2;
                if (n != 0) {
                    if (n != 1) {
                        s2 = resources.getString(2131953575, new Object[] { String.valueOf(n), roomUserItem.getName() });
                    }
                    else {
                        s2 = resources.getString(2131953580, new Object[] { roomUserItem.getName() });
                    }
                }
                else {
                    s2 = resources.getString(2131952081);
                }
                zzd.e((Object)s2, "when (val participantsLi\u2026          )\n            }");
                Boolean value;
                if (gqn.w == f0r.E0) {
                    value = gqn.c;
                }
                else {
                    value = null;
                }
                final dri e2 = this.e(e, false, false);
                final int a = e2.a;
                final PendingIntent b = e2.b;
                final RemoteViews c = e2.c;
                final RemoteViews d = e2.d;
                for (final gvj gvj : this.f) {
                    final int intValue = ((Number)gvj.C0).intValue();
                    e = (String)gvj.D0;
                    final Intent setAction = new Intent(this.a, (Class)RoomService.class).setAction(e);
                    zzd.e((Object)setAction, "Intent(context, RoomServ\u2026s.java).setAction(action)");
                    final PendingIntent service = PendingIntent.getService(this.a, 0, setAction, a);
                    c.setOnClickPendingIntent(intValue, service);
                    d.setOnClickPendingIntent(intValue, service);
                    if (intValue == 2131430379) {
                        oyv a2;
                        if (value != null) {
                            int n2;
                            if (value) {
                                n2 = 2131231597;
                            }
                            else {
                                n2 = 2131231710;
                            }
                            c.setImageViewResource(2131430379, n2);
                            c.setViewVisibility(2131430379, 0);
                            d.setImageViewResource(2131430379, n2);
                            d.setViewVisibility(2131430379, 0);
                            a2 = oyv.a;
                        }
                        else {
                            a2 = null;
                        }
                        if (a2 != null) {
                            continue;
                        }
                        c.setViewVisibility(2131430379, 8);
                        d.setViewVisibility(2131430379, 8);
                    }
                }
                if (s != null) {
                    c.setTextViewText(2131431553, (CharSequence)s);
                    d.setTextViewText(2131431553, (CharSequence)s);
                }
                c.setTextViewText(2131431538, (CharSequence)s2);
                d.setTextViewText(2131431538, (CharSequence)s2);
                final dwi b2 = this.b;
                final UserIdentifier b3 = this.c.b();
                zzd.e((Object)b3, "userManager.current");
                e = b2.e(b3);
                final LinkedHashMap e3 = this.e;
                final mqi mqi = new mqi(this.a, e);
                mqi.F.icon = 2131233418;
                mqi.m((rqi)new nqi());
                mqi.i(8, true);
                mqi.G = true;
                if (e3.get(e) == null) {
                    e3.put(e, mqi);
                }
                final Object value2 = e3.get(e);
                zzd.c(value2);
                final mqi mqi2 = (mqi)value2;
                mqi2.g = b;
                mqi2.z = d;
                mqi2.A = c;
                notification = mqi2.b();
                zzd.e((Object)notification, "builderMap.getOrSetIfNot\u2026out)\n            .build()");
            }
            else {
                notification = null;
            }
        }
        return notification;
    }
    
    public final Notification d(final gqn gqn, final String s) {
        while (true) {
            for (final RoomUserItem next : gqn.n) {
                if (next.isPrimaryAdmin()) {
                    final RoomUserItem roomUserItem = next;
                    if (roomUserItem != null) {
                        final Resources resources = this.a.getResources();
                        final boolean b = true;
                        final String string = resources.getString(2131953572, new Object[] { roomUserItem.getName() });
                        zzd.e((Object)string, "context.resources.getStr\u2026umption_title, host.name)");
                        final String z = gqn.z;
                        int n = b ? 1 : 0;
                        if (z != null) {
                            if (z.length() == 0) {
                                n = (b ? 1 : 0);
                            }
                            else {
                                n = 0;
                            }
                        }
                        String s2;
                        if (n != 0) {
                            s2 = roomUserItem.getName();
                        }
                        else {
                            s2 = gqn.z;
                        }
                        return this.a(string, s2, gqn.L, s, gqn.Q);
                    }
                    return null;
                }
            }
            RoomUserItem next = null;
            continue;
        }
    }
    
    public final dri e(final String d, final boolean b, final boolean b2) {
        final String a = l61.a;
        zzd.e((Object)a, "get()");
        final vfg$a vfg$a = new vfg$a();
        vfg$a.b = fgg.E0.C0;
        vfg$a.d = d;
        final Intent a2 = this.d.a(this.a, (zm)((h4j)vfg$a).e());
        int n = 134217728;
        if (Build$VERSION.SDK_INT >= 23) {
            n = 201326592;
        }
        final PendingIntent activity = PendingIntent.getActivity(this.a, 0, a2, n);
        int n2;
        if (b2) {
            n2 = 2131625715;
        }
        else if (b) {
            n2 = 2131625554;
        }
        else {
            n2 = 2131625530;
        }
        final RemoteViews remoteViews = new RemoteViews(a, n2);
        int n3;
        if (b2) {
            n3 = 2131625714;
        }
        else if (b) {
            n3 = 2131625553;
        }
        else {
            n3 = 2131625529;
        }
        final RemoteViews remoteViews2 = new RemoteViews(a, n3);
        zzd.e((Object)activity, "pendingIntent");
        return new dri(n, activity, remoteViews, remoteViews2);
    }
    
    public static final class a
    {
    }
}
