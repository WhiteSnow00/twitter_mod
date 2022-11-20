import androidx.work.c$a$c;
import androidx.work.c$a;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ql8 extends ste implements ftb<List<? extends lsi>, List<? extends lsi>, c$a>
{
    public final ol8 D0;
    
    public ql8(final ol8 d0) {
        this.D0 = d0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final List list = (List)o;
        final List list2 = (List)o2;
        czd.f((Object)list, "delayPush");
        czd.f((Object)list2, "notificationsList");
        if (list.isEmpty() ^ true) {
            this.D0.b.a((lsi)mq4.g0(list), list2);
        }
        return new c$a$c();
    }
}
