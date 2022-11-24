import java.util.Collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jmb
{
    public Set<ms> a;
    public Set<ms> b;
    public Set<String> c;
    public Map<String, List<ms>> d;
    
    public jmb() {
        this.a = EnumSet.noneOf(ms.class);
        this.b = EnumSet.noneOf(ms.class);
        this.c = new HashSet();
        this.d = new HashMap();
    }
    
    public static final class a
    {
        public final Set<ms> a;
        public final Set<ms> b;
        public final Set<String> c;
        public final Map<String, List<ms>> d;
        
        public a(final jmb jmb) {
            this.a = Collections.unmodifiableSet((Set<? extends ms>)EnumSet.copyOf((Collection<Enum>)jmb.a));
            this.b = Collections.unmodifiableSet((Set<? extends ms>)EnumSet.copyOf((Collection<Enum>)jmb.b));
            this.d = Collections.unmodifiableMap((Map<? extends String, ? extends List<ms>>)new HashMap<String, List<ms>>(jmb.d));
            this.c = Collections.unmodifiableSet((Set<? extends String>)new HashSet<String>(jmb.c));
        }
    }
}
