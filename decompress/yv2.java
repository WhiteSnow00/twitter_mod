import java.text.SimpleDateFormat;
import java.util.Calendar;
import android.text.format.DateFormat;
import com.twitter.profilemodules.model.business.HourMinute;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yv2
{
    public final Context a;
    
    public yv2(final Context a) {
        czd.f((Object)a, "context");
        this.a = a;
    }
    
    public final String a(final HourMinute hourMinute) {
        czd.f((Object)hourMinute, "hourMinute");
        int n;
        if (DateFormat.is24HourFormat(this.a)) {
            n = 2131953006;
        }
        else {
            n = 2131953016;
        }
        final Calendar instance = Calendar.getInstance();
        instance.set(11, hourMinute.getHour());
        instance.set(12, hourMinute.getMinute());
        final String format = new SimpleDateFormat(this.a.getString(n), m5s.d()).format(instance.getTime());
        czd.e((Object)format, "timeFormatter.format(displayTime.time)");
        return format;
    }
}
