import com.twitter.profilemodules.model.business.Weekday;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xv2
{
    public static final a Companion;
    public static final Map<Weekday, Integer> b;
    public final fw2 a;
    
    static {
        Companion = new a();
        b = vkg.k1(new gvj[] { new gvj((Object)Weekday.MONDAY, (Object)2131955162), new gvj((Object)Weekday.TUESDAY, (Object)2131959118), new gvj((Object)Weekday.WEDNESDAY, (Object)2131959631), new gvj((Object)Weekday.THURSDAY, (Object)2131958720), new gvj((Object)Weekday.FRIDAY, (Object)2131954174), new gvj((Object)Weekday.SATURDAY, (Object)2131957373), new gvj((Object)Weekday.SUNDAY, (Object)2131958587) });
    }
    
    public xv2(final fw2 a) {
        zzd.f((Object)a, "timeFormatter");
        this.a = a;
    }
    
    public static final class a
    {
    }
}
