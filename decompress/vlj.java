import java.util.Calendar;
import java.text.SimpleDateFormat;
import android.text.format.DateFormat;
import com.twitter.profilemodules.model.business.Weekday;
import com.twitter.profilemodules.model.business.OpenCloseTimeNext;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vlj
{
    public final Context a;
    public final int b;
    public final int c;
    public final int d;
    public final u3s e;
    public final u3s f;
    public final u3s g;
    
    public vlj(final Context a) {
        zzd.f((Object)a, "context");
        this.a = a;
        this.b = eo6.b(a, 2131099946);
        this.c = eo6.b(a, 2131100721);
        this.d = goz.J(a, 2130969093);
        this.e = (u3s)rp2.z0((otb)new vlj$c(this));
        this.f = (u3s)rp2.z0((otb)new vlj$a(this));
        this.g = (u3s)rp2.z0((otb)new vlj$b(this));
    }
    
    public final ulj a(final OpenCloseTimeNext openCloseTimeNext, final Weekday weekday, final int n, final int n2, final int n3) {
        final int hour = openCloseTimeNext.getTime().getHour();
        final int minute = openCloseTimeNext.getTime().getMinute();
        final boolean b = weekday != null;
        final boolean is24HourFormat = DateFormat.is24HourFormat(this.a);
        int n4;
        if (b) {
            if (is24HourFormat) {
                n4 = 2131953003;
            }
            else {
                n4 = 2131953011;
            }
        }
        else if (is24HourFormat) {
            n4 = 2131953006;
        }
        else {
            n4 = 2131953016;
        }
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.a.getString(n4), t4s.d());
        final Calendar instance = Calendar.getInstance();
        instance.set(11, hour);
        instance.set(12, minute);
        if (weekday != null) {
            instance.set(7, weekday.toJavaUtilCalenderValue());
        }
        final String format = simpleDateFormat.format(instance.getTime());
        zzd.e((Object)format, "timeFormatter.format(displayTime.time)");
        final String string = this.a.getString(n);
        zzd.e((Object)string, "context.getString(openClosedState)");
        final tlj tlj = new tlj(string, Integer.valueOf(n3), true);
        final String string2 = this.a.getString(2131953873);
        zzd.e((Object)string2, "context.getString(com.twitter.ui.R.string.en_dot)");
        final String string3 = this.a.getString(n2, new Object[] { format });
        zzd.e((Object)string3, "context.getString(timeOfNextState, transitionText)");
        return new ulj(tdy.v0((Object[])new tlj[] { tlj, new tlj(l7k.c(string2, string3), (Integer)null, false) }));
    }
    
    public final ulj b() {
        return (ulj)this.g.getValue();
    }
}
