import java.util.ArrayList;
import java.util.List;
import com.twitter.profilemodules.model.business.Weekday;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kv2
{
    public final Weekday a;
    public List<sv2> b;
    
    public kv2(final Weekday a) {
        final ArrayList b = new ArrayList();
        zzd.f((Object)a, "day");
        this.a = a;
        this.b = b;
    }
    
    public kv2(final Weekday a, final List<sv2> b) {
        zzd.f((Object)a, "day");
        this.a = a;
        this.b = b;
    }
    
    public final boolean a() {
        return this.b.isEmpty() ^ true;
    }
    
    public final boolean b() {
        return this.b.isEmpty();
    }
}
