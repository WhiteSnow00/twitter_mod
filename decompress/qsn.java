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

public final class qsn
{
    public static final a Companion;
    public final Context a;
    public final uwi b;
    public kfw c;
    public final gn d;
    public final Map<String, gri> e;
    public final List<awj<Integer, String>> f;
    
    static {
        Companion = new a();
    }
    
    public qsn(final Context a, final uwi b, final kfw c, final gn d) {
        e0e.f((Object)a, "context");
        e0e.f((Object)b, "notificationsChannelsManager");
        e0e.f((Object)c, "userManager");
        e0e.f((Object)d, "activityArgsIntentFactory");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new LinkedHashMap();
        this.f = shw.y0((Object[])new awj[] { new awj((Object)2131430382, (Object)"SPACE_NOTIFICATION_MUTE_MIC_ACTION"), new awj((Object)2131430374, (Object)"SPACE_NOTIFICATION_LEAVE_SPACE_ACTION"), new awj((Object)2131430387, (Object)"SPACE_NOTIFICATION_TOGGLE_PLAYBACK_ACTION"), new awj((Object)2131431479, (Object)"SPACE_NOTIFICATION_SKIP_BACKWARDS_ACTION"), new awj((Object)2131431482, (Object)"SPACE_NOTIFICATION_SKIP_FORWARDS_ACTION") });
    }
    
    public static Notification b(final qsn qsn, final String s, final String s2, final boolean b, final String s3, final boolean b2, final int n, final Object o) {
        return qsn.a(s, s2, b, null, true);
    }
    
    public final Notification a(final String s, final String s2, final boolean b, final String s3, final boolean b2) {
        final vri e = this.e(s3, true, b2);
        final int a = e.a;
        final PendingIntent b3 = e.b;
        final RemoteViews c = e.c;
        final RemoteViews d = e.d;
        for (final awj awj : this.f) {
            final int intValue = ((Number)awj.F0).intValue();
            final Intent setAction = new Intent(this.a, (Class)RoomService.class).setAction((String)awj.G0);
            e0e.e((Object)setAction, "Intent(context, RoomServ\u2026s.java).setAction(action)");
            final PendingIntent service = PendingIntent.getService(this.a, 0, setAction, a);
            c.setOnClickPendingIntent(intValue, service);
            d.setOnClickPendingIntent(intValue, service);
            if (intValue == 2131430387) {
                int n;
                if (b) {
                    n = 2131232302;
                }
                else {
                    n = 2131232353;
                }
                c.setImageViewResource(2131430387, n);
                c.setViewVisibility(2131430387, 0);
                d.setImageViewResource(2131430387, n);
                d.setViewVisibility(2131430387, 0);
            }
        }
        if (s != null) {
            c.setTextViewText(2131432087, (CharSequence)s);
            d.setTextViewText(2131432087, (CharSequence)s);
        }
        if (s2 != null) {
            c.setTextViewText(2131428642, (CharSequence)s2);
            d.setTextViewText(2131428642, (CharSequence)s2);
        }
        final uwi b4 = this.b;
        final UserIdentifier b5 = this.c.b();
        e0e.e((Object)b5, "userManager.current");
        final String e2 = b4.e(b5);
        final LinkedHashMap e3 = this.e;
        final gri gri = new gri(this.a, e2);
        gri.F.icon = 2131233420;
        gri.m((lri)new hri());
        gri.i(8, true);
        gri.G = true;
        if (e3.get(e2) == null) {
            e3.put(e2, gri);
        }
        final Object value = e3.get(e2);
        e0e.c(value);
        final gri gri2 = (gri)value;
        gri2.g = b3;
        gri2.z = d;
        gri2.A = c;
        final Notification b6 = gri2.b();
        e0e.e((Object)b6, "builderMap.getOrSetIfNot\u2026out)\n            .build()");
        return b6;
    }
    
    public final Notification c(final lrn lrn, String action) {
        e0e.f((Object)lrn, "state");
        Notification notification;
        if (xd.F0(lrn) && lrn.Q) {
            notification = this.d(lrn, action);
        }
        else if (xd.F0(lrn)) {
            notification = this.d(lrn, action);
        }
        else {
            final Resources resources = this.a.getResources();
            final RoomUserItem roomUserItem = (RoomUserItem)rr4.D1((Iterable)lrn.n);
            if (roomUserItem != null) {
                final String title = lrn.getTitle();
                String s;
                if (title == null || slr.k1((CharSequence)title)) {
                    s = this.a.getResources().getString(2131953572, new Object[] { roomUserItem.getName() });
                }
                else {
                    s = lrn.getTitle();
                }
                final int n = lrn.m.size() + lrn.t;
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
                e0e.e((Object)s2, "when (val participantsLi\u2026          )\n            }");
                Boolean value;
                if (lrn.w == w1r.H0) {
                    value = lrn.c;
                }
                else {
                    value = null;
                }
                final vri e = this.e(action, false, false);
                final int a = e.a;
                final PendingIntent b = e.b;
                final RemoteViews c = e.c;
                final RemoteViews d = e.d;
                for (final awj awj : this.f) {
                    final int intValue = ((Number)awj.F0).intValue();
                    action = (String)awj.G0;
                    final Intent setAction = new Intent(this.a, (Class)RoomService.class).setAction(action);
                    e0e.e((Object)setAction, "Intent(context, RoomServ\u2026s.java).setAction(action)");
                    final PendingIntent service = PendingIntent.getService(this.a, 0, setAction, a);
                    c.setOnClickPendingIntent(intValue, service);
                    d.setOnClickPendingIntent(intValue, service);
                    if (intValue == 2131430382) {
                        vzv a2;
                        if (value != null) {
                            int n2;
                            if (value) {
                                n2 = 2131231597;
                            }
                            else {
                                n2 = 2131231710;
                            }
                            c.setImageViewResource(2131430382, n2);
                            c.setViewVisibility(2131430382, 0);
                            d.setImageViewResource(2131430382, n2);
                            d.setViewVisibility(2131430382, 0);
                            a2 = vzv.a;
                        }
                        else {
                            a2 = null;
                        }
                        if (a2 != null) {
                            continue;
                        }
                        c.setViewVisibility(2131430382, 8);
                        d.setViewVisibility(2131430382, 8);
                    }
                }
                if (s != null) {
                    c.setTextViewText(2131431557, (CharSequence)s);
                    d.setTextViewText(2131431557, (CharSequence)s);
                }
                c.setTextViewText(2131431542, (CharSequence)s2);
                d.setTextViewText(2131431542, (CharSequence)s2);
                final uwi b2 = this.b;
                final UserIdentifier b3 = this.c.b();
                e0e.e((Object)b3, "userManager.current");
                final String e2 = b2.e(b3);
                final LinkedHashMap e3 = this.e;
                final gri gri = new gri(this.a, e2);
                gri.F.icon = 2131233420;
                gri.m((lri)new hri());
                gri.i(8, true);
                gri.G = true;
                if (e3.get(e2) == null) {
                    e3.put(e2, gri);
                }
                final Object value2 = e3.get(e2);
                e0e.c(value2);
                final gri gri2 = (gri)value2;
                gri2.g = b;
                gri2.z = d;
                gri2.A = c;
                notification = gri2.b();
                e0e.e((Object)notification, "builderMap.getOrSetIfNot\u2026out)\n            .build()");
            }
            else {
                notification = null;
            }
        }
        return notification;
    }
    
    public final Notification d(final lrn lrn, final String s) {
        while (true) {
            for (final RoomUserItem next : lrn.n) {
                if (next.isPrimaryAdmin()) {
                    final RoomUserItem roomUserItem = next;
                    if (roomUserItem != null) {
                        final Resources resources = this.a.getResources();
                        final boolean b = true;
                        final String string = resources.getString(2131953572, new Object[] { roomUserItem.getName() });
                        e0e.e((Object)string, "context.resources.getStr\u2026umption_title, host.name)");
                        final String z = lrn.z;
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
                            s2 = lrn.z;
                        }
                        return this.a(string, s2, lrn.L, s, lrn.Q);
                    }
                    return null;
                }
            }
            RoomUserItem next = null;
            continue;
        }
    }
    
    public final vri e(final String d, final boolean b, final boolean b2) {
        final String a = m61.a;
        e0e.e((Object)a, "get()");
        final fgg$a fgg$a = new fgg$a();
        fgg$a.b = pgg.H0.F0;
        fgg$a.d = d;
        final Intent a2 = this.d.a(this.a, (cn)((z4j)fgg$a).e());
        int n = 134217728;
        if (Build$VERSION.SDK_INT >= 23) {
            n = 201326592;
        }
        final PendingIntent activity = PendingIntent.getActivity(this.a, 0, a2, n);
        int n2;
        if (b2) {
            n2 = 2131625717;
        }
        else if (b) {
            n2 = 2131625556;
        }
        else {
            n2 = 2131625532;
        }
        final RemoteViews remoteViews = new RemoteViews(a, n2);
        int n3;
        if (b2) {
            n3 = 2131625716;
        }
        else if (b) {
            n3 = 2131625555;
        }
        else {
            n3 = 2131625531;
        }
        final RemoteViews remoteViews2 = new RemoteViews(a, n3);
        e0e.e((Object)activity, "pendingIntent");
        return new vri(n, activity, remoteViews, remoteViews2);
    }
    
    public static final class a
    {
    }
}
