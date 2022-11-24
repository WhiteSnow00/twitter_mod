import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arl extends pue implements stb<Throwable, vzv>
{
    public final bti F0;
    
    public arl(final bti f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Throwable t = (Throwable)o;
        final m9a m9a = new m9a(this.F0.B.getId());
        m9a.b = new IllegalStateException("Invalid NotificationInfo");
        ((HashMap<String, Integer>)m9a.a).put("category", Integer.valueOf(this.F0.w));
        ((HashMap<String, String>)m9a.a).put("notificationInfo", this.F0.toString());
        r9a.c(m9a);
        return vzv.a;
    }
}
