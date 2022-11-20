import java.util.Calendar;
import java.text.SimpleDateFormat;
import android.text.format.DateFormat;
import com.twitter.profilemodules.model.business.Weekday;
import com.twitter.profilemodules.model.business.OpenCloseTimeNext;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amj
{
    public final Context a;
    public final int b;
    public final int c;
    public final int d;
    public final n4s e;
    public final n4s f;
    public final n4s g;
    
    public amj(final Context a) {
        czd.f((Object)a, "context");
        this.a = a;
        this.b = kn6.b(a, 2131099946);
        this.c = kn6.b(a, 2131100721);
        this.d = d4j.i(a, 2130969093);
        this.e = (n4s)pps.n((nsb)new amj$c(this));
        this.f = (n4s)pps.n((nsb)new amj$a(this));
        this.g = (n4s)pps.n((nsb)new amj$b(this));
    }
    
    public final zlj a(final OpenCloseTimeNext openCloseTimeNext, final Weekday weekday, final int n, final int n2, final int n3) {
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
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.a.getString(n4), m5s.d());
        final Calendar instance = Calendar.getInstance();
        instance.set(11, hour);
        instance.set(12, minute);
        if (weekday != null) {
            instance.set(7, weekday.toJavaUtilCalenderValue());
        }
        final String format = simpleDateFormat.format(instance.getTime());
        czd.e((Object)format, "timeFormatter.format(displayTime.time)");
        final String string = this.a.getString(n);
        czd.e((Object)string, "context.getString(openClosedState)");
        final ylj ylj = new ylj(string, n3, true);
        final String string2 = this.a.getString(2131953873);
        czd.e((Object)string2, "context.getString(com.twitter.ui.R.string.en_dot)");
        final String string3 = this.a.getString(n2, new Object[] { format });
        czd.e((Object)string3, "context.getString(timeOfNextState, transitionText)");
        return new zlj(s9i.s(ylj, new ylj(hmg.h(string2, string3), null, false)));
    }
    
    public final zlj b() {
        return (zlj)this.g.getValue();
    }
}
