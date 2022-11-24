import java.lang.reflect.Method;
import android.app.Notification;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pri implements rk6
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    public final Object J0;
    
    public pri(final Object g0, final Object h0, final Object i0, final Object j0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public final void accept(Object o) {
        switch (this.F0) {
            default: {
                final dju dju = (dju)this.G0;
                final mxe mxe = (mxe)this.H0;
                final igd igd = (igd)this.I0;
                final igt igt = (igt)this.J0;
                final yjh yjh = (yjh)o;
                Objects.requireNonNull(dju);
                if (yjh.b) {
                    ((xdu)dju).i.a(((t5j)((liu)mxe.get()).b).subscribe((rk6)new d2p((Object)dju, (Object)yjh, (Object)igd, 4)));
                }
                else {
                    igt.c(2131959173, 0);
                }
                return;
            }
            case 0: {
                final rri rri = (rri)this.G0;
                final bti bti = (bti)this.H0;
                final Notification notification = (Notification)this.I0;
                final iwi iwi = (iwi)this.J0;
                final Integer n = (Integer)o;
                Objects.requireNonNull(rri);
                final int intValue = n;
                final int intValue2 = bti.F.a;
                Notification notification2;
                try {
                    final Object value = notification.getClass().getDeclaredField("extraNotification").get(notification);
                    final Method declaredMethod = value.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE);
                    if (intValue != intValue2) {
                        declaredMethod.invoke(value, intValue2);
                    }
                    else {
                        declaredMethod.invoke(value, 1);
                    }
                    notification2 = notification;
                }
                catch (final Exception ex) {
                    notification2 = null;
                }
                if (notification2 != null) {
                    final fg4 fg4 = new fg4(new String[] { "app:badge:update:xiaomi:success" });
                    ((o1p)fg4).A();
                    sbw.b((tlm)fg4);
                }
                else {
                    o = new fg4(new String[] { "app:badge:update:xiaomi:failure" });
                    ((o1p)o).A();
                    sbw.b((tlm)o);
                    notification2 = notification;
                }
                rri.h(iwi, bti, notification2);
            }
        }
    }
}
