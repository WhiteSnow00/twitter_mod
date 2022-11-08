import android.os.BaseBundle;
import java.util.Collection;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Iterator;
import android.app.Notification$BubbleMetadata;
import java.util.Objects;
import android.net.Uri;
import android.text.TextUtils;
import android.os.Parcelable;
import android.app.Notification;
import android.app.RemoteInput;
import android.app.Notification$Action$Builder;
import android.app.PendingIntent;
import android.os.Build$VERSION;
import java.util.ArrayList;
import android.os.Bundle;
import java.util.List;
import android.widget.RemoteViews;
import android.app.Notification$Builder;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sqi implements npi
{
    public final Context a;
    public final Notification$Builder b;
    public final mqi c;
    public RemoteViews d;
    public RemoteViews e;
    public final List<Bundle> f;
    public final Bundle g;
    public int h;
    
    public sqi(final mqi c) {
        this.f = new ArrayList();
        this.g = new Bundle();
        this.c = c;
        this.a = c.a;
        if (Build$VERSION.SDK_INT >= 26) {
            this.b = new Notification$Builder(c.a, c.B);
        }
        else {
            this.b = new Notification$Builder(c.a);
        }
        final Notification f = c.F;
        this.b.setWhen(f.when).setSmallIcon(f.icon, f.iconLevel).setContent(f.contentView).setTicker(f.tickerText, (RemoteViews)null).setVibrate(f.vibrate).setLights(f.ledARGB, f.ledOnMS, f.ledOffMS).setOngoing((f.flags & 0x2) != 0x0).setOnlyAlertOnce((f.flags & 0x8) != 0x0).setAutoCancel((f.flags & 0x10) != 0x0).setDefaults(f.defaults).setContentTitle(c.e).setContentText(c.f).setContentInfo((CharSequence)null).setContentIntent(c.g).setDeleteIntent(f.deleteIntent).setFullScreenIntent((PendingIntent)null, (f.flags & 0x80) != 0x0).setLargeIcon(c.h).setNumber(c.i).setProgress(c.o, c.p, c.q);
        this.b.setSubText(c.n).setUsesChronometer(c.l).setPriority(c.j);
        for (final iqi iqi : c.b) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            final IconCompat a = iqi.a();
            Notification$Action$Builder notification$Action$Builder;
            if (sdk_INT >= 23) {
                Icon m;
                if (a != null) {
                    m = a.m((Context)null);
                }
                else {
                    m = null;
                }
                notification$Action$Builder = new Notification$Action$Builder(m, iqi.j, iqi.k);
            }
            else {
                int g;
                if (a != null) {
                    g = a.g();
                }
                else {
                    g = 0;
                }
                notification$Action$Builder = new Notification$Action$Builder(g, iqi.j, iqi.k);
            }
            final kcm[] c2 = iqi.c;
            if (c2 != null) {
                final int length = c2.length;
                final RemoteInput[] array = new RemoteInput[length];
                for (int i = 0; i < c2.length; ++i) {
                    array[i] = kcm.a(c2[i]);
                }
                for (int j = 0; j < length; ++j) {
                    notification$Action$Builder.addRemoteInput(array[j]);
                }
            }
            Bundle bundle;
            if (iqi.a != null) {
                bundle = new Bundle(iqi.a);
            }
            else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", iqi.e);
            final int sdk_INT2 = Build$VERSION.SDK_INT;
            if (sdk_INT2 >= 24) {
                notification$Action$Builder.setAllowGeneratedReplies(iqi.e);
            }
            ((BaseBundle)bundle).putInt("android.support.action.semanticAction", iqi.g);
            if (sdk_INT2 >= 28) {
                notification$Action$Builder.setSemanticAction(iqi.g);
            }
            if (sdk_INT2 >= 29) {
                notification$Action$Builder.setContextual(iqi.h);
            }
            if (sdk_INT2 >= 31) {
                notification$Action$Builder.setAuthenticationRequired(iqi.l);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", iqi.f);
            notification$Action$Builder.addExtras(bundle);
            this.b.addAction(notification$Action$Builder.build());
        }
        final Bundle w = c.w;
        if (w != null) {
            this.g.putAll(w);
        }
        final int sdk_INT3 = Build$VERSION.SDK_INT;
        this.d = c.z;
        this.e = c.A;
        this.b.setShowWhen(c.k);
        this.b.setLocalOnly(c.t).setGroup(c.r).setGroupSummary(c.s).setSortKey((String)null);
        this.h = 0;
        this.b.setCategory((String)null).setColor(c.x).setVisibility(c.y).setPublicVersion((Notification)null).setSound(f.sound, f.audioAttributes);
        List<String> list;
        if (sdk_INT3 < 28) {
            list = a(b(c.c), c.H);
        }
        else {
            list = c.H;
        }
        if (list != null && !list.isEmpty()) {
            final Iterator iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                this.b.addPerson((String)iterator2.next());
            }
        }
        if (c.d.size() > 0) {
            if (c.w == null) {
                c.w = new Bundle();
            }
            Bundle bundle2;
            if ((bundle2 = c.w.getBundle("android.car.EXTENSIONS")) == null) {
                bundle2 = new Bundle();
            }
            final Bundle bundle3 = new Bundle(bundle2);
            final Bundle bundle4 = new Bundle();
            for (int k = 0; k < c.d.size(); ++k) {
                final String string = Integer.toString(k);
                final iqi iqi2 = c.d.get(k);
                final Object a2 = tqi.a;
                final Bundle bundle5 = new Bundle();
                final IconCompat a3 = iqi2.a();
                int g2;
                if (a3 != null) {
                    g2 = a3.g();
                }
                else {
                    g2 = 0;
                }
                ((BaseBundle)bundle5).putInt("icon", g2);
                bundle5.putCharSequence("title", iqi2.j);
                bundle5.putParcelable("actionIntent", (Parcelable)iqi2.k);
                Bundle bundle6;
                if (iqi2.a != null) {
                    bundle6 = new Bundle(iqi2.a);
                }
                else {
                    bundle6 = new Bundle();
                }
                bundle6.putBoolean("android.support.allowGeneratedReplies", iqi2.e);
                bundle5.putBundle("extras", bundle6);
                bundle5.putParcelableArray("remoteInputs", (Parcelable[])tqi.a(iqi2.c));
                bundle5.putBoolean("showsUserInterface", iqi2.f);
                ((BaseBundle)bundle5).putInt("semanticAction", iqi2.g);
                bundle4.putBundle(string, bundle5);
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            if (c.w == null) {
                c.w = new Bundle();
            }
            c.w.putBundle("android.car.EXTENSIONS", bundle2);
            this.g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        final int sdk_INT4 = Build$VERSION.SDK_INT;
        if (sdk_INT4 >= 24) {
            this.b.setExtras(c.w).setRemoteInputHistory((CharSequence[])null);
            final RemoteViews z = c.z;
            if (z != null) {
                this.b.setCustomContentView(z);
            }
            final RemoteViews a4 = c.A;
            if (a4 != null) {
                this.b.setCustomBigContentView(a4);
            }
        }
        if (sdk_INT4 >= 26) {
            this.b.setBadgeIconType(c.C).setSettingsText((CharSequence)null).setShortcutId(c.D).setTimeoutAfter(0L).setGroupAlertBehavior(0);
            if (c.v) {
                this.b.setColorized(c.u);
            }
            if (!TextUtils.isEmpty((CharSequence)c.B)) {
                this.b.setSound((Uri)null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[])null);
            }
        }
        if (sdk_INT4 >= 28) {
            for (final cbk cbk : c.c) {
                final Notification$Builder b = this.b;
                Objects.requireNonNull(cbk);
                b.addPerson(cbk$b.b(cbk));
            }
        }
        final int sdk_INT5 = Build$VERSION.SDK_INT;
        if (sdk_INT5 >= 29) {
            this.b.setAllowSystemGeneratedContextualActions(c.E);
            this.b.setBubbleMetadata((Notification$BubbleMetadata)null);
        }
        if (c.G) {
            if (this.c.s) {
                this.h = 2;
            }
            else {
                this.h = 1;
            }
            this.b.setVibrate((long[])null);
            this.b.setSound((Uri)null);
            final int n = f.defaults & 0xFFFFFFFE & 0xFFFFFFFD;
            f.defaults = n;
            this.b.setDefaults(n);
            if (sdk_INT5 >= 26) {
                if (TextUtils.isEmpty((CharSequence)this.c.r)) {
                    this.b.setGroup("silent");
                }
                this.b.setGroupAlertBehavior(this.h);
            }
        }
    }
    
    public static List<String> a(final List<String> list, final List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        final ft0 ft0 = new ft0(list2.size() + list.size());
        ft0.addAll((Collection)list);
        ft0.addAll((Collection)list2);
        return new ArrayList<String>((Collection<? extends String>)ft0);
    }
    
    public static List<String> b(final List<cbk> list) {
        if (list == null) {
            return null;
        }
        final ArrayList list2 = new ArrayList(list.size());
        for (final cbk cbk : list) {
            String s = cbk.c;
            if (s == null) {
                if (cbk.a != null) {
                    final StringBuilder g = w48.g("name:");
                    g.append((Object)cbk.a);
                    s = g.toString();
                }
                else {
                    s = "";
                }
            }
            list2.add(s);
        }
        return list2;
    }
    
    public final void c(final Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = (notification.defaults & 0xFFFFFFFE & 0xFFFFFFFD);
    }
}
