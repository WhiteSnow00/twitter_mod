import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class se9
{
    public final ded<ce9> a;
    public final zzr<Boolean> b;
    
    public se9(final a a) {
        final ArrayList a2 = a.a;
        ded a3;
        if (a2 != null) {
            a3 = new ded((List)a2);
        }
        else {
            a3 = null;
        }
        this.a = (ded<ce9>)a3;
        Object b = a.b;
        if (b == null) {
            b = new a0s();
        }
        this.b = (zzr<Boolean>)b;
    }
    
    public static final class a
    {
        public List<ce9> a;
        public zzr<Boolean> b;
    }
}
