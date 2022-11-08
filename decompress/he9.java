import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class he9
{
    public final zdd<rd9> a;
    public final lyr<Boolean> b;
    
    public he9(final a a) {
        final ArrayList a2 = a.a;
        zdd a3;
        if (a2 != null) {
            a3 = new zdd((List)a2);
        }
        else {
            a3 = null;
        }
        this.a = (zdd<rd9>)a3;
        Object b = a.b;
        if (b == null) {
            b = new myr();
        }
        this.b = (lyr<Boolean>)b;
    }
    
    public static final class a
    {
        public List<rd9> a;
        public lyr<Boolean> b;
    }
}
