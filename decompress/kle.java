import java.util.AbstractMap;
import java.util.Map;
import com.twitter.profilemodules.model.business.Weekday;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kle extends gjr<Weekday>
{
    static {
        new kle();
    }
    
    public kle() {
        final Weekday monday = Weekday.MONDAY;
        super((Object)monday, new Map.Entry[] { (Map.Entry)new AbstractMap.SimpleImmutableEntry("Monday", monday), (Map.Entry)new AbstractMap.SimpleImmutableEntry("Tuesday", Weekday.TUESDAY), (Map.Entry)new AbstractMap.SimpleImmutableEntry("Wednesday", Weekday.WEDNESDAY), (Map.Entry)new AbstractMap.SimpleImmutableEntry("Thursday", Weekday.THURSDAY), (Map.Entry)new AbstractMap.SimpleImmutableEntry("Friday", Weekday.FRIDAY), (Map.Entry)new AbstractMap.SimpleImmutableEntry("Saturday", Weekday.SATURDAY), (Map.Entry)new AbstractMap.SimpleImmutableEntry("Sunday", Weekday.SUNDAY) });
    }
}
