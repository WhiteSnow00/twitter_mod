import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.notifications.settings.args.NotificationsSettingsContentViewArgs;
import com.twitter.android.liveevent.reminders.a;
import com.twitter.app.dm.DMConversationContentViewProvider;
import java.util.Objects;
import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pwf implements xv8
{
    public final int D0;
    public final Object E0;
    
    public pwf(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void k0(final Dialog dialog, int ordinal, final int n) {
        switch (this.D0) {
            default: {
                final wbu wbu = (wbu)this.E0;
                final mcu e0 = mcu.E0;
                final mcu a = wbu.a.get(n).a;
                final mcu i0 = mcu.I0;
                if (a == i0) {
                    wbu.c();
                }
                else if (a == e0) {
                    wbu.b();
                }
                else {
                    final dou b = wbu.b;
                    final bo6 c = wbu.c;
                    final cxs d = wbu.d;
                    final lcu g0 = lcu.G0;
                    final hdu hdu = (hdu)b;
                    Objects.requireNonNull(hdu);
                    hdu.n(a, c, (gfv)null, (ncu)null, false, d, (xup)null, (ylu)null, (a0j)null, mgu.K0, g0);
                }
                final bo6 c2 = wbu.c;
                czd.f((Object)a, "previousActionType");
                czd.f((Object)c2, "tweet");
                if (a != i0 && a != e0) {
                    ordinal = 0;
                }
                else {
                    ordinal = 1;
                }
                final Enum enum1 = null;
                mcu mcu;
                if (ordinal != 0) {
                    mcu = a;
                }
                else {
                    mcu = null;
                }
                Object o = enum1;
                if (mcu != null) {
                    final vf3 d2 = c2.D0;
                    o = enum1;
                    if (d2.D0) {
                        o = enum1;
                        if (d2.K0) {
                            ordinal = ((Enum)a).ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 5) {
                                    o = enum1;
                                }
                                else {
                                    o = e0;
                                }
                            }
                            else {
                                o = i0;
                            }
                        }
                    }
                }
                if (o != null) {
                    if (o == i0) {
                        wbu.c();
                    }
                    else if (o == e0) {
                        wbu.b();
                    }
                }
                return;
            }
            case 4: {
                final nsb nsb = (nsb)this.E0;
                czd.f((Object)nsb, "$onConfirmed");
                if (n == -1) {
                    nsb.invoke();
                }
                return;
            }
            case 3: {
                final itb itb = (itb)this.E0;
                czd.f((Object)itb, "$tmp0");
                czd.f((Object)dialog, "p0");
                itb.h0((Object)dialog, (Object)ordinal, (Object)n);
                return;
            }
            case 2: {
                final DMConversationContentViewProvider dmConversationContentViewProvider = (DMConversationContentViewProvider)this.E0;
                final kca b2 = DMConversationContentViewProvider.B3;
                dmConversationContentViewProvider.D1();
                return;
            }
            case 1: {
                final bsw bsw = (bsw)this.E0;
                final bsw$a companion = bsw.Companion;
                czd.f((Object)bsw, "this$0");
                if (n == -1) {
                    ((u9)bsw).F0.cancel();
                }
                return;
            }
            case 0: {
                final a a2 = (a)this.E0;
                Objects.requireNonNull(a2);
                if (ordinal == 1 && n == -1) {
                    ((a.b)a2.a.get()).a.b((ContentViewArgs)new NotificationsSettingsContentViewArgs.PushNotificationsSettingsContentViewArgs());
                }
            }
        }
    }
}
