import java.util.Collection;
import java.util.ArrayList;
import java.util.Locale;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m3r
{
    public final List<String> a;
    public final List<Locale> b;
    
    public m3r(final a a) {
        this.a = new ArrayList(a.a);
        this.b = new ArrayList(a.b);
    }
    
    @Override
    public final String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.a, this.b);
    }
    
    public static final class a
    {
        public final List<String> a;
        public final List<Locale> b;
        
        public a() {
            this.a = new ArrayList();
            this.b = new ArrayList();
        }
    }
}
