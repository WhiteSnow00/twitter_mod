import java.util.Iterator;
import java.util.NoSuchElementException;
import com.twitter.profilemodules.model.business.HourMinute;
import java.util.ArrayList;
import com.twitter.profilemodules.model.business.Weekday;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cv2
{
    public static final a Companion;
    public static final List<Weekday> b;
    public final List<dv2> a;
    
    static {
        Companion = new a();
        final List i1 = ct0.i1((Object[])Weekday.values());
        final Weekday sunday = Weekday.SUNDAY;
        final ArrayList b2 = (ArrayList)i1;
        b2.remove(sunday);
        cv2.b = b2;
    }
    
    public cv2(final List<dv2> a) {
        this.a = a;
    }
    
    public final lv2 a() {
        return new lv2(new HourMinute(9, 0), new HourMinute(17, 0));
    }
    
    public final dv2 b(final Weekday weekday) {
        for (final dv2 dv2 : this.a) {
            if (dv2.a == weekday) {
                return dv2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
    
    public static final class a
    {
    }
}
