import tv.periscope.android.api.Invitee;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eav extends ste implements qsb<List<Invitee>, List<? extends Invitee>>
{
    public static final eav D0;
    
    static {
        D0 = new eav();
    }
    
    public eav() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        czd.f((Object)list, "it");
        return mq4.M0((Iterable)list);
    }
}
